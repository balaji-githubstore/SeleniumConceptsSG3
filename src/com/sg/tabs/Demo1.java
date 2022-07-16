package com.sg.tabs;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.db4free.net/");
		
		driver.findElement(By.partialLinkText("phpMyAdmin")).click();
		
		
		List<String> windows=new ArrayList<String>(driver.getWindowHandles());
		
		System.out.println(windows.get(0));
		System.out.println(windows.get(1));
//		String index1=windows.get(1);
		//switch to second tab
		driver.switchTo().window(windows.get(1));
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("input_username")).sendKeys("hello");
		
		
	}

}



