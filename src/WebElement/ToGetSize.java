package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetSize 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/pk0200/Desktop/DemoPageFor3PmBatch.html");
		
		Dimension dim = driver.findElement(By.xpath("//input[@type=\"text\"][1]")).getSize();
		System.out.println(dim);
		int width = dim.getWidth();
		int height = dim.getHeight();
		System.out.println("The height of username textfield: "+height);
		System.out.println("The height of username textfield: "+width);
		
		
		

	}

}
