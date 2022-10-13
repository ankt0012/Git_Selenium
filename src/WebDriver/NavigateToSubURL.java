package webDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToSubURL {

	public static void main(String[] args) throws MalformedURLException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); 
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.google.co.in/");
		
		URL url = new URL("https://www.instagram.com/");
		driver.navigate().to(url);// to method is used to navigate sub URL
		driver.quit();//used to close all window and also the server
		
	}

}

//WebDriver Execption - It is an unchecked execption of selenium which occurs when the internet connection is disconnected when you are trying to execute your test script. 