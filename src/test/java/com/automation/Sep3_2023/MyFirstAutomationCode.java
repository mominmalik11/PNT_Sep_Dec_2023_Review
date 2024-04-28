package com.automation.Sep3_2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstAutomationCode {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();//crtl+shift+O
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		driver.quit();
		
		
		
	}

}
