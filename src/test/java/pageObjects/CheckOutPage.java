package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage
{
    WebDriver driver;

    public CheckOutPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "BillingNewAddress_CountryId")
    public WebElement Country;

    public void SelectCountry()
    {
        Select city = new Select(driver.findElement(By.id("BillingNewAddress_CountryId")));
        city.selectByVisibleText("United Kingdom");

    }
    @FindBy(id = "BillingNewAddress_City")
    public WebElement City;

    public void SelectCity()
    {
        City.sendKeys("Liverpool");
    }
    @FindBy(id = "BillingNewAddress_Address1")
    public WebElement Address;
    public void SelectAddress()
    {
        Address.sendKeys("Hamilton road");
    }

    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    public WebElement PostCode;
    public void SelectPostCode()
    {
        PostCode.sendKeys("L5 4RT");
    }

    @FindBy(id = "BillingNewAddress_PhoneNumber")
    public WebElement PhoneNumber;
    public void SelectPhoneNumber()
    {
        PhoneNumber.sendKeys("07455292100");
    }




    @FindBy(xpath = "(//input[@value='Continue'])[1]")
    public WebElement continueButton1;
    public void clickContinueButton1()
    {
        continueButton1.click();
    }

    @FindBy(id = "shippingoption_2")
    public WebElement setShippingOption;
    public void set2ndShippingOption()
    {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setShippingOption.click();
    }

    @FindBy(xpath = "(//input[@value='Continue'])[3]")
    public WebElement continueButton3;
    public void clickContinueButton3()
    {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        continueButton3.click();
    }

    @FindBy(xpath = "(//input[@value='Continue'])[4]")
    public WebElement continueButton4;
    public void clickContinueButton4()
    {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        continueButton4.click();
    }

    @FindBy(xpath = "(//input[@value='Continue'])[5]")
    public WebElement continueButton5;
    public void clickContinueButton5()
    {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        continueButton5.click();
    }

    @FindBy(xpath = "//input[@value='Confirm']")
    public WebElement confirmButton;
    public void clickConfirmButton()
    {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        confirmButton.click();
    }

}
