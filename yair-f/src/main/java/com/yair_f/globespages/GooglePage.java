package com.yair_f.globespages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePage {
	
	   WebDriver driver;
	   
	   public  GooglePage (WebDriver driver){
	   		
	   	this.driver=driver;	
}
By googleUserName = By.id("identifierId");

By nextBtn = By.cssSelector(" #identifierNext > span:nth-child(3) > span:nth-child(1)");

By googlePassword = By.name("password");

By NextBtnLogin = By.cssSelector("#passwordNext > span:nth-child(3) > span:nth-child(1)");


public WebElement googleUserName() {

return driver.findElement(googleUserName);

    }
public WebElement  nextBtn() {

return driver.findElement( nextBtn);

    }
public WebElement  googlePassword() {

return driver.findElement(googlePassword);

    }
public WebElement  NextBtnLogin() {

return driver.findElement(NextBtnLogin);

    }
}
