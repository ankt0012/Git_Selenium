package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DependantAndIndependantXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=iphonr%2011&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		String text = driver.findElement(By.xpath("//div[.=\"APPLE iPhone 11 (White, 128 GB)\"]/../..//div[text()='₹54,900']")).getText();
         System.out.println(text);
	}

}
