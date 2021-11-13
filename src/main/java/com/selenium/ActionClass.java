package com.selenium;

import javax.swing.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass {
WebDriver driver;
Actions action;
Alert alert;
public ActionClass() {
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.manage().window().maximize();
}

	public void  SingleClick() throws InterruptedException {
	    driver.get("https://www.google.com/");
		action = new Actions(driver);
		WebElement gmaillink = driver.findElement(By.linkText("Gmail"));
		Thread.sleep(2000);
		action.moveToElement(gmaillink).click().perform();
	}
		
		//driver.close();
public void DoubleClick() throws InterruptedException {
	driver.get("http://demo.guru99.com/test/simple_context_menu.html");
	WebElement doubleclick = driver.findElement(By.tagName("button"));
	action = new Actions(driver);
	Thread.sleep(2000);
	action.doubleClick(doubleclick).perform();
	alert=driver.switchTo().alert();
	alert.accept();
	
	
}
public void rightClick() throws InterruptedException {
	//driver.get("http://demo.guru99.com/test/simple_context_menu.html");
	//WebElement doubleclick = driver.findElement(By.tagName("button"));
	action = new Actions(driver);
	action.contextClick(driver.findElement(By.xpath("//span[.='right click me']"))).perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[.='Delete']")).click();
}
public void Teardown() throws InterruptedException {
	Thread.sleep(2000);
	driver.close();
}
public static void main(String[] args) throws InterruptedException {	
	ActionClass ref =new ActionClass();
	ref.SingleClick();
	ref.DoubleClick();
	ref.rightClick();
	ref.Teardown();
	
		// TODO Auto-generated method stub

	}

}
