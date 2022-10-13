package WebElement;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyDispalyOrNot {

	private static final String Fail = null;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
		Thread.sleep(5000);
		/*
		 * Thread.sleep(); is present i.e. Pass the element is dispalyed
		 * Thread.sleep(); is not present i.e. Fail the element is not dispalyed
		 * 
		 */
		boolean displayed = driver.findElement(By.id("email")).isDisplayed();
		if (displayed) {
			System.out.println("Pass : The element is Displayed");
		} else
			System.out.println("Fail : The element is not Displayed");

	}

}
