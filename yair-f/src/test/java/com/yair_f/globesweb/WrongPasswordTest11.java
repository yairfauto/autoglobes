package com.yair_f.globesweb;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.yair_f.globespages.GlobesHomePage;
import com.yair_f.globespages.GlobesLoginPage;
import config.BaseTest;

public class WrongPasswordTest11 extends BaseTest{

	@DataProvider(name="getData")
	@Test(description ="Test flow when password is wrong")
	public Object [][] getData()
	{
		 Object [][] data = new Object [1][3];
		 
		 data [0][0] = "https://www.globes.co.il";
		 data [0][1] = "globestest18@gmail.com";
		 data [0][2] = "globes11";
		 
		return data;
	 }
	  
	 @Test(dataProvider="getData")
	 public  void wrongPassword(String homeUrl,String userName,String password) throws Exception {
		 
	      driver.get(homeUrl);
	     
		  System.out.println (driver.getTitle());

	      GlobesHomePage hp=new  GlobesHomePage(driver);
		   
		  hp.alertPopup().click();
		  
		  hp.loginConnectButton().click();
		  
		  GlobesLoginPage lp = new GlobesLoginPage(driver);
		  
		  lp.emailField().sendKeys(userName);
		  
		  lp.passWordField().sendKeys(password);
		  
		 // lp.loginBtn().click();
	     
	      Thread.sleep(2000);
	      
	      WebElement errorMessage = lp.errorMessage(); 
	      
	      String errorMessageTemplate = "דוא\"ל או סיסמה לא נכונים";
	      
	      String errorMessageText = errorMessage.getText();	      
	      
	     Assert.assertEquals(errorMessageTemplate,errorMessageText);
	      
	     System.out.println (errorMessageTemplate);
  }
}