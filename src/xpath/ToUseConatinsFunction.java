package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseConatinsFunction {

	public static void main(String[] args) {
		String expectedMsg = "Username";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String actualMsg = driver.findElement(By.xpath("//nobr[text()='actiTIME 2020 Online']")).getText();
		if (actualMsg.contains(expectedMsg)) {
			System.out.println("Pass : the expected message is same in automated screen");
		} else {
			System.out.println("Fail : the expected message is not same in automated screen");
		}

	}

}
