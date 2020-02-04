package TradeTech;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaFixture {

    public WebDriver driver;

    @Before
    public void setUp () {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
        driver = new ChromeDriver();
    }

    @After
    public void tearDown () {
        driver.close();
    }

}
