package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage
{
    WebDriver driver;

    public ShoppingCartPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void gotoShoppingCartPage()
    {
        driver.get("http://twentyconsulting-001-site1.dtempurl.com/cart");
    }

    @FindBy(name = "termsofservice")
    WebElement TermsOfService;

    public void clickTermsOfService()
    {
        TermsOfService.click();
    }

    @FindBy(id = "checkout")
    WebElement CheckoutButton;

    public void clickCheckoutButton()
    {
        CheckoutButton.click();
    }










}
