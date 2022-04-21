package com.harman.advance;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1FindEle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saipr\\Documents\\Testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	    driver.get("https://www.google.com/");
	   List<WebElement> elements = driver.findElements(By.tagName("a"));
	   
	   int linkCount = elements.size();
	   System.out.println(linkCount);
		
	   String text;
	   for(int i=0;i<linkCount;i++) {
		   text = elements.get(i).getText();
		   System.out.println(text);
		   if(text.equals("Images")) {
			   elements.get(i).click();
		   }
	   }
	   
	   driver.quit();
		
	}

}
