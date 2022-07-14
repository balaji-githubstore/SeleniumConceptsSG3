package com.sg.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//first program
public class Demo1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String currentTitle= driver.getTitle();
		System.out.println(currentTitle);
		
		String url= driver.getCurrentUrl();
		System.out.println(url);
		
		String pageSource= driver.getPageSource();
		System.out.println(pageSource);
		
	}

}
