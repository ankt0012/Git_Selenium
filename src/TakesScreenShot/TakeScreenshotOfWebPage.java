package TakesScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshotOfWebPage {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.selenium.dev/");

        TakesScreenshot ts =(TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File destination = new File("./Screenshots/errorshot1.png");
        com.google.common.io.Files.copy(source, destination);
        

    }
    
}
