package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToIdentifyUsingId {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/pk0200/Desktop/DemoPageFor3PmBatch.html");
		driver.findElement(By.id("id1")).sendKeys("praveen");

	}

}
