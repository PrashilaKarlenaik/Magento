package com.magento.pages;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magento.base.TestBase;

public class AddToComparePage extends TestBase
{

	@FindBy(xpath="//a[@title='Xperia']//following::a[4]")
	WebElement xperiaAddToCompareButton;
	
	@FindBy(xpath="//a[@title='IPhone' and @class='product-image']//following::a[4]")
	WebElement iphoneAddToCompareButton;
	
	@FindBy(xpath="//button[@type='button' and @title='Compare']")
	WebElement compareButton;
	
	
	
	public AddToComparePage() throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickXperiaAddToCompareButton()
	{
		xperiaAddToCompareButton.click();
	}
	
	public void clickiphoneAddToCompareButton()
	{
		iphoneAddToCompareButton.click();
	}
	
	public Set<String> clickCompareButton()
	{
		compareButton.click();
		return driver.getWindowHandles();
	}
	
	
	
	

}
