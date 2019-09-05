package com.yair_f.globesweb;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import com.yair_f.globespages.GlobesHomePage;
import com.yair_f.globespages.GlobesLoginPage;
import com.yair_f.globespages.TagitPage;
import config.BaseTest;
import config.PropertiesFile;

public class SubscribeToTevaTagitTest10 extends BaseTest{
	
	@Test(description = "Test to subscribe to a tagit ")
	public  void subscribeToTagit() throws Exception  {
             String tevaTagitUrl= PropertiesFile.getInstance().getConfig("tevaTagitUrl");
             String email=        PropertiesFile.getInstance().getConfig("email");
	         String password=     PropertiesFile.getInstance().getConfig("password");

			 driver.get(tevaTagitUrl);
			 
			 GlobesHomePage hp=new  GlobesHomePage(driver);
			      
			  hp.alertPopup().click();
			
	         driver.manage().window().maximize();
	         
	         hp.loginConnectButton().click();

	         GlobesLoginPage lp=new  GlobesLoginPage(driver);
	         
	         lp.emailField().sendKeys(email);
	         
	         lp.passWordField().sendKeys(password);
	         
	         lp.loginBtn().click();
 
			 Thread.sleep(3000);
			 
			 TagitPage tp=new TagitPage(driver);
			 
			 tp.tagitBtn().click();

			 String jsFunction =tp.tagitBtn().getAttribute("href");
			  
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			  
			 js.executeScript(jsFunction);
			 
			 System.out.println (driver.getTitle());  
			 
			 Thread.sleep(2000);
			 
		    System.out.println (" Tagit Teva was added succesfully ");
	}
}

	


