package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTheOverlappingIssue {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Rectangle usernmameRect = driver.findElement(By.id("username")).getRect();
		Rectangle passwordRect = driver.findElement(By.name("pwd")).getRect();

		int usernmameEndY = usernmameRect.getY() + usernmameRect.getHeight();
		int passwordStartY = passwordRect.getY();

		if (passwordStartY >= usernmameEndY) {
			System.out.println("Pass : The textfield is overlapping");
		} else
			System.out.println("FAIL : The textfield is not overlapping");
	}
}
