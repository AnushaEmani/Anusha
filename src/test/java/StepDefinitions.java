import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.hc.core5.util.Asserts;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.CheckOutPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.ShoppingCartPage;

import java.util.concurrent.TimeUnit;

public class StepDefinitions extends TestRunner {

    HomePage homePage;
    ShoppingCartPage shoppingCartPage;
    LoginPage loginPage;
    CheckOutPage checkOutPage;

    @Before
    public void start() {


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        //WebDriverWait wait = new WebDriverWait(driver, 3000);
        homePage = new HomePage(driver);
        shoppingCartPage = new ShoppingCartPage(driver);
        loginPage = new LoginPage(driver);
        checkOutPage = new CheckOutPage(driver);
    }

    @After

    public void stop(Scenario scenario) {
        //   if(scenario.isFailed())

        byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshotBytes, "image/png");


    }


    @Given("user is in home page")
    public void user_is_in_home_page() {
        homePage.gotoHomePage();
    }

    @When("he added an item to the cart")
    public void he_added_an_item_to_the_cart() {
        homePage.AddFirstItemToCart();
    }

    @When("go to cart")
    public void go_to_cart() throws InterruptedException {
        //driver.navigate().refresh();
        shoppingCartPage.gotoShoppingCartPage();
        Thread.sleep(3000);
        driver.navigate().refresh();

    }

    @When("checkout from the cart")
    public void checkout_from_the_cart() {
        shoppingCartPage.clickTermsOfService();
        shoppingCartPage.clickCheckoutButton();

    }

    @And("login to the application with email  {string}")
    public void loginToTheApplicationWithEmail(String email)
    {
        loginPage.enterEmail(email);

    }

    @And("with password  {string}")
    public void withPassword(String password) {
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();

        shoppingCartPage.clickTermsOfService();
        shoppingCartPage.clickCheckoutButton();

    }


    @When("set  billing address")
    public void set_billing_address()
    {
        /*checkOutPage.SelectCountry();
        checkOutPage.SelectCity();
        checkOutPage.SelectAddress();
        checkOutPage.SelectPostCode();
        checkOutPage.SelectPhoneNumber();

         */
        checkOutPage.clickContinueButton1();


    }

    @When("set shipping method as 2nd day air")
    public void set_shipping_method_as_2nd_day_air() throws InterruptedException {
        Thread.sleep(3000);
        checkOutPage.set2ndShippingOption();
        checkOutPage.clickContinueButton3();

    }

    @When("set default payment method")
    public void set_default_payment_method() throws InterruptedException {
        Thread.sleep(3000);
        checkOutPage.clickContinueButton4();


    }

    @When("continue in payment")
    public void continue_in_payment() throws InterruptedException {
        Thread.sleep(3000);
        checkOutPage.clickContinueButton5();

    }

    @When("confirm the order")
    public void confirm_the_order() throws InterruptedException {
        Thread.sleep(3000);
        checkOutPage.clickConfirmButton();
        WebDriverWait wait = new WebDriverWait(driver,30);
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Confirm']")));
        // byte[] screenshotBytes=((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        //scenario.embed(screenshotBytes, "image/png");
    }


    @Then("the order confirmation screen with message is shown {string}")
    public void the_order_confirmation_screen_with_message_is_shown(String expectedText) throws InterruptedException {
        Thread.sleep(3000);
        String actualText = (driver.findElement(By.xpath("(//div[@class='title']/strong)[1]"))).getText();
        Assertions.assertEquals(actualText,expectedText);
        System.out.println(actualText);


    }



}
