package org.testdependency;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utility.baseclass.ParentClass;

public class addactinhotel extends ParentClass {

	public static void main(String[] args) throws Exception {

		browser("chromebrowser");
		Launchurl("https://adactinhotelapp.com");

		WebElement name = url.findElement(By.id("username"));
		value(name, "Viknesh22");
		WebElement pwd = url.findElement(By.id("password"));
		value(pwd, "cskeerthi@22");
		url.findElement(By.id("login")).click();

		WebElement city = url.findElement(By.xpath("//select[@name='location']"));
		Select s = new Select(city);

		s.selectByValue("Melbourne");

		WebElement hotels = url.findElement(By.xpath("//select[@name='hotels']"));
		Select s1 = new Select(hotels);
		s1.selectByIndex(2);
		WebElement roomtype = url.findElement(By.xpath("//select[@name='room_type']"));

		Select s2 = new Select(roomtype);
		s2.selectByVisibleText("Super Deluxe");
		WebElement noofrooms = url.findElement(By.xpath("//select[@name='room_nos']"));
		Select s3 = new Select(noofrooms);
		s3.selectByIndex(3);
		WebElement checkindate = url.findElement(By.xpath("//input[@name='datepick_in']"));
		checkindate.clear();
		value(checkindate, "26/06/2022");

		/*
		 * Thread.sleep(4000); TakesScreenshot ts=(TakesScreenshot)url; File temp=new
		 * File("C:\\Users\\cskee\\Music\\temp");
		 * 
		 * File des = new File("C:\\Users\\cskee\\Music\\dest");
		 * 
		 * FileUtils.copyFile(temp,des);
		 * 
		 * JavascriptExecutor js = (JavascriptExecutor)url; WebElement scrlldown =
		 * url.findElement(By.xpath("/html"));
		 * js.executeScript("arguments[0].scrollintoview(true)", scrlldown);
		 */
		WebElement checkoutdate = url.findElement(By.xpath("//input[@name='datepick_out']"));
		checkoutdate.clear();
		value(checkoutdate, "30/06/2022");
		WebElement adult = url.findElement(By.xpath("//select[@name='adult_room']"));
		Select s4 = new Select(adult);
		s4.selectByValue("2");

		WebElement child = url.findElement(By.xpath("//select[@name='child_room']"));
		Select s5 = new Select(child);
		s5.selectByValue("2");

		url.findElement(By.xpath("//input[@name='Submit']")).click();

	}

}
