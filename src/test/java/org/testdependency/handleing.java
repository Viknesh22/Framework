package org.testdependency;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handleing {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
	
	
	WebDriver driver =new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Windows.html");
	driver.findElement(By.xpath("(//button[@class='btn btn-info'])[1]")).click();
	Set<String> fwindow = driver.getWindowHandles();
    for (String  x: fwindow) {
		if(!x.equals(fwindow)) {
			driver.switchTo().window(x);
		}
	
    
}
	}
}