package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVeriftTheSpace {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/pk0200/Desktop/DemoPageFor3PmBatch.html");
		Rectangle usernmameRect = driver.findElement(By.id("id1")).getRect();
		Rectangle passwordRect = driver.findElement(By.name("name1")).getRect();
		
		int usernmameEndY = usernmameRect.getY()+usernmameRect.getHeight();
		int passwordStartY = passwordRect.getY();
		
		
		int space = passwordStartY - usernmameEndY;
		System.out.println(space);
		
	}

}
