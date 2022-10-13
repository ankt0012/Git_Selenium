package webDriver;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTheSizeOfWindow 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Dimension dimension = driver.manage().window().getSize();
		
		System.out.println(dimension);
		int width = dimension.getWidth();
		int height = dimension.getHeight();
        System.out.println("the width is   :"+width);
        System.out.println("the height is   :"+height);
        driver.quit();
	
		

		

	}

	}


