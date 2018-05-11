package Browser;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class browsercode {
	public static  WebDriver driver;
	public static void Browser()
	{
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\WORKSPACE\\chromedriver_win32 (1)\\chromedriver.exe");
		  driver= new ChromeDriver();
		  driver.get("http://cubicitsolution.co.in/bookstore/");
		  driver.manage().window().maximize();
}
	public static void scrnsht() throws Exception {
		Screenshot SC = new AShot().shootingStrategy( ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
	       BufferedImage src = SC.getImage();
	       File des = new File("D:\\selenium\\WORKSPACE\\screenshot\\screenshot7");
	        ImageIO.write(src, "png", des);
	}
}
