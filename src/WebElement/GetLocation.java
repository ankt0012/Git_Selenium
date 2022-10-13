package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/pk0200/Desktop/DemoPageFor3PmBatch.html");
		
		Point loc = driver.findElement(By.xpath("//input[@type='text'][1]")).getLocation();
		System.out.println(loc);
		
		int startX = loc.getX();
		int startY = loc.getY();
System.out.println("the startX is"+startX);
System.out.println("the startY is"+startY);
	}

}
