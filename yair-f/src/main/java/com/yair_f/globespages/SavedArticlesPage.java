package com.yair_f.globespages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SavedArticlesPage {


	WebDriver driver;
	public  SavedArticlesPage (WebDriver driver){
		this.driver=driver;	
	}
	
	By saved = (By.className("ListArticles"));

	public WebElement saved() {

		return driver.findElement(saved);

	}
}
