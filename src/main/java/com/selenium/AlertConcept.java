package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class AlertConcept {
static WebDriver driver;
static Alert  alert;
	
	public static void simpleAlert() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\automation\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("alertBox")).click();
		alert= driver.switchTo().alert();
		System.out.println("txt of the alerts message is ::" + alert.getText());
		Thread.sleep(2000);
		alert.accept();
		
		
	}
public static void confirmAlert() throws InterruptedException {
	//driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
	alert= driver.switchTo().alert();
	System.out.println("txt of the alerts message is ::" + alert.getText());
	Thread.sleep(2000);
	alert.accept();
	Thread.sleep(2000);
	//alert.dismiss();
}
public static void promptAlert() throws InterruptedException {
	//driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[@id='promptBox']")).click();
	alert= driver.switchTo().alert();
	System.out.println("txt of the alerts message is ::" + alert.getText());
	Thread.sleep(2000);
	alert .sendKeys("bramha velikanti");
	Thread.sleep(2000);
}	
public static void tearDown() {
	driver.close();
}
	public static void main(String[] args) throws InterruptedException {
		simpleAlert();
		confirmAlert();
		promptAlert();
		tearDown();
		// TODO Auto-generated method stub

	}

}
