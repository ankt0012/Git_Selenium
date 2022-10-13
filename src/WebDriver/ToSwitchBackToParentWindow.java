package WebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchBackToParentWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String parentWindowId = driver.getWindowHandle();
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> allWindowIDs = driver.getWindowHandles();
		for (String id : allWindowIDs) {

			driver.switchTo().window(parentWindowId);
			if (!id.equals(parentWindowId)) {
				driver.findElement(By.linkText("Try Free")).click();
				break;
			}

		}
		driver.switchTo().window(parentWindowId);
		driver.findElement(By.linkText("keepLoggedInCheckBox")).click();
	}
}
