package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetRec 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/pk0200/Desktop/DemoPageFor3PmBatch.html");
		
		 Rectangle rect = driver.findElement(By.xpath("//input[@type='text'][1]")).getRect();
		 int endX = rect.getX()+rect.getWidth();
		 System.out.println("The EndX is "+endX);
		 driver.quit();

	}

}
