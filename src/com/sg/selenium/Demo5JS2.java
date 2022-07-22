package com.sg.selenium;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Demo5JS2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://phptravels.net/hotels");

		driver.findElement(By.id("select2-hotels_city-container")).click();

		driver.findElement(By.xpath("//input[@role='searchbox']")).sendKeys("chennai");
		
		Actions action=new Actions(driver);
		action.pause(2000).sendKeys(Keys.ARROW_DOWN).pause(1000)
		.sendKeys(Keys.ENTER).build().perform();
		
		driver.findElement(By.id("checkin")).sendKeys("29-07-2022");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		WebElement ele= driver.findElement(By.xpath("//*[@id='checkin']"));
		js.executeScript("arguments[0].value='28-07-2022'",ele);
		
		WebElement ele1= driver.findElement(By.xpath("//*[@id='checkout']"));
		js.executeScript("arguments[0].value='28-08-2022'",ele1);
		
	
		

	}

}








