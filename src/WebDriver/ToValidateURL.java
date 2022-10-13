package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ToValidateURL 
{


		public static void main(String[] args)
	{
		String expectedURL = "google";
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		
		String actualURL = driver.getCurrentUrl();
		
		System.out.println(actualURL);
		if(actualURL.contains(expectedURL))
		{
			System.out.println("Pass:  The URL is verified");
			
		}
		else
	    System.out.println("Fail: THe URL is not verified");
	   
					
					
					

	}

}
