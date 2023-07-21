package com.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dayOne {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajes\\eclipse-workspace\\project\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("thayumanavan");
		driver.findElement(By.id("password")).sendKeys("07thayu");
		driver.findElement(By.id("login")).click();
		
		WebElement lock = driver.findElement(By.id("location"));
		Select text =new Select(lock);
		text.selectByVisibleText("Sydney");
		boolean multi = text.isMultiple();
		System.out.println(multi);
		
		WebElement hotels = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select hotl =new Select(hotels);
		hotl.selectByIndex(2);
		
		WebElement rType = driver.findElement(By.id("room_type"));
		Select type =new Select(rType);
		type.selectByValue("Deluxe");
		
		WebElement number = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select one=new Select(number);
		one.selectByIndex(3);
		
		driver.findElement(By.id("datepick_in")).sendKeys("07/05/1999");
		
		driver.findElement(By.id("datepick_out")).sendKeys("17/2/2000");
		
		WebElement adult = driver.findElement(By.id("adult_room"));
		Select adut=new Select(adult);
		adut.selectByIndex(2);
		
		WebElement childern = driver.findElement(By.id("child_room"));
		Select child=new Select(childern);
		child.selectByVisibleText("2 - Two");
		
		driver.findElement(By.id("Submit")).click();
		
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("first_name")).sendKeys("thayu");
		driver.findElement(By.id("last_name")).sendKeys("murugan");
		driver.findElement(By.id("address")).sendKeys("no145,kasthuribai avenue,tvk,chennai");
		driver.findElement(By.id("cc_num")).sendKeys("5464956416544");
		
		WebElement cType = driver.findElement(By.name("cc_type"));
		Select typ=new Select(cType);
		typ.selectByIndex(2);
		
		WebElement sDate = driver.findElement(By.id("cc_exp_month"));
		Select dateS=new Select(sDate);
		dateS.selectByIndex(3);
		
		WebElement year = driver.findElement(By.id("cc_exp_year"));
		Select yer=new Select(year);
		yer.selectByIndex(1);
		
		driver.findElement(By.id("cc_cvv")).sendKeys("5468");
		
		driver.findElement(By.id("continue")).click();
	}
	
	

}
