package com.sg.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3FbRegister {

	public static void main(String[] args) throws InterruptedException {
		
		//preferable option
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.facebook.com/");
		
		//click on Create New Account 
		driver.findElement(By.linkText("Create New Account")).click(); // check presence in 0.5s 
		
		//Enter First Name as John 
		driver.findElement(By.name("firstname")).sendKeys("John"); // check presence in 0.5s 
		driver.findElement(By.name("lastname")).sendKeys("wick");
		driver.findElement(By.name("reg_email__")).sendKeys("John@gma.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("John@gma.com");
		driver.findElement(By.id("password_step_input")).sendKeys("welcome123");
		
		//20 Dec 2000
		Select selectDay=new Select(driver.findElement(By.id("day")));
		selectDay.selectByVisibleText("20");
		
		Select selectMon=new Select(driver.findElement(By.name("birthday_month")));
		selectMon.selectByVisibleText("Dec");
		
		//select year 2000
		Select selectYr=new Select(driver.findElement(By.xpath("//select[@title='Year']")));
		selectYr.selectByVisibleText("2000");
		
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		
		driver.findElement(By.name("websubmit")).click();
	}

}


