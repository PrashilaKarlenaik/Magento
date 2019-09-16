package com.magento.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magento.base.TestBase;

public class LoginPage extends TestBase

{
	
	@FindBy(xpath="//a[@title='Create an Account']")
	WebElement createAnAcctountButton;
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="pass")
	WebElement password;
	
	@FindBy(id="send2")
	WebElement loginButton;
	
	
	public LoginPage() throws IOException
	{
		PageFactory.initElements(driver, this);

	}
	
	public RegistrationPage clickCreateAnAccountButton() throws IOException
	{
		createAnAcctountButton.click();
		return new RegistrationPage();
	}
	
	public MyAccountPage validateLogin() throws IOException
	{
		if(email.getAttribute("id").isEmpty() && password.getAttribute("id").isEmpty())
		{
			email.sendKeys("prashilakarlenaik@gmail.com");
			password.sendKeys("qwerty_123");
			
		}
		
		else
		{
			email.clear();
			email.sendKeys("prashilakarlenaik@gmail.com");
			password.sendKeys("qwerty_123");
			
		}
		loginButton.click();
		
		
		return new MyAccountPage();
		
	}
	
	

}
