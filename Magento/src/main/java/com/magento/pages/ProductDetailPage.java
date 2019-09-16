package com.magento.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magento.base.TestBase;

public class ProductDetailPage extends TestBase
{
	

	@FindBy(id="product-price-1")
	WebElement listPageCost;
	
	
	public ProductDetailPage() throws IOException
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
	public String getProductCostOnDetailPage()
	{
		return listPageCost.getText();
	}

}
