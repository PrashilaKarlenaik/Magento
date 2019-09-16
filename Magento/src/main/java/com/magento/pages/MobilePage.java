package com.magento.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magento.base.TestBase;

public class MobilePage extends TestBase
{
	

	@FindBy(className="product-name")
	List<WebElement> listProductNames;
	
	@FindBy(xpath="//div[@class='category-products']//following::select[1]")
	WebElement sorttByHeader;
	
	
	@FindBy(id="product-price-1")
	WebElement listPageCost;
	
	@FindBy(linkText="SONY XPERIA")
	
	WebElement sonyXperiaProduct;
	
	@FindBy(xpath="//button[@type='button' and @title='Add to Cart']//span[1]")
	WebElement addtocartSonyXperia;
	
	
	
	
	
	
	
	
	
	
	
	public MobilePage() throws IOException
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public String validateMobilePageTitle()
	{
		return driver.getTitle();
	}
	
	
	public List<WebElement> getProductNameList()
	{
		return listProductNames;
	}
	
	public WebElement sortByHeader()
	{
		return sorttByHeader;
	}
	
	
	public String getProductCostOnListPage()
	{
		return listPageCost.getText();
	}
	
	
	public ProductDetailPage clickedSonyXperiaProduct() throws IOException
	{
		sonyXperiaProduct.click();
		return new ProductDetailPage();
	}
	
	public AddToCartPage addToCartClicked() throws IOException
	{
		addtocartSonyXperia.click();
		
		return new AddToCartPage();
	}
	
	
	
	
	
	 
	
}
