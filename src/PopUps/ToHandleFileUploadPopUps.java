package PopUps;

import java.util.concurrent.TimeUnit;
import java.lang.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleFileUploadPopUps {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");

        driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
        // Runtime
        // Runtime.getRuntime().exec(".AutoIt/FileForUpload.exe");

    }

}
