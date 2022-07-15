package com.sg.frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//switch to frame using WebElement
public class Demo2_query {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://netbanking.hdfcbank.com/netbanking/");

		System.out.println(driver.findElements(By.xpath("//frame[@name='login_page']")).size());

		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='login_page']")));

		driver.findElement(By.name("fldLoginUserId")).sendKeys("test123");

//		driver.findElement(By.linkText("CONTINUE")).click();

		System.out.println(driver.findElements(By.xpath("//frame[@name='login_page']")).size());

		// come out of frame
		driver.switchTo().defaultContent();

		System.out.println(driver.findElements(By.xpath("//frame[@name='login_page']")).size());

	}

}
