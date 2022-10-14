package ActiveElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(
                "https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2Fsource=header-home");

        driver.findElement(By.id("email")).sendKeys("akrjeee15@gmail.com");

    }

}
