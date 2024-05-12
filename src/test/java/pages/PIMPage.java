package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PIMPage {
    @FindBy(className = "oxd-main-menu-item" )
    List<WebElement> menuItems ;
    @FindBy(css = "[type=\"button\"]")
//    @FindBy(className = "oxd-button--secondary")
    List<WebElement> button;
    @FindBy(name = "firstName")
//    @FindBy(css = "[name=\"firstName\"]")
    WebElement txtFirstName;
    @FindBy(name = "lastName")
//    @FindBy(css = "[name=\"lastName\"]")
    WebElement txtLastName;
    @FindBy(className = "oxd-switch-input")
//    @FindBy(className = "oxd-switch-input oxd-switch-input--active --label-right")
    WebElement toggleButton;
    @FindBy(className = "oxd-input")
    List<WebElement> txtFields;
    @FindBy(css = "[type=\"submit\"]")

    WebElement buttonSubmit ;
//    @FindBy(css = "[class=\"oxd-input oxd-input--active\"]")
//
//    List<WebElement> txtEmployeeId ;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")
    WebElement bloodGroup;



    public PIMPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public  void createUser(String firstName, String lastName, String username, String password) throws InterruptedException {
        menuItems.get(1).click(); //click on pim button
//        Thread.sleep(2000);
        button.get(3).click(); // click on add button
//        Thread.sleep(2000);
        txtFirstName.sendKeys(firstName);
        txtLastName.sendKeys(lastName);
//        txtEmployeeId.get(1).sendKeys(employeeID);
        toggleButton.click();
        txtFields.get(5).sendKeys(username); //insert username
        txtFields.get(6).sendKeys(password); //insert password
        txtFields.get(7).sendKeys(password); //insert confirm password
//        button.get(1).click(); //click submit button
        buttonSubmit.click();

    }





}
