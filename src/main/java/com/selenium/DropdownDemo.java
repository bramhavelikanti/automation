package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownDemo {
	WebDriver driver;
	Select courseName;
	Select idevalues;
public DropdownDemo() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
}
	public void dropDownSelection() throws InterruptedException {
	//public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","C:\\automation\\chromedriver.exe");
		
		//driver = new ChromeDriver();
		driver.get("https://www.abhibus.com/abhioffer");
		driver.manage().window().maximize();
		WebElement dropdown = driver.findElement(By.id("source"));
		dropdown.sendKeys("Tirupathi");
		/*courseName = new Select(dropdown);
		courseName.selectByVisibleText("Tirupathi");
		((WebElement) courseName).click();
		//dropdown.click();
		courseName = new Select(dropdown);
		courseName.selectByVisibleText("Tirupathi");
		//courseName.click();*/
	    Thread.sleep(2000); 
	    
	    WebElement dropdown2 = driver.findElement(By.id("destination"));
		dropdown2.sendKeys("Hyderabad");
		//dropdown2.click();
		Thread.sleep(2000);
		/*idevalues = new Select(dropdown2);
		idevalues.selectByVisibleText("Hyderabad");
		 Thread.sleep(2000);*/
		 
		 WebElement radio = driver.findElement(By.xpath("//input[@type='text' and @id='datepicker1']"));
		 radio.click();
		 courseName = new Select(radio);
			courseName.selectByVisibleText("14");
			//courseName.click();*/
		 Thread.sleep(2000); 
		 
		 
		 WebElement submit = driver.findElement(By.xpath("//a[@class='btnab icosearch']"));
		 submit.click();

		 
			//courseName = new Select(radio);
			//courseName.selectByVisibleText("Hyderabad");
			 Thread.sleep(2000); 
	      
	      //you can also use 
	    //courseName.selectByIndex(1);
	    //Thread.sleep(2000);

	    //to select second element as
	      //index starts with 0.
	      //You can also use 
	    /*courseName.selectByValue("js");
	    Thread.sleep(2000);
	    List<WebElement> allCourseList = courseName.getOptions();
	    for(WebElement course:allCourseList)
	    {
	    	System.out.println("course name:"+ course.getText());
	    } */

	      
	      /* System.out.println("The Output of the IsSelected " +
	         driver.findElement(By.id("course")).isSelected());
	      System.out.println("The Output of the IsEnabled " +
	         driver.findElement(By.id("course")).isEnabled());
	      System.out.println("The Output of the IsDisplayed " +
	         driver.findElement(By.id("course")).isDisplayed()); */
	      
	      //driver.close();
	   }
	
public void multipleSelect() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\automation\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
	driver.manage().window().maximize();
	WebElement idenames = driver.findElement(By.id("ide"));
	idevalues = new Select(idenames);
	idevalues.selectByIndex(2);
	//System.out.println(idevalues.getText());
	Thread.sleep(2000);	
	
	idevalues.selectByValue("ij");
	Thread.sleep(2000);	
	
	
	idevalues.selectByVisibleText("NetBeans");
	Thread.sleep(2000);
	idevalues.deselectByValue("ij");
	
    List<WebElement> selectedoptions = idevalues.getAllSelectedOptions();
    for(WebElement options:selectedoptions)
    {
    	System.out.println(options.getText());
    }	


	/*if( idenames.isSelected())
	{
		System.out.println(idenames.getText());
	}
	else {
		System.out.println("ide name not selected"); */

	}
	
	

	
public void firstSelectedOption(){
	WebElement selectedCourse= courseName.getFirstSelectedOption();
	System.out.println("first selected option:" +selectedCourse.getText());
}
public void tearDown() {
	driver.close();
}
//driver.close();
 public static void main(String[] args) throws InterruptedException {
	 DropdownDemo demo = new DropdownDemo();
	 demo.dropDownSelection();
	 demo.tearDown();
	 /*try {
		//demo.dropDownSelection();
		//demo.firstSelectedOption();
		 demo.multipleSelect();
		demo.tearDown();
		//driver.close();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	     }*/
  }
}

 