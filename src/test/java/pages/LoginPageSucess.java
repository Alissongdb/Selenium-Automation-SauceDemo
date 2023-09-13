package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import support.Utils;

public class LoginPageSucess extends Utils {
    private String username = "Admin";
    private String password = "admin123";

    WebDriver driver;
    public LoginPageSucess(WebDriver driver) {
        this.driver = driver;
    }

    public void accessWebsite() {

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        waitElementBePresent(By.name("username"), 10);
        Assert.assertEquals(true, driver.findElement(By.name("username")).isDisplayed());
    }

    public void fillFieldUserName() {

        driver.findElement(By.name("username")).sendKeys(username);

    }

    public void fillFieldPassword() {

        driver.findElement(By.name("password")).sendKeys(password);
    }

    public void loginButtonClick() {

        driver.findElement(By.cssSelector("#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > form > div.oxd-form-actions.orangehrm-login-action > button")).click();
    }

    public void loginSuccess() {

        waitElementBePresent(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-navigation > header > div.oxd-topbar-header > div.oxd-topbar-header-title > span > h6"), 10);
        WebElement element =  driver.findElement(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-navigation > header > div.oxd-topbar-header > div.oxd-topbar-header-title > span > h6"));
        boolean elementVisible = element.isDisplayed();
        System.out.println("O elemento está visivel " + elementVisible);
    }
}

