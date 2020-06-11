import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

@CucumberOptions(features = {"src/test/resources/PlacingOrder.feature"},
        //glue = {""},
        plugin = {"json:target/cucumber.json","html:target/site/cucumber-pretty"})
@RunWith(Cucumber.class)
public class TestRunner
{
    static WebDriver driver;
    public static final String USERNAME = "anushaemani1";
    public static final String AUTOMATE_KEY = "kfzhi7vgfxN8y7VQeQX5";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
    @BeforeClass
    public static void startBrowser()
    {
      //  WebDriverManager.chromedriver().setup();
       // driver = new ChromeDriver();
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browser", "Chrome");
        caps.setCapability("browser_version", "83.0");
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "10");
        caps.setCapability("resolution", "1024x768");
      //  caps.setCapability("name", "Bstack-[Java] Sample Test");
       // DesiredCapabilities caps = new DesiredCapabilities();
     //   caps.setCapability("browser", "Chrome");
       // caps.setCapability("browser_version", "84.0 beta");
        //caps.setCapability("os", "OS X");
        //caps.setCapability("os_version", "Catalina");
        //caps.setCapability("resolution", "1024x768");
        caps.setCapability("name", "Anusha Test");

        try {
            driver = new RemoteWebDriver(new URL(URL), caps);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }


    }

    @AfterClass
    public static void stopBrowser()
    {
        driver.quit();

    }

}
