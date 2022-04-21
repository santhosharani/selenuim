package com.mycompany;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saipr\\Documents\\Testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com");
	    String html = driver.getPageSource();
	    String title = driver.getTitle();
	    
	    System.out.println(title);
	    System.out.println(html);
	    driver.quit();
	}

}
