package com.indeed;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://amazon.com");
		
	}
	
	@Test
	public void rating() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("10 X rule"+Keys.ENTER);
		driver.findElement(By.xpath("//h2[@data-attribute='The 10X Rule: The Only Difference Between Success and Failure']")).click();
		String a = driver.findElement(By.xpath("//span[@data-hook='rating-out-of-text'][@class='arp-rating-out-of-text']"))
				.getText().substring(0, 3);
		System.out.println(a);
		driver.close();
	}

}
