package com.mycompany;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3FBSignupCSS {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saipr\\Documents\\Testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.facebook.com");
		
        driver.findElement(By.linkText("Create New Account")).click();	
        
        driver.findElement(By.name("firstname")).sendKeys("Joseph");
        driver.findElement(By.name("lastname")).sendKeys("Henry");
        driver.findElement(By.name("reg_email__")).sendKeys("jjj@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("joseph");
        driver.findElement(By.xpath("//input[@value='-1']")).click();
	    //driver.findElement(By.name("websubmit")).click();
	
	    Select selectDay = new Select(driver.findElement(By.id("day")));	
	    selectDay.selectByVisibleText("9");
	   	    
	    Select selectMonth = new Select(driver.findElement(By.id("month")));	
	    selectMonth.selectByVisibleText("Nov");
	    
	    
	    Select selectYear = new Select(driver.findElement(By.id("year")));	
	    selectYear.selectByVisibleText("2000");
	    
	   // Select selectPronoun = new Select(driver.findElement(By.id("preferred_pronoun")));
	  //  selectPronoun.selectByVisibleText("She:'Wish her a happy birthday!'");
	    
	    driver.findElement(By.cssSelector("[name=websubmit]")).click();

	    
	}

}
