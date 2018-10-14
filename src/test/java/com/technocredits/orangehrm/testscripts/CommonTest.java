package com.technocredits.orangehrm.testscripts;

import com.technocredits.orangehrm.base.PredefinedMethodsold;
import com.technocredits.orangehrm.pages.LoginPage;

public class CommonTest extends PredefinedMethodsold{

	void login(String username,String password){
		LoginPage loginpageInstance = LoginPage.getInstance();
		loginpageInstance.enterValueForLoginPage("//input[@id='txtUsername']", username);
		loginpageInstance.enterValueForLoginPage("//input[@id='txtPassword']", password);
		loginpageInstance.clickOnLoginPage("//input[@id='btnLogin']");
	}
	
	
}
