package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "Email")
    WebElement emailTextBox;

    public void enterEmail(String email)
    {
        emailTextBox.sendKeys("anushaemani@test.com");
    }

    @FindBy(id = "Password")
    public WebElement passwordTextBox;

    public void enterPassword(String password)
    {
        passwordTextBox.sendKeys("testing");
    }

    @FindBy(xpath = "//input[@value='Log in']")
    WebElement LoginButton;

    public void clickLoginButton()
    {
        LoginButton.click();
    }
}
