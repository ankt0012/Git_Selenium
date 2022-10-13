package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTheAlignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/pk0200/Desktop/DemoPageFor3PmBatch.html");

		Point usernameloc = driver.findElement(By.xpath("//input[@type='text'][1]")).getLocation();
		// Point passwordloc =
		// driver.findElement(By.xpath("//input[@type='text'][1]")).getLocation();

		int usernameStartX = usernameloc.getX();
		int passwordStartX = usernameloc.getX();

		if (usernameStartX == passwordStartX) {
			System.out.println("pass: the startX of texTfields are aligned and verified");
		} else {
			System.out.println("fail: the startX of texTfields are aligned and verified");
		}
		driver.quit();

	}
}
