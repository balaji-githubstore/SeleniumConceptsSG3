package com.sg.selenium;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1_Screenshot {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://google.com/");
		
		//mouse hover on Membership
		
//		driver.findElement(By.xpath("//a[text()='Members Listing']")).click();
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File file= ts.getScreenshotAs(OutputType.FILE);
		
		file.renameTo(new File("error.png"));
		
		

		
//		File  f=new File("D:\\Mine\\Company\\Scientific Games3\\automation_workspace\\SeleniumConcepts\\error.png");
//		//f.delete();
//		
//		f.renameTo(new File("C:\\error.png"));	
		
	}

}
