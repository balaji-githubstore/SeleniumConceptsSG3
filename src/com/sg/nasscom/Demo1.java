package com.sg.nasscom;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://nasscom.in/");
		
		//mouse hover on Membership
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Membership']"))).perform();
		
		driver.findElement(By.xpath("//a[text()='Members Listing']")).click();
		
		
		
		
		
	}

}
