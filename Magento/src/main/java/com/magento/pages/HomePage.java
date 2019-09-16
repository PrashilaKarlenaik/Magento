package com.magento.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magento.base.TestBase;
//import com.magneto.testcases.HomeTestCase;

public class HomePage extends TestBase
{
	
	@FindBy(xpath="//div[@class='page-title']//h2")
	WebElement pageTitle;
	
	@FindBy(linkText="MOBILE")
	WebElement mobileMenu;
	
	@FindBy(xpath="//a[@class='skip-link skip-account']")
	WebElement accountlink;
	
	@FindBy(xpath="//div[@id='header-account']//a")
	WebElement myaccount;
	
	@FindBy(xpath="//div[@id='header-account']//li[6]")
	WebElement logIn;
	

	
	public HomePage() throws IOException
	{
		PageFactory.initElements(driver, this);

	}

	public String validateHomePageTitle()
	{
		
		return pageTitle.getText();
	}
	
	public MobilePage validateMobileMenuClicked() throws IOException
	{
		mobileMenu.click();
		
		return new MobilePage();
	}
	
	public LoginPage clickedAccountButton() throws IOException
	{
		accountlink.click();
		
		myaccount.click();
		
		return new LoginPage();
	}
	
	public LoginPage clickOnLogInLink() throws IOException
	{
		accountlink.click();
		logIn.click();
		return new LoginPage();
	}
	
	

}
