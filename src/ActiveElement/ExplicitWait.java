package ActiveElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(
                "https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2Fsource=header-home");

        driver.findElement(By.id("email")).sendKeys("akrjee15@gmail.com");

        WebElement element = driver.findElement(By.xpath("//button[contains(text(), 'Continue')]"));
        WebDriverWait wait = new WebDriverWait(driver, 20);
        element.click();

    }
}
