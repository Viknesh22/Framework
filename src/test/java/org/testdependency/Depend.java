package org.testdependency;

import javax.sql.rowset.WebRowSet;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Depend {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
	
	
	WebDriver driver =new ChromeDriver();
	
	driver.get("http://demo.automationtesting.in/Alerts.html");
	WebElement alrt = driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
	alrt.click();
	Alert a=driver.switchTo().alert();
	Thread.sleep(3000);
	a.accept();
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	a.dismiss();
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
	Thread.sleep(5000);
	
	
	
	
	
	}
	
}
