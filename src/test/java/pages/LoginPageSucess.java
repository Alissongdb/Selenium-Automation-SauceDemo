package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import support.Utils;

public class LoginPageSucess extends Utils {
    private String username = "standard_user";
    private String password = "secret_sauce";

    WebDriver driver;
    public LoginPageSucess(WebDriver driver) {
        this.driver = driver;
    }

    public void accessWebsite() {

        driver.get("https://www.saucedemo.com/");
        waitElementBePresent(By.className("login_logo"), 10);
        Assert.assertEquals(true, driver.findElement(By.className("login_logo")).isDisplayed());
    }

    public void fillFieldUserName() {

        driver.findElement(By.id("user-name")).sendKeys(username);

    }

    public void fillFieldPassword() {

        driver.findElement(By.id("password")).sendKeys(password);
    }

    public void loginButtonClick() {

        WebElement buttonLoginClick = driver.findElement(By.id("login-button"));
        buttonLoginClick.click();
    }

    public void loginSuccess() {

        waitElementBePresent(By.className("title"), 10);
        WebElement titleVisible = driver.findElement(By.className("title"));

        // Validando que o elemento está visível apontando o assert para uma variável
        String msgValidacao = String.valueOf(titleVisible.isDisplayed());
        System.out.println("O elemento title está visível - " + msgValidacao);
    }
}

