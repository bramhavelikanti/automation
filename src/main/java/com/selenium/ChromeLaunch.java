package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeLaunch {
WebDriver driver;	

 public ChromeLaunch() {
	 WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.manage().window().maximize();
		
		
	 
 }

	public void timeout() throws InterruptedException {
		
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		//WebElement username = driver.findElement(By.id("login_field"));
		//username.sendKeys("velikantibramha@gmail.com");
		//WebElement password = driver.findElement(By.id("password"));
        //password.sendKeys("VBR1568gh@#");
        driver.findElement(By.id("btn1")).click();
        driver.findElement(By.xpath("(//button[@id='btn1']/following::h3/input)[1]")).sendKeys("velikantibramha@gmail.com");
       // box1.sendKeys("velikantibramha@gmail.com");
        //WebElement submit = driver.findElement(By.name("commit"));
        //submit.click();
        
        //driver.close();

		
		//Thread.sleep(1000);
		////driver.findElement(By.id("btn2")).click();
       // WebElement secondbox =driver.findElement(By.xpath("(//button[@id='btn2']/following::h3/input)[2]"));
        //secondbox.sendKeys("another box");
		//driver.close();	
		
		// TODO Auto-generated method stub

	}
	public void tearDown() throws InterruptedException {
		driver.close();
	}
		
		
	public static void main(String[] args) throws InterruptedException {
		ChromeLaunch ref = new ChromeLaunch();
		ref.timeout();
		ref.tearDown();
	}
}
