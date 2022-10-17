package PopUps;

import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandlePrintPopUp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("");

        driver.findElement(By.xpath("//button[text()='Print']")).click();
        driver.switchTo().alert().accept();
        Thread.sleep(2000);

        // Robot robot = new Robot();
        // robot.keyPress(KeyEvent.VK_PROPS);
    }
    
}
