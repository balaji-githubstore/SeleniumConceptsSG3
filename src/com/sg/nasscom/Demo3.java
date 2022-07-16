package com.sg.nasscom;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://nasscom.in/");

		// mouse hover on Membership
		Actions action = new Actions(driver);

		action.moveToElement(driver.findElement(By.xpath("//a[text()='Membership']"))).pause(1000)
				.moveToElement(driver.findElement(By.xpath("//a[text()='Become a member']"))).build().perform();

		driver.findElement(By.xpath("//a[text()='Membership Benefits']")).click();

//         driver.findElement(By.xpath("//a[contains(text(),'Click to Apply Online')]")).click();

		driver.findElement(By.partialLinkText("CLICK TO APPLY")).click();
		
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("D:\\Balaji-Profile_2022.pdf");

	}

}


