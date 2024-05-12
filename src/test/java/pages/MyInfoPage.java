package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MyInfoPage {
    @FindBy(className = "oxd-main-menu-item" )
    List<WebElement> menuItems ;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input[1]")
    WebElement textField ;

    @FindBy(css="[type=\'submit\']")
    List<WebElement> submitButton ;





    public MyInfoPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void changeTextField(){
        menuItems.get(2).click();
        textField.sendKeys("Amit");
        submitButton.get(1).click();
    }
}
