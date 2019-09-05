package com.yair_f.globesweb;
import java.util.Iterator;
import java.util.Set;
import org.testng.annotations.Test;
import com.yair_f.globespages.GlobesHomePage;
import com.yair_f.globespages.GlobesLoginPage;
import com.yair_f.globespages.GooglePage;
import config.BaseTest;
import config.PropertiesFile;

 public class GoogleLoginTest3 extends BaseTest {
	
 @Test(description = "Test to login with google account")	
 public  void googleLogin () throws Exception {

            String homePageUrl = PropertiesFile.getInstance().getConfig("homePageUrl");
            String email =       PropertiesFile.getInstance().getConfig("email");
            String password =    PropertiesFile.getInstance().getConfig("password");
		
		  driver.get(homePageUrl);
		     
		  GlobesHomePage hp=new  GlobesHomePage(driver);
		   
		  hp.alertPopup().click();
		  
		  hp.loginConnectButton().click();
		  
		 GlobesLoginPage lp=new  GlobesLoginPage(driver);
		 
		 lp.googleBtn().click();
    
		 System.out.println("Inside Google Login"); 

         Set<String>ids=driver.getWindowHandles();
             
         Iterator<String> it=ids.iterator();
             
         String parentid=it.next();
             
         String childid=it.next();
            		 
         driver.switchTo().window(childid);
             
        System.out.println (driver.getTitle());
        
        GooglePage gp = new  GooglePage(driver);
        
        gp.googleUserName().sendKeys(email);
        
        gp.nextBtn().click();
                
	    Thread.sleep(1000);
	    
	    gp.googlePassword().sendKeys(password);
	    
	    gp.NextBtnLogin().click();
	 
	    System.out.println(email+ " succesffuly Log in to Globes with Google Account");	        			 
    }
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	


	
	
