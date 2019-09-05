package com.yair_f.globesweb;
import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import com.yair_f.globespages.GlobesHomePage;
import com.yair_f.globespages.GlobesLoginPage;

import config.BaseTest;
import config.PropertiesFile;

public class RegisterToGlobesTest4 extends BaseTest{
	
  @Test(description ="Test to register new user to globes")
  public void registration () throws IOException {
     String homePageUrl= PropertiesFile.getInstance().getConfig("homePageUrl");
	 String newUserMail = PropertiesFile.getInstance().getConfig("newUserMail");
     String password = PropertiesFile.getInstance().getConfig("password");
     
	 driver.get(homePageUrl);
	    
	  GlobesHomePage hp=new  GlobesHomePage(driver);
	   
	  hp.alertPopup().click();
	  
	  hp.loginConnectButton().click();
	  
	  GlobesLoginPage lp=new  GlobesLoginPage(driver);
	  
	  lp.registerlink().click();
	  
	  lp.emailField().sendKeys(newUserMail);
	  
	  lp.passWordField().sendKeys(password);
	 
	  lp.checkBox();

	 ((JavascriptExecutor)driver).executeScript("arguments[0].click()",lp.checkBox());
	 
	  lp.createAccountBtn().click();
	  
      System.out.println(newUserMail+  " succesfuly registerd on globes ");
      }
  }
