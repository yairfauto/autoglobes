package com.yair_f.globesweb;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import com.yair_f.globespages.EnewsPaperPage;
import com.yair_f.globespages.GlobesHomePage;
import config.BaseTest;
import config.PropertiesFile;

public class ElectronicNewsPaperTest8 extends BaseTest{
	
	@Test(description ="Test to open daily globes edition")
	public void electronicNewsPaper () throws Exception {
		   
	       String homePageUrl = PropertiesFile.getInstance().getConfig("homePageUrl");

	         driver.get(homePageUrl);

			  LoginTest1 loginTest = new LoginTest1(); 
			  loginTest.driver = driver;
			  loginTest.loginSession();
			  
			   Thread.sleep(3000);

	       GlobesHomePage hp=new  GlobesHomePage(driver);
	       
	       hp.userMenu().click();
		   
		   Actions action = new Actions(driver);
		  
		   action.moveToElement(hp.eNewsPaperBtn()).build().perform();
		      
		   Thread.sleep(3000);
		
		   hp.eNewsPaperBtn().click();
		      
		   Thread.sleep(5000);
		   
		   EnewsPaperPage en = new  EnewsPaperPage(driver); 
		   
		   en.eNewsDailyEdition().click();
		      
		   System.out.println("User is successfuly log into EnewsPaper Daily Edition ");
	      }
	}

