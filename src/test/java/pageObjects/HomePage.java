package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
    WebDriver driver;

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void gotoHomePage()
    {
        driver.get("http://twentyconsulting-001-site1.dtempurl.com/");
    }

    @FindBy(linkText = "Log in")
    public WebElement loginLink;

    public void clickLoginLink()
    {
        loginLink.click();
    }
    @FindBy(xpath = "//input[@class='button-2 product-box-add-to-cart-button']")
    public WebElement addToCartButton;

    public void AddFirstItemToCart()
    {
        addToCartButton.click();
    }





}
