package com.magneto.testcases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.magento.base.TestBase;
import com.magento.pages.HomePage;
import com.magento.pages.MobilePage;
import com.magento.pages.ProductDetailPage;

public class MobileTestCase extends TestBase
{
	 HomePage homepage;
	 MobilePage mobilepage;
	 ProductDetailPage detailPage;
  
  public MobileTestCase() throws IOException
  {
		super();
  }

@BeforeMethod
  public void setUp() throws IOException 
  {
	  initialization();
	  homepage=new HomePage();
	  detailPage=new ProductDetailPage();
	  mobilepage=homepage.validateMobileMenuClicked();
	  
	  
  }

/*@Test
public void verifyTitleOfMobilePage() throws IOException
{
	MobilePage mobilepage=homepage.validateMobileMenuClicked();
	Assert.assertEquals("Mobile", mobilepage.validateMobilePageTitle());
}*/
	
/*@Test
public void verifyListPageSortedByName() throws IOException
{
	MobilePage mobilepage=homepage.validateMobileMenuClicked();
	List<WebElement> listProductNames=	mobilepage.getProductNameList();
	ArrayList<String> list=new ArrayList<String>();
	  
	  for(int i=0;i<listProductNames.size();i++)
	  {
		  list.add(listProductNames.get(i).getText());
	  }
	  
	  Collections.sort(list);
	  System.out.println(list);
	  
	  WebElement sortByClicked=mobilepage.sortByHeader();
	  sortByClicked.click();
	  Select select =new Select(sortByClicked);
	  select.selectByVisibleText("Name");
	  
	  
	  
	  System.out.println("//-------List After sorting by name");
	  
	  List<WebElement> newListProductNames=	mobilepage.getProductNameList();
	  
	  ArrayList<String> newlist=new ArrayList<String>();
	  
	  for(int i=0;i<newListProductNames.size();i++)
	  {
		  newlist.add(newListProductNames.get(i).getText());
	  }
	  
	 
	  
	  Assert.assertTrue(list.equals(newlist), "All 3 products are sorted by name");
}
*/



@Test
public void compareItemCostInListAndDetailPage() throws IOException
{
	String listPageCost=mobilepage.getProductCostOnListPage();
	mobilepage.clickedSonyXperiaProduct();
	String detailPageCost=detailPage.getProductCostOnDetailPage();
	
	Assert.assertEquals(detailPageCost, listPageCost);
	
}

















}

