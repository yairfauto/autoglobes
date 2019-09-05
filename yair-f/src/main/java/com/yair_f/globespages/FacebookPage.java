package com.yair_f.globespages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookPage {
	
	   WebDriver driver;
	   public  FacebookPage (WebDriver driver){
	   		
	   	this.driver=driver;	

     }
	   
By fbEmail = By.id("email");

By fbPassword = By.id("pass");

By fbLoginBtn = By.name("login");

By fbPublishBtn = By.id("u_0_24");

public WebElement fbEmail () {


return driver.findElement(fbEmail);

    }
public WebElement fbPassword () {


return driver.findElement(fbPassword);

    }
public WebElement fbLoginBtn () {


return driver.findElement(fbLoginBtn);

    }
public WebElement fbPublishBtn() {


return driver.findElement(fbPublishBtn);

    }
}
