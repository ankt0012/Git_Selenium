package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolutexpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/pk0200/Desktop/DemoPageFor3PmBatch1.html");
		driver.findElement(By.xpath("./html/body/div[1]/input[1]")).clear();
		driver.findElement(By.xpath("//div[1]/input[1]")).sendKeys("Qspiders");
		
	}
	

}
