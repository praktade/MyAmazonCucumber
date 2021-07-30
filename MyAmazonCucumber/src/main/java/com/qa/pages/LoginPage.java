package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.BaseClass;

public class LoginPage extends BaseClass {
	
	 @FindBy(xpath = "//input[@type='email']")
	 WebElement username;
	 
	 @FindBy(xpath= "//input[@id='continue']")
	 WebElement next;
	 
	 @FindBy(xpath = "//input[@type='password']")
	 WebElement password;
	 
	 @FindBy(xpath= "//input[@id='signInSubmit']")
	 WebElement signIn;
	 
	 
	 public LoginPage() {
		 PageFactory.initElements(driver, this); //PageFactroy is a class and intiElement is method which will  
		                                         // intilize all the webelement with the driver. so automatically it will take driver.findelement etc
	 }

	public void AmazonLogin(String user, String pass) {
		username.sendKeys(user);
		next.click();
		password.sendKeys(pass);
		signIn.click();
		
		
	}
	
	 

}
