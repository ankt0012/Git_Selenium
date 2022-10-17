package BasicsTestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import POMClass.LoginPage;

public class ToVerifyHomePage {

    @Test
    public void toVerifyHomePage(){
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file://demo-actitime.com/login.do");

        LoginPage login = new LoginPage(driver);
        login.loginAction("admin", "manager");
    }
    
}
