package webDriver;



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToMaximizeWindow
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Options manage = driver.manage();
		Window window = driver.manage().window();
		window.maximize();
		

	}

	}


