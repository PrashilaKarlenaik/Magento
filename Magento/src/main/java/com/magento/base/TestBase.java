package com.magento.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase
{
	  public Properties prop ;
	  public static WebDriver driver;
	
	
	
		public TestBase() throws IOException
		{
		prop= new Properties();
		FileInputStream file=new FileInputStream("C:\\Users\\Prashila\\eclipse-workspace\\Magento\\src\\main\\java\\com\\magento\\base\\config.properties");
		prop.load(file);
		}
		
		
		public  void initialization()
		{
			String browser=prop.getProperty("browser");
			
			if(browser.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver" ,"C:\\selenium files\\chromedriver_win32\\chromedriver.exe");
				driver=new ChromeDriver();
			}
			
			else 
			{
				System.out.println("Please provide driver path of your expected browser");
			}
			
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
			
			}
		}
		
		
	
	

