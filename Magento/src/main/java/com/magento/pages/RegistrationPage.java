package com.magento.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magento.base.TestBase;

public class RegistrationPage extends TestBase

{
	@FindBy(id="firstname")
	WebElement firstname;
	
	@FindBy(id="middlename")
	WebElement middlename;
	
	@FindBy(id="lastname")
	WebElement lastname;
	
	@FindBy(id="email_address")
	WebElement email_address;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="confirmation")
	WebElement confirmpassword;
	
	@FindBy(xpath="//button[@title='Register']")
	WebElement registerButton;
	
	@FindBy(xpath="//div[@class='validation-advice']")
	WebElement errorMsg;
	
	public RegistrationPage() throws IOException 
	{
		PageFactory.initElements(driver, this);
	}
	
	public String registrationErrorMsg()
	{
		firstname.sendKeys("ab");
		middlename.sendKeys("dsgsdg");
		lastname.sendKeys("Test");
		//email_address.sendKeys("otest@gmail.com");
		password.sendKeys("qwerty_123");
		confirmpassword.sendKeys("qwerty_123");
		registerButton.click();
		return  errorMsg.getText();
	}
	
	public MyAccountPage registration() throws IOException
	{
		firstname.sendKeys("padyaqqq");
		middlename.sendKeys("walsdfsdfdfdgfgke");
		lastname.sendKeys("gavkargfgfg");
		email_address.sendKeys("dfhdfhfhfdnnnn@gmail.com");
		password.sendKeys("qwerty_123");
		confirmpassword.sendKeys("qwerty_123");
		registerButton.click();
		return new MyAccountPage();
	}
	
	
	
	

}
