package TradeTech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginFormPage {
    WebDriver driver;
    WebDriverWait wait;

    public loginFormPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, 10);
    }

    @FindBy(css = "[type=\"email\"]")
    private WebElement loginEmail;

    @FindBy(css = "[type=\"password\"]")
    private WebElement loginPassword;

    @FindBy(css ="[id=\"auth-button-login\"]")
    private WebElement submitButtton;

    private By login_email = By.cssSelector("[type=\"email\"]");

    public void open () {
        driver.get("https://live-cosmos.tradetech-group.com/trading-platform/#login");
        wait.until(ExpectedConditions.visibilityOfElementLocated(login_email));
    }
    public void fillLoginName (String l_email) {
        loginEmail.sendKeys(l_email);
    }
    public void fillLoginPassword (String l_pasword) {
        loginPassword.sendKeys(l_pasword);
    }
    public void clickSubmitButton () {
        submitButtton.click();
    }
}