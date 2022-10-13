
 package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ToVerifyTheTitle
{
    public static void main(String[] args)
    {
    String expectedTitle = "instagram";
    System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
    WebDriver driver= new FirefoxDriver();
	driver.get("https://www.instagram.com/");
	
	String actualTitle = driver.getTitle();
	 System.out.println(actualTitle);
	
	    if(actualTitle.equals(expectedTitle))
	    {
	
	         System.out.println(" Pass: the title is verifird");		
	    }
	   
	    	
	    else
	
		System.out.println("Fail: the Title is not verified");
	 }
}

