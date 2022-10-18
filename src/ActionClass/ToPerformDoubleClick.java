package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformDoubleClick {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");

        WebElement addButton = driver.findElement(By.xpath("//i[@class='fa fa-plus']"));

        Actions action = new Actions(driver);
        action.doubleClick(addButton).perform();
        Thread.sleep(2000);
        // action.doubleClick(addButton).perform();

    }

}
