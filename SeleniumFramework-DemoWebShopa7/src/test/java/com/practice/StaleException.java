package com.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleException {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		WebElement searchTextfield = driver.findElement(By.id("small-searchterms"));
		searchTextfield.sendKeys("Mobile",Keys.ENTER);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();	
		driver.findElement(By.id("small-searchterms")).sendKeys("Computers",Keys.ENTER);
		Thread.sleep(4000);
		driver.quit();
	}

}
