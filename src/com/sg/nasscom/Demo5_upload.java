package com.sg.nasscom;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo5_upload {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.ilovepdf.com/pdf_to_word");

		
		File file=new File("files/Balaji Profile_2022.pdf");
		
		String filePath=file.getAbsolutePath();
		System.out.println(filePath);
		
 
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(filePath);

	}

}


