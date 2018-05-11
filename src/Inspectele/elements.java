package Inspectele;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.tigervnc.rfb.screenTypes;

import Browser.browsercode;

public class elements extends browsercode{
	static WebElement element;
	
	
	static By login=By.xpath("//*[@id=\"topbar\"]/div/div/div[1]/ul[1]/li[2]/a/span");
	static By email=By.name("email");
	static By pass=By.name("password");
	static By enter=By.cssSelector("#content > div > div:nth-child(2) > div > form > input");
	static By editadd=By.cssSelector("#content > ul:nth-child(2) > li:nth-child(1) > a");
	static By frstname=By.name("firstname");
	static By lastname=By.name("lastname");
	static By mail=By.name("email");
	static By telephne=By.name("telephone");
	static By fax=By.name("fax");
	static By contnue=By.xpath("//*[@id=\"content\"]/form/div/div[2]/input");
	
	static By Home= By.xpath("//*[@id=\"bs-megamenu\"]/ul/li[1]/a/span[2]");
	static By addtocart = By.xpath("//*[@id=\"button-cart\"]");
	static By shoppingcart = By.xpath("//*[@id=\"cart\"]/div/div[2]/h4");
	static By viewcart = By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]");
	
	
	
	
	
	/*public static WebElement log(WebDriver driver) 
	{
		super();
		
	}*/
		
		
		public static WebElement clickonlogin() 
		{
		element= driver.findElement(login);
		return element;
		}
		public static WebElement mail() 
		{
		element= driver.findElement(email);
		return element;
		}
		public static WebElement pasword() 
		{
		element= driver.findElement(pass);
		return element;
		}
		public static WebElement enter() 
		{
		element= driver.findElement(enter);
		return element;
		}
		
		public static WebElement edit() 
		{
		element= driver.findElement(editadd);
		return element;
		}
		public static WebElement frst() 
		{
		element= driver.findElement(frstname);
		return element;
		}
		public static WebElement last() 
		{
		element= driver.findElement(lastname);
		return element;
		}
		public static WebElement gmail() 
		{
		element= driver.findElement(mail);
		return element;
		}
		public static WebElement phone() 
		{
		element= driver.findElement(telephne);
		return element;
		}
		public static WebElement faxx() 
		{
		element= driver.findElement(fax);
		return element;
		}
		public static WebElement cont() 
		{
		element= driver.findElement(contnue);
		return element;
		}
		public static WebElement home() 
		{
		element= driver.findElement(Home);
		return element;
		}
		public static void scrolling() {
			  JavascriptExecutor js = (JavascriptExecutor)driver;
			  js.executeScript("window.scrollBy(0,750)");
		}
		public static WebElement addtocart() {
			element = driver.findElement(addtocart);
			return element;
		}
		public static WebElement shoppingcart() {
			element = driver.findElement(shoppingcart);
			return element;
		}
		public static WebElement viewcart() {
			element = driver.findElement(viewcart);
			return element;
		}
	}


