package WebDriver;




import org.openqa.selenium.W import org.openqa.selenium.chrome.ChromeDriver;

public class TogetPageSource  

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);

	}

}
