package com.yair_f.globesweb;
import java.io.IOException;
import org.testng.annotations.Test;
import com.yair_f.globespages.GlobesHomePage;
import com.yair_f.globespages.GlobesLoginPage;
import config.BaseTest;
import config.PropertiesFile;

 public class LoginTest1 extends BaseTest{
	 
 @Test(description = "login process to globes") 
 public void loginSession () throws IOException { 
 	   System.out.println("Start LoginSession function...");

    	String homePageUrl= PropertiesFile.getInstance().getConfig("homePageUrl");
        String emailuser=       PropertiesFile.getInstance().getConfig("emailuser");
        String emailuserpwd=    PropertiesFile.getInstance().getConfig("emailuserpwd");
   
     driver.get(homePageUrl);
     
     GlobesHomePage hp=new  GlobesHomePage(driver);
	   
	 hp.alertPopup().click();
	 
	 hp.loginConnectButton().click();
	 
	 GlobesLoginPage lp=new  GlobesLoginPage(driver);
	 
	 lp.emailField().sendKeys(emailuser);
	 
	 lp.passWordField().sendKeys(emailuserpwd);
	 
	 lp.loginBtn().click();
	
	 System.out.println (driver.getTitle());
	 
     System.out.println(emailuser + " is succesfuly log in to globes"); 
      }
	
  }