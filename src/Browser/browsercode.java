package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browsercode {
	public static  WebDriver driver;
	public static void Browser()
	{
		System.setProperty("webdriver.chrome.driver","D:\\mounika\\chromedriver.exe");
		  driver= new ChromeDriver();
		  driver.get("http://cubicitsolution.co.in/bookstore/");
}
}
