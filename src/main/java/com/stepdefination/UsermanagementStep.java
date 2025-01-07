package com.stepdefination;

import java.util.List;

import org.testng.Assert;

import com.testingShastra.Keyword;
import com.testingShastra.pages.DashboardPage;
import com.testingShastra.pages.PIMPage;
import com.testingShastra.pages.UserPageManagement;
import com.testingShastra.pages.loginpage;
import com.testinhShastra.utile.App;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UsermanagementStep {

	@Given("Application Url is launched")
	public void launchAppUrl() {
		Keyword keyword = new Keyword();
		keyword.LaunchBrowser("Chrome");
		keyword.launchUrl(App.getAppUrl("qa"));

	}

	@And("User must be logged into the system")
	public void loginToSystem() throws InterruptedException {
		loginpage Loginpage = new loginpage();
		Thread.sleep(3000);
		Loginpage.enterUsername("Admin");
		Loginpage.enterPassword("admin123");
		Loginpage.clickOnLoginBtn();

	}

	@When("User clicks on PIM menu")
	public void user_clicks_on_pim_menu() throws InterruptedException {// snake case
		DashboardPage dashboard = new DashboardPage();
		
		Thread.sleep(4000);

		dashboard.waitForPimMenuToBeVisible();
		dashboard.clickOnPimMenu();

	}

	@And("User clicks on Add button")
	public void user_clicks_on_add_button() throws InterruptedException {
		PIMPage pimpage = new PIMPage();
		Thread.sleep(5000);
		pimpage.clickAddButton();

	}

	@And("Creates and user with valid details")
	public void creates_and_user_with_valid_details() throws InterruptedException {
		PIMPage pimpage = new PIMPage();
		Thread.sleep(6000);
		pimpage.setfirstname("minakshi");
		pimpage.setmiddlename("subrav");
		pimpage.setlastname("kokate");
		pimpage.clickOnSaveButton();
	}

	@When("User clicks in Admin menu")
	public void user_clicks_in_admin_menu() throws InterruptedException {
		PIMPage pimpage = new PIMPage();
		DashboardPage dashboard = new DashboardPage();
		Thread.sleep(7000);
		dashboard.clickonAdminMenu();

	}

	@And("Click on Add button on user management  page")
	public void click_on_add_button_on_user_management_page() throws InterruptedException {
		PIMPage pimpage = new PIMPage();
		Thread.sleep(8000);
		pimpage.clickAddButton();

	}

	@When("User selects role as ESS")
	public void user_selects_role_as_ess() throws InterruptedException {
		UserPageManagement usermgmt = new UserPageManagement();
		usermgmt.selectRole("ESS");

	}

	@And("Enters name as Employe name")
	public void enters_name_as_employe_name() throws InterruptedException {
		UserPageManagement usermgmt = new UserPageManagement();
		usermgmt.enterEmployeeName("minakshi");

	}

	@Then("Populated list must contain newly created user")
	public void populated_list_must_contain_newly_created_user() {
		UserPageManagement usermgmt = new UserPageManagement();
		List<String> names = usermgmt.getemployenames();
		Assert.assertTrue(names.contains("minakshi"));
	}

}