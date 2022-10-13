package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLeftClickOnAnElement {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://demo.actitime.com/login.do");

        Actions action = new Actions(driver);
        Thread.sleep(5000);
        action.click(driver.findElement(By.id("keepLoggedInCheckBox"))).perform();

        // WebElement checkBox =driver.findElement(By.id("keepLoggedInCheckBox"));
        // Actions action = new Actions(driver);
        // action.click(checkBox).perform();
    }
}
