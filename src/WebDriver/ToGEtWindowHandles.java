package WebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGEtWindowHandles {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");

		String parentWindowId = driver.getWindowHandle();
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> allWindowIDs = driver.getWindowHandles();

		for (String id : allWindowIDs) {
			driver.switchTo().window(id);

			if (!id.equals(parentWindowId)) {
				driver.findElement(By.linkText("Try Free")).click();
				break;

			}

		}

	}

}
