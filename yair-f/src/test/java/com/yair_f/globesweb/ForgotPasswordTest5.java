package com.yair_f.globesweb;
import java.io.IOException;
import org.testng.annotations.Test;
import com.yair_f.globespages.GlobesHomePage;
import com.yair_f.globespages.GlobesLoginPage;
import config.BaseTest;
import config.PropertiesFile;

public class ForgotPasswordTest5 extends BaseTest{

 @Test(description = "Test forgot password flow in globes") 
 public void resetPassword() throws IOException {
	
	     String homePageUrl = PropertiesFile.getInstance().getConfig("homePageUrl");
         String email =       PropertiesFile.getInstance().getConfig("email");
         String password =    PropertiesFile.getInstance().getConfig("password");
            
		  driver.get(homePageUrl);
		 
		  GlobesHomePage hp=new  GlobesHomePage(driver);
		   
		  hp.alertPopup().click();
		  
		  hp.loginConnectButton().click();
		  
	      GlobesLoginPage lp=new  GlobesLoginPage(driver);
	      
	      lp.forgotPwd().click();
	     
	      lp.emailField().sendKeys(email);
	     
	      lp.resetBtn().click();

		 System.out.println (driver.getTitle());

	     System.out.println(" Mail is succesfully sent to " +email); 
		}
		 
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


