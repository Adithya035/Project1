package org.Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static WebDriver BrowserLaunch() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}
	public static void Browser(String a) {
		driver.get(a);
		driver.manage().window().maximize();
	}
	public static void Close(WebElement a) {
		a.click();
	}
	public static void Electronics(WebElement e) {	
	Actions a = new Actions(driver);
	a.moveToElement(e).perform();
	}
	public static void Gaming(WebElement e) {
	Actions a = new Actions(driver);
	a.moveToElement(e).perform();
	}
	public static void Games(WebElement e) {
		Actions a = new Actions(driver);
		a.click().perform();
	}
	public static void Amkette(WebElement e) {
		Actions a = new Actions(driver);
		a.click().perform();
	}
}