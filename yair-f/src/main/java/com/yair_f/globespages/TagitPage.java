package com.yair_f.globespages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TagitPage {
	
	   WebDriver driver;
	   
public  TagitPage  (WebDriver driver){
	   		
	   	this.driver=driver;	

	   	}

By tagitBtn = By.cssSelector("a.btnProp:nth-child(1)");

public WebElement tagitBtn () {

	return driver.findElement(tagitBtn );

	    }

}
