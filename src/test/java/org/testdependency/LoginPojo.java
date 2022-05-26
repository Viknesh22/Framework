package org.testdependency;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import utility.baseclass.ParentClass;

public class LoginPojo extends ParentClass{

	public LoginPojo() {

		PageFactory.initElements(url, this);
	
	
	
	}
	
	public WebElement getUser() {
		return user;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getLogin() {
		return login;
	}

	@FindBy(xpath="//input[@type='text']")
	private WebElement user;
	
	@FindBy(id="password")
	private WebElement pwd;
	
	@FindBys({
			
		@FindBy(id="login"),
@FindBy(xpath="//input[@type='Submit']")		
		
	})private WebElement login;
	
	@FindBy(xpath="//select[@name='location']")
	private WebElement city;
	
	@FindBy(xpath="//select[@name='hotels']")
	private WebElement hotels;
	
	@FindBy(xpath="//select[@name='room_type']")
	private WebElement room;
	
	@FindBy (xpath="//select[@name='room_nos']")
	private WebElement roomnos;
	
	@FindBy (xpath="//input[@name='datepick_in']")
private WebElement datein;
	@FindBy (xpath="//input[@name='datepick_out']")
private WebElement checkout;
	@FindBy (xpath="//select[@name='adult_room']")

private WebElement adult;
	@FindBy (xpath="//select[@name='child_room']")
private WebElement child;
	
	@FindBy (xpath="(//input[@type='radio'])[2]")
	private WebElement radio;
	public WebElement getRadio() {
		return radio;
	}

	@FindBy (xpath="//a[text()='Logout']")
	private WebElement logout;
	public WebElement getLogout() {
		return logout;
	}
	

	@FindBy (xpath="//input[@name='Submit']")
	private WebElement submit;

	public WebElement getCity() {
		return city;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getRoomnos() {
		return roomnos;
	}

	public WebElement getDatein() {
		return datein;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSubmit() {
		return submit;
	}
	


}
