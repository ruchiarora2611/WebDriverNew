package com.automation.webdriverMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {

	public static WebDriver driver;
	
	@BeforeSuite
	
	public void setUp()
	{
		if(driver==null)
		{
			System.setProperty("webdriver.chrome.driver","E:\\work\\chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver","E:\\work\\chrome\\chromedriver.exe");
			System.out.println("test");
			driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
		}
	}
  @Test	
public void login() throws InterruptedException
	
	{
		driver.findElement(By.id("email")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("test@test.com");
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys("test");
		driver.findElement(By.id("loginbutton")).click();
	}
}
