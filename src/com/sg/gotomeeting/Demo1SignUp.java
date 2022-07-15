package com.sg.gotomeeting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo1SignUp {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.goto.com/meeting");
		
		driver.findElement(By.id("truste-consent-button")).click();
		driver.findElement(By.partialLinkText("Try Free")).click();
		
		driver.findElement(By.id("first-name")).sendKeys("Balaji");
		driver.findElement(By.id("last-name")).sendKeys("Dinakaran");
		driver.findElement(By.id("login__email")).sendKeys("demo@demo.com");
		
		Select selectComSize=new Select(driver.findElement(By.id("CompanySize")));
		//selectComSize.selectByIndex(2);
		selectComSize.selectByVisibleText("10 - 99");
		
		driver.findElement(By.xpath("//button[text()='Start My Trial']")).click();
		
		String header=driver.findElement(By.xpath("//h1[@class='trial__header']")).getText();
		System.out.println(header);
		
		String actualError=driver.findElement(By.xpath("//div[@class='inputField__requirements']")).getText();
		System.out.println(actualError);
		//div[@class='inputField__requirements']
	}

}







