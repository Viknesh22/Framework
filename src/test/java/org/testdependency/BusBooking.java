package org.testdependency;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.Browser;

import utility.baseclass.ParentClass;

public class BusBooking extends ParentClass{

	public static void main(String[] args) {
		browser("chromebrowser");
		Launchurl("https://www.redbus.in/");
		maximize();
		url.findElement(By.id("signin-block")).click();;
	}
	
	
	
}
