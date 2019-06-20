package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest3 {
	@Test
	 public void registraion() {
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Sharada");
		driver.findElement(By.id("LastName")).sendKeys("Karnam");
		driver.findElement(By.id("Email")).sendKeys("Karnam@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("karnam123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("karnam123");
		driver.findElement(By.id("register-button")).click();
		boolean flag=driver.findElement(By.cssSelector("input[value='Continue']")).isDisplayed();
		Assert.assertTrue(flag);
		driver.close();
	}
		
	}


