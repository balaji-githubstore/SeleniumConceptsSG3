package com.sg.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2FBLogin {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		By locator = By.id("email");
		WebElement element = driver.findElement(locator);
		element.sendKeys("hello");
		
//		WebElement element = driver.findElement(By.id("email"));
//		element.sendKeys("hello");
		
		driver.findElement(By.id("email")).sendKeys("bala12345@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("pass123");
	
		driver.findElement(By.name("login")).click();
		
	}

}


