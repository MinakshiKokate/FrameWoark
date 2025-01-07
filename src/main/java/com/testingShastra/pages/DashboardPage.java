package com.testingShastra.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testingShastra.Keyword;

public class DashboardPage {

	@FindBy(css = "a[href*=PimModule]")
	WebElement pimmenu;

	@FindBy(css = "a[href*=AdminModule]")
	private WebElement adminMenu;

	public DashboardPage() {
		PageFactory.initElements(Keyword.driver, this);

	}

	public void clickOnPimMenu() {
		pimmenu.click();

	}

	public void waitForPimMenuToBeVisible() {
		Keyword keyword = new Keyword();
		keyword.waitForElementToBeVisible(pimmenu);
	}

	public void clickonAdminMenu() {
		adminMenu.click();
	}

}
