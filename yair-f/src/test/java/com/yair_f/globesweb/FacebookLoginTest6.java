package com.yair_f.globesweb;
import java.util.Iterator;
import java.util.Set;
import org.testng.annotations.Test;
import com.yair_f.globespages.FacebookPage;
import com.yair_f.globespages.GlobesHomePage;
import com.yair_f.globespages.GlobesLoginPage;
import config.BaseTest;
import config.PropertiesFile;

public class FacebookLoginTest6 extends BaseTest{

 @Test(description = "Test to login to globes with facebook account") 
 public void facebookLogin () throws Exception  {
		try 
		 {
		  System.out.println("Start LoginSession function...");
		     
		     String homePageUrl = PropertiesFile.getInstance().getConfig("homePageUrl");
		     String email =       PropertiesFile.getInstance().getConfig("email");
		     String password =    PropertiesFile.getInstance().getConfig("password");
		     
		     driver.get(homePageUrl);
		     
		     GlobesHomePage hp=new  GlobesHomePage(driver);
			   
			  hp.alertPopup().click();
	  
	         Thread.sleep(3000);
	         
             hp.loginConnectButton().click();
             
        	 GlobesLoginPage lp=new  GlobesLoginPage(driver);
        	 
             lp.facebookBtn().click();
     
            Set<String>ids=driver.getWindowHandles();
     
           Iterator<String> it=ids.iterator();
     
           String parentid=it.next();
     
          String childid=it.next();
    		 
          driver.switchTo().window(childid);
     
	     System.out.println (driver.getTitle());

	     FacebookPage fp =new  FacebookPage(driver);
        
         fp.fbEmail().sendKeys(email);
        
         fp.fbPassword().sendKeys(password);
        
         fp.fbLoginBtn().click();
        
          System.out.println(email+  " is succesfully log in with facebook account ");
		 }
     catch(Exception ex)
	 {
		 System.out.println("LoginSession error occured: " + ex.getMessage()); 
	 
         System.out.println("End LoginSession function...");
     }

   }  
 
}
