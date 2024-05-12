package testrunner;

import config.Setup;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTestRunner extends Setup {
    LoginPage loginPage ;
    @Test(priority = 1, groups = "smoke" , description = "Login with wrong credentials")
    public void doLoginWithWrongCred(){
        loginPage = new LoginPage(driver);
        loginPage.doLogin("Admin", "admin12345");
        String checkActual = driver.findElement(By.className("oxd-alert-content-text")).getText();
        String checkExpected = "Invalid credentials";
        Assert.assertEquals(checkActual,checkExpected);
    }

    @Test(priority = 2, groups = "smoke" , description = " Admin can login")
    public void doLogin(){
        loginPage = new LoginPage(driver);
        loginPage.doLogin("Admin", "admin123");
        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
        boolean isImageExists = driver.findElement(By.className("oxd-userdropdown-img")).isDisplayed();
        Assert.assertTrue(isImageExists);
    }

    @Test(priority = 3, groups = "smoke", description = "Admin can log out")
    public void doLogout(){
        loginPage = new LoginPage(driver);
        loginPage.doLogout();
        String loginButtonSubmitActual = driver.findElement(By.cssSelector("[type=\"submit\"]")).getText();
        String loginButtonSubmitExpected = "Login";
        Assert.assertEquals(loginButtonSubmitActual,loginButtonSubmitExpected);
    }
}
