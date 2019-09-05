package com.yair_f.globespages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnewsPaperPage {
	
		   WebDriver driver;
		   
		   public EnewsPaperPage (WebDriver driver){
		   		
		   	this.driver=driver;	

       }
		   By eNewsDailyEdition = By.cssSelector("#magazinim-boxes > div:nth-child(1) > a:nth-child(1) > img:nth-child(1");
		   
		   
		   public WebElement eNewsDailyEdition() {

		   return driver.findElement(eNewsDailyEdition);

	    }
	}

