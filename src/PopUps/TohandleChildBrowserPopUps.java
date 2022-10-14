package PopUps;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TohandleChildBrowserPopUps {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://demo.actitime.com/login.do");

        // String parentWindow= driver.getWindowHandle();
        driver.findElement(By.linkText("actiTIME Inc.")).click();
        String parentId = driver.getWindowHandle();

        Set<String> allWindowIds = driver.getWindowHandles();
        for (String iD : allWindowIds) {
            driver.switchTo().window(iD);
            if (!iD.equals(parentId)) {
                driver.findElement(By.linkText("Try Free")).click();
                driver.close();
            }
        }

    }

}
