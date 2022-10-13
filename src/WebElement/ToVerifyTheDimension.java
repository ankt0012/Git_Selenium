package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTheDimension {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/pk0200/Desktop/DemoPageFor3PmBatch.html");
		   Dimension usernameTextField = driver.findElement(By.xpath("//input[@type='text'][1]")).getSize();
		   Dimension passwordTextField = driver.findElement(By.id("//input[@type='text'][2]")).getSize();
		   
		  int usernameTxtFieldHeight=usernameTextField.getHeight();
		  int usernameTxtFieldWidth=usernameTextField.getWidth();
		  
		  int passwordTxtFieldHeight=  passwordTextField.getHeight();
		  int passwordTxtFieldWidth=  passwordTextField.getWidth();
		 
		if(usernameTxtFieldHeight ==passwordTxtFieldHeight && usernameTxtFieldWidth==passwordTxtFieldWidth)
		  {
			System.out.println("Pass : The dimension of username and password textfield are verifield");  
		  }
		  else
		  {
			  System.out.println("Fail : The dimesnion of username and password textfield are verified");
		  }
		  driver.quit();
		  }
		  
		  
		  
		  

	}


