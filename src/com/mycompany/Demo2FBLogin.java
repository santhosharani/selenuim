package com.mycompany;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2FBLogin {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saipr\\Documents\\Testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com");
		
	    driver.findElement(By.id("email")).sendKeys("hello@gmail.com");
	    driver.findElement(By.id("pass")).sendKeys("hello");
        driver.findElement(By.name("login")).click();

        driver.findElement(By.linkText("Create New Account")).click();	
       
	     driver.quit();
	}

	   
}
