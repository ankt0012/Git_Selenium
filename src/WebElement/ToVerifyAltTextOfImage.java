package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyAltTextOfImage {

	public static void main(String[] args) {
		String expectedAltTextOfImage = "HP DeskJet 2331 Multi-function Color Printer";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String actualAltTextOfImage = driver.findElement(By.xpath("//img[contains(@src,'https://rukminim1.flixcart.com/image/612/612/korijrk0/printer/c/s/f/deskjet-2331-hp-original-imag356w4gyxzjza.jpeg?q=70')]")).getAttribute("alt");
		
           if(actualAltTextOfImage.contains(expectedAltTextOfImage))
           {
        	System.out.println("Pass : The Alt Text Is Verified");   
           }
           else
        	   System.out.println("Fail: The Alt Text Is not Verified");
           }
	}


