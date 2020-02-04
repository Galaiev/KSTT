package TradeTech;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginFormTest extends JavaFixture {

    String login = "sgalaiev@gmail.com";
    String password = "Pas3313804014";

    @Test
    public void testLoginForm() {
        loginFormPage loginFormpage = PageFactory.initElements(driver, loginFormPage.class);
        loginFormpage.open();
        loginFormpage.fillLoginName(login);
        loginFormpage.fillLoginPassword(password);
        loginFormpage.clickSubmitButton();
        mainTradePage mainTradepage = PageFactory.initElements(driver, mainTradePage.class);
        mainTradepage.waitPrice();




////
////        WebElement login_password = driver.findElement(By.cssSelector("[type=\"password\"]"));
////        login_password.sendKeys(password);
////        WebElement submit = driver.findElement(By.id("auth-button-login"));
////        submit.click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("instrument-details__price")));

    }
}
