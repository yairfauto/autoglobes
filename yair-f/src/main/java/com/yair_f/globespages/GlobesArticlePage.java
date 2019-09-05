package com.yair_f.globespages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GlobesArticlePage {
	

	   WebDriver driver;
	   public  GlobesArticlePage (WebDriver driver){
	   		
	   	this.driver=driver;	

	   	}

	By  favoriteListBtn =(By.cssSelector("div.socialLinks:nth-child(3) > a:nth-child(6)"));
	
    By fbShareBtn = (By.className("facebook"));
	
	public WebElement favoriteListBtn() {

		return driver.findElement(favoriteListBtn);

		    }
	public WebElement fbShareBtn() {

		return driver.findElement(fbShareBtn);

		    }
}
