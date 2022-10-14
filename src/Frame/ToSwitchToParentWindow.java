package Frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToSwitchToParentWindow {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://jqueryui.com/draggable/");

        driver.switchTo().frame(0);

        WebElement element = driver.findElement(By.id("draggable"));

        Actions action = new Actions(driver);
        action.dragAndDropBy(element, 100,50).perform();

        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//a[@tabindex='@']")).click();
    }
    
}
