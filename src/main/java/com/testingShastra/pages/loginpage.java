package com.testingShastra.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testingShastra.Keyword;

public class loginpage {

	@FindBy(css = "input[name=\"username\"]")
	WebElement usernameTxt;

	@FindBy(css = "input[name=\"password\"]")
	WebElement passwordTxtbx;

	@FindBy(css = "button[type=\"submit\"]")
	WebElement loginbtn;

	public void enterUsername(String username) {
		usernameTxt.sendKeys(username);
	}

	public loginpage() {
		PageFactory.initElements(Keyword.driver, this); // this is use for current class instance
	}

	public void enterPassword(String password) {
		passwordTxtbx.sendKeys(password);

	}

	public void clickOnLoginBtn() {
		loginbtn.click();
	}

	public void waitForUserNameToBeVisible() {

		Keyword keyword = new Keyword();
		keyword.waitForElementToBeVisible(usernameTxt);

	}

}
