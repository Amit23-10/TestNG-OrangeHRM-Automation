package testrunner;

import config.Setup;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MyInfoPage;
import utils.Utils;

import java.io.IOException;

public class UserTestRunner extends Setup {
    LoginPage loginPage;
    MyInfoPage myInfoPage;

    @Test(priority = 1 , groups = "smoke" ,description = "User can login with new credentials")

    public void doLogin() throws IOException, ParseException {
        loginPage = new LoginPage(driver);
        String username = Utils.getUser().get("username").toString();
        String password = Utils.getUser().get("password").toString();
        loginPage.doLogin(username, password);
        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
        boolean isImageExists = driver.findElement(By.className("oxd-userdropdown-img")).isDisplayed();
        Assert.assertTrue(isImageExists);
    }
    @Test(priority = 2 , groups = "smoke", description = "User can change text field")

    public void changeTextField(){
        myInfoPage = new MyInfoPage(driver);
        myInfoPage.changeTextField();
    }
    @Test(priority = 3 , groups = "smoke", description = "User can log out the session")
    public void doLogout(){
        loginPage = new LoginPage(driver);
        loginPage.doLogout();
        String loginButtonSubmitActual = driver.findElement(By.cssSelector("[type=\"submit\"]")).getText();
        String loginButtonSubmitExpected = "Login";
        Assert.assertEquals(loginButtonSubmitActual,loginButtonSubmitExpected);
    }

}
