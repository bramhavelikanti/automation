package com.selenium;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {
	WebDriver driver;
	Actions action;
	Alert alert;
	public RadioButton() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	}
public void radioButton() throws InterruptedException {
	driver.get("https://courses.letskodeit.com/practice");
	WebElement radiobutto = driver.findElement(By.xpath("//input[@id='bmwradio']"));
	radiobutto.click();
	Thread.sleep(2000);
	if(radiobutto.isSelected())
	{
		System.out.println("button selected");
	}
	else
	{
		System.out.println("button not selected");
	}
	}
public void checkButton() throws InterruptedException {
	driver.get("https://courses.letskodeit.com/practice");
	WebElement checkbmwbutto = driver.findElement(By.xpath("//input[@id='bmwcheck']"));
	//checkbmwbutto.click();
	Thread.sleep(2000);
	WebElement checkbenzbutto = driver.findElement(By.xpath("//input[@id='benzcheck']"));
	checkbenzbutto .click();
	Thread.sleep(2000);
	WebElement checkhondabutto = driver.findElement(By.xpath("//input[@id='hondacheck']"));
	checkhondabutto.click();
	System.out.println("is honda selected::"+checkhondabutto.isSelected());
	Thread.sleep(2000);
	System.out.println("is benz selected::"+checkbenzbutto.isSelected());
	Thread.sleep(2000);
	System.out.println("is bmw selected::"+checkbmwbutto.isSelected());
	Thread.sleep(2000);
	
}
public void dynamicCheckButton(String myselection) throws InterruptedException {
	driver.get("https://courses.letskodeit.com/practice");
	List<WebElement> cars = driver.findElements(By.xpath("//input[@type='checkbox']"));
	for(WebElement carnames:cars)
	{
		//System.out.println(carnames.getAttribute("Value"));
		carnames.getAttribute("Value");
		if(carnames.getAttribute("Value").equals(myselection))
		{
			System.out.println(carnames.getAttribute("Value"));
			carnames.click();
			break;
		}
			
	}
		
}

public void Teardown() throws InterruptedException {
	//Thread.sleep(2000);
	driver.close();
}
public static void main(String[] args) throws InterruptedException {	
	RadioButton ref =new RadioButton();
	//ref.radioButton();
	//ref.checkButton();
	ref.dynamicCheckButton("benz");
	//ref.DoubleClick();
	//ref.rightClick();
	ref.Teardown();
}
} 
