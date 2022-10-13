package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLoginUsingKeyBoardSimulation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement usernameTextfield = driver.findElement(By.id("username"));
		WebElement passwordTextfield = driver.findElement(By.name("pwd"));
		usernameTextfield.sendKeys("trainee");
		Thread.sleep(2000);
		usernameTextfield.sendKeys(Keys.CONTROL,"a");
		Thread.sleep(2000);
	
		usernameTextfield.sendKeys(Keys.CONTROL,"c");
		Thread.sleep(2000);
		passwordTextfield.sendKeys(Keys.CONTROL,"v");
		Thread.sleep(2000);
		passwordTextfield.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

	}

}
