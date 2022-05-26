package org.testdependency;

import java.io.IOException;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;


public class addactinpom extends LoginPojo {

	public static void main(String[] args) throws IOException {

		chrome();
		
		maximize();
		
		Launchurl("https://adactinhotelapp.com");
		LoginPojo l = new LoginPojo();

		WebElement user = l.getUser();
		value(user, "Viknesh22");
		WebElement pwd = l.getPwd();
		value(pwd, "cskeerthi@22");
	/*	String att = pwd.getAttribute("value");
		Assert.assertTrue(true);
		Assert.assertEquals("zsxd", "Viknesh", att);*/
		screenshot("login");
		l.getLogin().click();
		WebElement city = l.getCity();
		selectindex(city, 2);
		WebElement adult = l.getAdult();
		selectindex(adult, 2);
		WebElement checkout2 = l.getCheckout();
		checkout2.clear();
		value(checkout2, "29/06/2022");
		WebElement datein2 = l.getDatein();
		datein2.clear();
		value(datein2, "28/06/2022");

		WebElement child2 = l.getChild();
		selectindex(child2, 3);

		WebElement submit2 = l.getSubmit();
		submit2.click();
		l.getRadio().click();
		screenshot("page2");
		
		url.findElement(By.xpath("//input[@type='submit']")).click();

		WebDriverWait w = new WebDriverWait(url, Duration.ofSeconds(3));
		screenshot("page3");
		WebElement logout2 = l.getLogout();
		logout2.click();
		screenshot("last");

	}
}