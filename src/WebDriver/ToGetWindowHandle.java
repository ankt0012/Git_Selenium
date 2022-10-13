package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetWindowHandle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		String windowID = driver.getWindowHandle();

		System.out.println(windowID);

		WebDriver driver2 = new ChromeDriver();
		driver2.manage().window().maximize();
		driver2.get("https://www.facebook.com/");
		String windowID2 = driver2.getWindowHandle();
		System.out.println(windowID2);

	}

}
