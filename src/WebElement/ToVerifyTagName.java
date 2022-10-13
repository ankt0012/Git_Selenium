package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTagName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement usernameElement = driver.findElement(By.id("username"));
        String usernameTagName = usernameElement.getTagName();
        if(usernameTagName.equals("input"))
        {
        	usernameElement.sendKeys("admin");
        }
        
        WebElement passwordElement = driver.findElement(By.name("pwd"));
        String passwordTagName = passwordElement.getTagName();
        if(passwordTagName.equals("input"))
        {
        passwordElement.sendKeys("manager");
        }
        WebElement LoginButtonElement = driver.findElement(By.xpath("//div[text()='Login ']"));
        String LoginButtonTagName = LoginButtonElement.getTagName();
        if(LoginButtonTagName.equals("div"))
        {
        	LoginButtonElement.click();
        }
        }
	}




