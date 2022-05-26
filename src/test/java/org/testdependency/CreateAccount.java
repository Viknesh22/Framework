package org.testdependency;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utility.baseclass.ParentClass;

public class CreateAccount extends ParentClass {
public static void main(String[] args) throws Exception {
	
	 browser("chromebrowser");
     Launchurl("https://adactinhotelapp.com");
	
	url.findElement(By.xpath("//a[text()='New User Register Here']")).click();
	WebElement user = url.findElement(By.id("username"));
	value(user, "Viknesh22");
	
	WebElement pwd = url.findElement(By.id("password"));

value(pwd, "cskeerthi@22");

WebElement cpwd = url.findElement(By.xpath("(//input[@type='password'])[2]"));
value(cpwd, "cskeerthi@22");

WebElement fullname = url.findElement(By.xpath("(//input[@name='full_name'])"));
value(fullname, "Viknesh Soundararajan");

WebElement email = url.findElement(By.xpath("(//input[@class='reg_input'])[5]"));
value(email, "csviknesh26@gmail.com");

waits();


url.findElement(By.id("tnc_box")).click();

url.findElement(By.xpath("(//input[@class='reg_button'])[1]")).click();

}
}
