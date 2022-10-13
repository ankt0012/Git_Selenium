package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseConatinsFunction {

	public static void main(String[] args) {
		String xpectederrormesg = "Username";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String text = driver.findElement(By.xpath("//nobr[text()='actiTIME 2020 Online']")).getText();
		System.out.println(text);

	}

}
