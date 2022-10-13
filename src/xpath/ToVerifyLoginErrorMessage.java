package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyLoginErrorMessage {

	public static void main(String[] args) throws InterruptedException {
		String expectederrormesg = "Username or Password is invalid. Please try again.";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(2000);
		String actualerrormesg = driver.findElement(By.xpath("//span[text()='Username or Password is invalid. Please try again.']")).getText();
        
		if(actualerrormesg.contains(expectederrormesg))
		{
			System.out.println("pass: error mesg is verified");
		}
		else
		{
			System.out.println("fail: error mesg is not verified");
		}
	}

}
