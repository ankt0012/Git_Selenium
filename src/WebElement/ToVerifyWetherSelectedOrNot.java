package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyWetherSelectedOrNot
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement element = driver.findElement(By.id("keepLoggedInCheckBox"));
		element.click();
		/*element.click() is removed then condition is failed
		element.click() is not removed then condition is passed*/
		boolean selected = element.isSelected();
		if(selected)
		{
		System.out.println("Pass: The element");
		}
	    else
	
		System.out.println("Fail: The element");
	}
}
	



