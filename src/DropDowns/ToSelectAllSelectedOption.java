package DropDowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ToSelectAllSelectedOption {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");

        Actions action = new Actions(driver);
        action.sendKeys(Keys.PAGE_UP).perform();

        WebElement element = driver.findElement(By.id("cars"));
        Select select = new Select(element);

        select.selectByIndex(1);
        select.selectByIndex(0);
        select.selectByIndex(3);

        List<WebElement> allSelectedOptions = select.getAllSelectedOptions();

        for (WebElement option : allSelectedOptions) {
            System.out.println(option.getText());
        }

        String fristOption = select.getFirstSelectedOption().getText();
        System.out.println("The first selection option is : " + fristOption);

    }

}
