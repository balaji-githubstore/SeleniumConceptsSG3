package com.sg.tabs;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
	
	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.db4free.net/");
		
		driver.findElement(By.partialLinkText("phpMyAdmin")).click();
		

		//will switch to second tab
		List<String> windows=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windows.get(1));
		
		
		driver.findElement(By.id("input_username")).sendKeys("hello");

	}

}



