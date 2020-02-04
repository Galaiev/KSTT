package TradeTech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class mainTradePage {

    WebDriver driver;
    WebDriverWait wait;

    public mainTradePage (WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, 10);
    }
    @FindBy(css = "[class=\"instrument-details__price\"]")
    private WebElement instrumentPrice;

    By element_price = By.cssSelector("[class=\"instrument-details__price\"]");

    public void waitPrice () {
        wait.until(ExpectedConditions.visibilityOfElementLocated(element_price));
    }
}
