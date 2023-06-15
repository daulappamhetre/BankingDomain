package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class banK 
{
	public static WebDriver driver;
	public static void ss()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		 driver=new ChromeDriver();
	}
	public static void teardown()
	{
		driver.close();
		driver.quit();
	}
	
	
}
