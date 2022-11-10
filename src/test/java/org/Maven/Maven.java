package org.Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Maven extends BaseClass{

	public static void main(String[] args) {
		
		BrowserLaunch();
		Browser("https://www.flipkart.com/");
		WebElement Login = driver.findElement(By.xpath("//button[text()='✕']"));
		Close(Login);
		WebElement Elec = driver.findElement(By.xpath("//div[text()='Electronics']"));
		Electronics(Elec);
		WebElement Game = driver.findElement(By.xpath("//a[text()='Gaming']"));
		Gaming(Game);
		WebElement Gamee = driver.findElement(By.xpath("//a[text()='Games']"));
		Games(Gamee);
		WebElement Laptop = driver.findElement(By.xpath("//a[contains(text(),'AMKETTE EvoFox Falcon X35')]"));
		Amkette(Laptop);
	}
}

