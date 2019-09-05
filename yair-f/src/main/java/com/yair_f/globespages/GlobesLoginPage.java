package com.yair_f.globespages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GlobesLoginPage {
	
	   WebDriver driver;
	   public GlobesLoginPage(WebDriver driver){
	   		
	   	this.driver=driver;	

	   	}

By emailField = (By.id("email"));
By passWordField = (By.id("password"));
By signInBtn = (By.id("signin"));
By errorMessage = (By.id("signin_message"));
By forgotPwd = By.id("forgot_password");
By resetBtn = By.id("reset_password");
By facebookBtn = By.id("facebook_connector");
By googleBtn = By.className("google-btn");
By registerLink = By.id("register");
By loginBtn = By.id("signin");
By checkBox = By.id("cb");
By createAccountBtn =By.id("register_and_signin");

public WebElement emailField () {

return driver.findElement(emailField);

    }
public WebElement passWordField() {

return driver.findElement(passWordField);

    }
public WebElement errorMessage() {

return driver.findElement(errorMessage);

    }
public WebElement forgotPwd() {

return driver.findElement( forgotPwd);

    }

public WebElement facebookBtn() {

return driver.findElement(facebookBtn);

    }
public WebElement googleBtn() {

return driver.findElement(googleBtn);

    }
public WebElement registerlink() {

return driver.findElement(registerLink);

    }
public WebElement loginBtn() {

return driver.findElement(loginBtn);

    }
public WebElement checkBox() {

return driver.findElement(checkBox);

    }
public WebElement resetBtn() {

return driver.findElement(resetBtn);

    }
public WebElement createAccountBtn() {

return driver.findElement(createAccountBtn);

    }
}