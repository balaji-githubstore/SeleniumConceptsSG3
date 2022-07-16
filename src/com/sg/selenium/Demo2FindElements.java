package com.sg.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2FindElements {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://google.com/");

		List<WebElement> elements = driver.findElements(By.xpath("//king"));

		int linkCount = elements.size();
		System.out.println(linkCount);

//		elements.get(0).click();
		// elements.get(1).click();

		//click only when element is present
		if (driver.findElements(By.xpath("//king")).size() > 0) 
		{
			driver.findElement(By.xpath("//king")).click();
		}

		for (int i = 0; i < linkCount; i++) {
			String text = elements.get(i).getText();
			System.out.println(text);

			String href = elements.get(i).getAttribute("href");
			System.out.println(href);
		}
	}

}
