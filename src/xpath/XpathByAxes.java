package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAxes {

	public static void main(String[] args) {
		String productName = "JBL Charge 4, Wireless Portable Bluetooth Speaker, JBL Signature Sound with Powerful Bass Radiator, 7500mAh Built-in Powerbank, JBL Connect+, IPX7 Waterproof, AUX & Type C (Without Mic, Blue)";
		String price = "10,999";
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/s?k=jbl+charger+4&crid=Y1YFIULMW0L4&sprefix=jbl+charger+4%2Caps%2C382&ref=nb_sb_noss_1");
		String text = driver.findElement(By.xpath("//span[contains(text(),'"+productName+"')]/ancestor::div[@class=\"a-section a-spacing-small a-spacing-top-small\"]/descendant::span[text()='"+price+"']")).getText();
		System.out.println(text);

	}

}
