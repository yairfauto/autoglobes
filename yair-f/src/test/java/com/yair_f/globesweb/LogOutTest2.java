package com.yair_f.globesweb;
import org.testng.annotations.Test;
import com.yair_f.globespages.GlobesHomePage;
import config.BaseTest;
import config.PropertiesFile;

 public class LogOutTest2 extends BaseTest {

 @Test(description = "Test to disconnect from globes account")
 public  void disconnectUser() throws Exception{
	 
 				  LoginTest1 loginTest = new LoginTest1(); 
				  
 				  loginTest.driver = driver;
				  
				  loginTest.loginSession();
				 
		          driver.manage().window().maximize();
		         
			     String email= PropertiesFile.getInstance().getConfig("email");

				 Thread.sleep(5000);

				 System.out.println("Start DisconnectUser function...");
				 
			     GlobesHomePage hp=new  GlobesHomePage(driver);
			    
				 hp.userMenu().click();
				 
				 hp.disconnectBtn().click();
			
			     System.out.println(email + " is Disconnected from globes"); 
			    }
		 }
	

	
	
	
	
	


