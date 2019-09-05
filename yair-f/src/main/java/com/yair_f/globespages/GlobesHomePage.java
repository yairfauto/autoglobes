package com.yair_f.globespages;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class GlobesHomePage {
   WebDriver driver;
public GlobesHomePage(WebDriver driver){
		
	this.driver=driver;	

	}


By loginConnectButton=By.id("Login_connect_Span");

By alertPopup=By.cssSelector(".btnBlocked");

By mainArticle =By.cssSelector("#mainArticleImg");
//after login
By userMenu = (By.cssSelector("#userLinks > span:nth-child(1)"));

By eNewsPaperBtn = By.className("HeaderUserProduct8");

By disconnectBtn = By.className("HeaderUserDisconnect");


public WebElement alertPopup() {

return driver.findElement(alertPopup);

    }
public WebElement loginConnectButton() {

return driver.findElement(loginConnectButton);

    }
public WebElement mainArticle() {

return driver.findElement(mainArticle);

    }

public WebElement eNewsPaperBtn() {

return driver.findElement(eNewsPaperBtn);

    }
public WebElement userMenu() {

return driver.findElement(userMenu);

    }
public WebElement disconnectBtn() {

return driver.findElement(disconnectBtn);

    }
}