package com.indeed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calculator {

	public static void main(String[] args) {
		
		System.out.println("This is a calculator app");
		 WebDriverManager.chromedriver().setup();
		 
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://google.com");

	}

}
