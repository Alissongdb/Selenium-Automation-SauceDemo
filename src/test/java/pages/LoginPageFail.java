package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import support.Utils;

public class LoginPageFail extends Utils {

    private String usernameFail = "Adminn";
    private String passwordFail = "admin1234";

    WebDriver driver;

    public LoginPageFail(WebDriver driver) {
        this.driver = driver;
    }

    public void accessWebsite() {

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        waitElementBePresent(By.name("username"), 10);
        Assert.assertEquals(true, driver.findElement(By.name("username")).isDisplayed());
    }

    public void fillFieldUsernameFail() {

        driver.findElement(By.name("username")).sendKeys(usernameFail);
    }

    public void fillFieldPasswordFail() {

        driver.findElement(By.name("password")).sendKeys(passwordFail);
    }

    public void loginButtonClick() {

        driver.findElement(By.cssSelector("#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > form > div.oxd-form-actions.orangehrm-login-action > button")).click();
    }

    public void loginFail() {

        waitElementBePresent(By.cssSelector("#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > div > div.oxd-alert.oxd-alert--error > div.oxd-alert-content.oxd-alert-content--error > p"), 10);
        WebElement element =  driver.findElement(By.cssSelector("#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > div > div.oxd-alert.oxd-alert--error > div.oxd-alert-content.oxd-alert-content--error > p"));
        boolean elementVisible = element.isDisplayed();
        System.out.println("O elemento está visivel " + elementVisible);
    }

}
