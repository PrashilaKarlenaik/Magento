package com.magneto.testcases;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.magento.base.TestBase;
import com.magento.pages.AddToComparePage;
import com.magento.pages.HomePage;
import com.magento.pages.MobilePage;
import com.magento.pages.ProductDetailPage;

public class AddToCompareTestCase extends TestBase 
{
	MobilePage  mobilepage;
	HomePage homepage;
	AddToComparePage addToCompare;
	
  
	public AddToCompareTestCase() throws IOException 
	{
		super();
		
	}

	@BeforeMethod
	  public void setUp() throws IOException 
	  {
		initialization();
		homepage=new HomePage();
		mobilepage=homepage.validateMobileMenuClicked();
		addToCompare=new AddToComparePage();
		  
		  
	  }
@Test
  
public void verifyCompareTwoProducts() 
{
	addToCompare.clickXperiaAddToCompareButton();
	addToCompare.clickiphoneAddToCompareButton();
	addToCompare.clickCompareButton();
	String switchTitle="Products Comparison List - Magento Commerce";
						
	Set<String>windowID=addToCompare.clickCompareButton();
	Iterator<String> id=windowID.iterator();
	
	for(int i=0;i<windowID.size();i++)
	{
		String abc=id.next();
		driver.switchTo().window(abc);
		
		String title=driver.getTitle();
		if(title.equalsIgnoreCase(switchTitle))
		{
			String actual=driver.findElement(By.xpath("//div[@class='page-title title-buttons']/h1")).getText();
			Assert.assertEquals(actual, "COMPARE PRODUCTS");
			List<WebElement> listProductNames=mobilepage.getProductNameList();
			for(int j=0;j<listProductNames.size();j++)
			{
				System.out.println(listProductNames.get(j).getText());
				if(listProductNames.get(j).getText().equalsIgnoreCase("Sony Xperia")||listProductNames.get(j).getText().equalsIgnoreCase("IPhone"))
				{
					System.out.println("pass");
	
				}
			}
			
			
			
			
			
			
			
			driver.close();
		}
		
	}

}



}