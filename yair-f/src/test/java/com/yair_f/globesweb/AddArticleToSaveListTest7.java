package com.yair_f.globesweb;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.yair_f.globespages.GlobesArticlePage;
import com.yair_f.globespages.GlobesHomePage;
import com.yair_f.globespages.GlobesLoginPage;
import com.yair_f.globespages.SavedArticlesPage;
import config.BaseTest;
import config.PropertiesFile;

public class AddArticleToSaveListTest7 extends BaseTest {

	@Test(description ="Test to add specific article to save list page")	
	public void addArticle () throws Exception {
		     String savedArticleID =      PropertiesFile.getInstance().getConfig("savedArticleID");
		     String savedArticleListURL = PropertiesFile.getInstance().getConfig("savedArticleListUrl");
		     String email =               PropertiesFile.getInstance().getConfig("email");
		     String password =            PropertiesFile.getInstance().getConfig("password");
		     		           
		      driver.get(savedArticleID);
		     
	          driver.manage().window().maximize();
		     
		       GlobesHomePage hp=new  GlobesHomePage(driver);
			   
			   hp.alertPopup().click();
			    
		       GlobesArticlePage ap=new  GlobesArticlePage(driver);
		       
			    Thread.sleep(5000);
			 
			     ap.favoriteListBtn().click();
			  
				 GlobesLoginPage lp=new  GlobesLoginPage(driver);

				 lp.emailField().sendKeys(email);
				 
				 lp.passWordField().sendKeys(password);
				 
				 lp.loginBtn().click();
				 
			     System.out.println(email + " is succesfuly log in to globes"); 

			     Thread.sleep(3000);
			 
			     driver.get(savedArticleListURL);
			     
				 System.out.println (driver.getTitle());
			     
			     SavedArticlesPage sap = new SavedArticlesPage(driver);

			     WebElement arrElements = sap.saved();
			    
				System.out.println("Article " + savedArticleID + " exists in saved list!!!");	
	
	    }
	}
	
	
	
	
	
	
	
	
	
	
	

