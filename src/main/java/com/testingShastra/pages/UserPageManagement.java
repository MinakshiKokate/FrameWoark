package com.testingShastra.pages;

import java.util.ArrayList;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testingShastra.Keyword;

public class UserPageManagement {

	@FindBy(css = "div.orangehrm-header-container button]")
	private WebElement addBtn;

	@FindBy(css = "div.oxd-select-text")
	private WebElement UserRoleList;

	@FindBy(css = "div[role='listbox']div>span")
	private List<WebElement> roleList;

	@FindBy(css = "input[placeholder=\"Type for hints...\"]")
	private WebElement employeeName;

	@FindBy(css = "div[role='listbox']div>span")
	private List<WebElement> employename;

	public  UserPageManagement() {
		PageFactory.initElements(Keyword.driver, this);
	}

	public UserPageManagement clickOnSelectbtn() {
		UserRoleList.click();
		return this;

	}

	public void selectRole(String roleName)  {
		
		for (WebElement role : roleList) {
			if (role.getText().equalsIgnoreCase(roleName)) {
				role.click();
				break;

			}

		}

	}

	public void enterEmployeeName(String employename) throws InterruptedException {
		this.employeeName.sendKeys(employename);
		Thread.sleep(3000);

	}

	public List<String> getemployenames() {
		List<String> names = new ArrayList<String>();
		for (WebElement employename : employename) {
			names.add(employename.getText());

		}
		return names;
	}
}
