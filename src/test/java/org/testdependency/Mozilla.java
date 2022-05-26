package org.testdependency;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;
import utility.baseclass.ParentClass;

public class Mozilla extends ParentClass {

	@Test
	public void edgelogin() {
		browser("edge");
		Launchurl("https://adactinhotelapp.com");
		WebElement name = url.findElement(By.id("username"));
		value(name, "Viknesh22");
		WebElement pwd = url.findElement(By.id("password"));
		value(pwd, "cskeerthi@22");
		String att = pwd.getAttribute("value");
		Assert.assertEquals("cskeerthi", att);
		url.findElement(By.id("login")).click();

		WebElement city = url.findElement(By.xpath("//select[@name='location']"));
		Select s = new Select(city);

		s.selectByValue("Melbourne");

		WebElement hotels = url.findElement(By.xpath("//select[@name='hotels']"));
		selectindex(hotels, 2);

		WebElement roomtype = url.findElement(By.xpath("//select[@name='room_type']"));
		selectvalue(roomtype, "Super Deluxe");
		WebElement noofrooms = url.findElement(By.xpath("//select[@name='room_nos']"));
		selectindex(noofrooms, 3);

		WebElement checkindate = url.findElement(By.xpath("//input[@name='datepick_in']"));
		checkindate.clear();
		value(checkindate, "26/06/2022");

		WebElement checkoutdate = url.findElement(By.xpath("//input[@name='datepick_out']"));
		checkoutdate.clear();
		value(checkoutdate, "30/06/2022");

		WebElement adult = url.findElement(By.xpath("//select[@name='adult_room']"));
		selectindex(adult, 3);

		WebElement child = url.findElement(By.xpath("//select[@name='child_room']"));
		selectindex(child, 2);
		url.findElement(By.xpath("//input[@name='Submit']")).click();

	}

}
