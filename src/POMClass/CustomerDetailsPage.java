package POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerDetailsPage {

    public CustomerDetailsPage(WebDriver driver){
        PageFactory.initElements(driver, this);

    }
    String customerNameGiven;

    @FindBy(xpath = "//div[@title='Ankit001223']")
    private WebElement actualCustomerName;

    public WebElement getActualCustomerName() {
        return actualCustomerName;
    } 
   
    public String verifyCustomerName(){
        return actualCustomerName.getText();
    }

   

  
}
