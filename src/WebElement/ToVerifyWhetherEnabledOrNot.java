package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyWhetherEnabledOrNot 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
		Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys("praveenkumar4158@gmail.com");
		Thread.sleep(5000);
		boolean enabled = driver.findElement(By.xpath("//input[@id='email']/ancestor::div[@class='d-flex flex-items-center flex-column flex-sm-row']/descendant::button")).isEnabled();
		if(enabled)
		{
			System.out.println("Pass: The element is enabled");
		}
		else
			System.out.println("Fail: The element is not enabled");
		}
		

	}


