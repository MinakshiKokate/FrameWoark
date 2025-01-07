package com.testingShastra.pages;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.testingShastra.Keyword;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PIMPage {
	private Map<String, String> data;


	@FindBy(css = "#app div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(2) div.orangehrm-background-container div:nth-of-type(2) div:nth-of-type(1) button.oxd-button.oxd-button--medium.oxd-button--secondary")
	@CacheLookup
	private WebElement add;

	@FindBy(css = "#app div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(2) div.orangehrm-background-container div:nth-of-type(2) div:nth-of-type(3) div.oxd-table.orangehrm-employee-list div:nth-of-type(1) div.oxd-table-row.oxd-table-row--with-border div:nth-of-type(1) div.oxd-checkbox-wrapper label input[type='checkbox']")
	@CacheLookup
	private WebElement add1RecordFoundidfirstMiddle;

	@FindBy(css = "#app div:nth-of-type(1) div:nth-of-type(1) header.oxd-topbar div:nth-of-type(2) nav.oxd-topbar-body-nav ul li:nth-of-type(3) a.oxd-topbar-body-nav-tab-item")
	@CacheLookup
	private WebElement addEmployee;

	@FindBy(css = "a[href='/web/index.php/admin/viewAdminModule']")
	@CacheLookup
	private WebElement admin;

	@FindBy(css = "a[href='/web/index.php/buzz/viewBuzz']")
	@CacheLookup
	private WebElement buzz;

	@FindBy(css = "a[href='/web/index.php/claim/viewClaimModule']")
	@CacheLookup
	private WebElement claim;

	@FindBy(css = "a.oxd-brand")
	@CacheLookup
	private WebElement clientBrandLogo;

	@FindBy(css = "a[href='/web/index.php/dashboard/index']")
	@CacheLookup
	private WebElement dashboard;

	@FindBy(css = "a[href='/web/index.php/directory/viewDirectory']")
	@CacheLookup
	private WebElement directory;

	@FindBy(css = "#app div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(2) div.orangehrm-background-container div:nth-of-type(1) div:nth-of-type(2) form.oxd-form div:nth-of-type(1) div.oxd-grid-4.orangehrm-full-width-grid div:nth-of-type(2) div.oxd-input-group.oxd-input-field-bottom-space div:nth-of-type(2) input.oxd-input.oxd-input--active")
	@CacheLookup
	private WebElement employeeId;

	@FindBy(css = "#app div:nth-of-type(1) div:nth-of-type(1) header.oxd-topbar div:nth-of-type(2) nav.oxd-topbar-body-nav ul li:nth-of-type(2) a.oxd-topbar-body-nav-tab-item")
	@CacheLookup
	private WebElement employeeList;

	@FindBy(css = "#app div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(2) div.orangehrm-background-container div:nth-of-type(1) div:nth-of-type(2) form.oxd-form div:nth-of-type(1) div.oxd-grid-4.orangehrm-full-width-grid div:nth-of-type(1) div.oxd-input-group.oxd-input-field-bottom-space div:nth-of-type(2) div.oxd-autocomplete-wrapper div.oxd-autocomplete-text-input.oxd-autocomplete-text-input--active input")
	@CacheLookup
	private WebElement employeeName;

	@FindBy(css = "a[href='/web/index.php/leave/viewLeaveModule']")
	@CacheLookup
	private WebElement leave;

	@FindBy(css = "a[href='/web/index.php/maintenance/viewMaintenanceModule']")
	@CacheLookup
	private WebElement maintenance;

	@FindBy(css = "#app div:nth-of-type(1) div:nth-of-type(1) aside.oxd-sidepanel nav.oxd-navbar-nav div:nth-of-type(2) div.oxd-main-menu.--fixed div.oxd-main-menu-search input.oxd-input.oxd-input--active")
	@CacheLookup
	private WebElement mmAnhconfigurationEmployeeListaddEmployeereports;

	@FindBy(css = "#app div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(2) div.orangehrm-background-container div:nth-of-type(2) div:nth-of-type(3) div.oxd-table.orangehrm-employee-list div:nth-of-type(2) div.oxd-table-card div.oxd-table-row.oxd-table-row--with-border.oxd-table-row--clickable div:nth-of-type(1) div.oxd-table-card-cell-checkbox div.oxd-table-card-cell-hidden div.oxd-checkbox-wrapper label input[type='checkbox']")
	@CacheLookup
	private WebElement mmVnanhhrManagerDeletedfulltimePermanenthumanResources22;

	@FindBy(css = "a[href='/web/index.php/pim/viewMyDetails']")
	@CacheLookup
	private WebElement myInfo;

	@FindBy(css = "a[href='http://www.orangehrm.com']")
	@CacheLookup
	private WebElement orangehrmInc;

	private final String pageLoadedText = "";

	private final String pageUrl = "/web/index.php/pim/viewEmployeeList";

	@FindBy(css = "a[href='/web/index.php/performance/viewPerformanceModule']")
	@CacheLookup
	private WebElement performance;

	@FindBy(css = "a.oxd-main-menu-item.active")
	@CacheLookup
	private WebElement pim;

	@FindBy(css = "a[href='/web/index.php/recruitment/viewRecruitmentModule']")
	@CacheLookup
	private WebElement recruitment;

	@FindBy(css = "#app div:nth-of-type(1) div:nth-of-type(1) header.oxd-topbar div:nth-of-type(2) nav.oxd-topbar-body-nav ul li:nth-of-type(4) a.oxd-topbar-body-nav-tab-item")
	@CacheLookup
	private WebElement reports;

	@FindBy(css = "button.oxd-button.oxd-button--medium.oxd-button--ghost")
	@CacheLookup
	private WebElement reset;

	@FindBy(css = "button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space")
	@CacheLookup
	private WebElement search;

	@FindBy(css = "#app div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(2) div.orangehrm-background-container div:nth-of-type(1) div:nth-of-type(2) form.oxd-form div:nth-of-type(1) div.oxd-grid-4.orangehrm-full-width-grid div:nth-of-type(5) div.oxd-input-group.oxd-input-field-bottom-space div:nth-of-type(2) div.oxd-autocomplete-wrapper div.oxd-autocomplete-text-input.oxd-autocomplete-text-input--active input")
	@CacheLookup
	private WebElement supervisorName;

	@FindBy(css = "a[href='/web/index.php/time/viewTimeModule']")
	@CacheLookup
	private WebElement time;

	@FindBy(css = "a.orangehrm-upgrade-link")
	@CacheLookup
	private WebElement upgrade1;

	@FindBy(css = "button.oxd-glass-button.orangehrm-upgrade-button")
	@CacheLookup

	private WebElement upgrade2;
	
	@FindBy(css = "div.orangehrm-header-container button")
	private WebElement addbtn;
	
	@FindBy(css = "input[name=\"firstName\"]")
	private WebElement firstName;

	@FindBy(css = "input[name=\"middleName\"]")
	private WebElement middleName;

	@FindBy(css = "input[name=\"lastName\"]")
	private WebElement lastname;

	@FindBy(css = "button[type=\"submit\"]")
	private WebElement savebtn;


	public PIMPage() {
		PageFactory.initElements(Keyword.driver, this);
	}


	/**
	 * Click on Add Button.
	 *
	 * @return the PIMPage class instance.
	 */
	public PIMPage clickAddButton() {
		addbtn.click();
		return this;
	}

	/**
	 * Click on Add Employee Link.
	 *
	 * @return the PIMPage class instance.
	 */
	public PIMPage clickAddEmployeeLink() {
		addEmployee.click();
		return this;
	}

	/**
	 * Click on Admin Link.
	 *
	 * @return the PIMPage class instance.
	 */
	public PIMPage clickAdminLink() {
		admin.click();
		return this;
	}

	/**
	 * Click on Buzz Link.
	 *
	 * @return the PIMPage class instance.
	 */
	public PIMPage clickBuzzLink() {
		buzz.click();
		return this;
	}

	/**
	 * Click on Claim Link.
	 *
	 * @return the PIMPage class instance.
	 */
	public PIMPage clickClaimLink() {
		claim.click();
		return this;
	}

	/**
	 * Click on Client Brand Logo Link.
	 *
	 * @return the PIMPage class instance.
	 */
	public PIMPage clickClientBrandLogoLink() {
		clientBrandLogo.click();
		return this;
	}

	/**
	 * Click on Dashboard Link.
	 *
	 * @return the PIMPage class instance.
	 */
	public PIMPage clickDashboardLink() {
		dashboard.click();
		return this;
	}

	/**
	 * Click on Directory Link.
	 *
	 * @return the PIMPage class instance.
	 */
	public PIMPage clickDirectoryLink() {
		directory.click();
		return this;
	}

	/**
	 * Click on Employee List Link.
	 *
	 * @return the PIMPage class instance.
	 */
	public PIMPage clickEmployeeListLink() {
		employeeList.click();
		return this;
	}

	/**
	 * Click on Leave Link.
	 *
	 * @return the PIMPage class instance.
	 */
	public PIMPage clickLeaveLink() {
		leave.click();
		return this;
	}

	/**
	 * Click on Maintenance Link.
	 *
	 * @return the PIMPage class instance.
	 */
	public PIMPage clickMaintenanceLink() {
		maintenance.click();
		return this;
	}

	/**
	 * Click on My Info Link.
	 *
	 * @return the PIMPage class instance.
	 */
	public PIMPage clickMyInfoLink() {
		myInfo.click();
		return this;
	}

	/**
	 * Click on Orangehrm Inc Link.
	 *
	 * @return the PIMPage class instance.
	 */
	public PIMPage clickOrangehrmIncLink() {
		orangehrmInc.click();
		return this;
	}

	/**
	 * Click on Performance Link.
	 *
	 * @return the PIMPage class instance.
	 */
	public PIMPage clickPerformanceLink() {
		performance.click();
		return this;
	}

	/**
	 * Click on Pim Link.
	 *
	 * @return the PIMPage class instance.
	 */
	public PIMPage clickPimLink() {
		pim.click();
		return this;
	}

	/**
	 * Click on Recruitment Link.
	 *
	 * @return the PIMPage class instance.
	 */
	public PIMPage clickRecruitmentLink() {
		recruitment.click();
		return this;
	}

	/**
	 * Click on Reports Link.
	 *
	 * @return the PIMPage class instance.
	 */
	public PIMPage clickReportsLink() {
		reports.click();
		return this;
	}

	/**
	 * Click on Reset Button.
	 *
	 * @return the PIMPage class instance.
	 */
	public PIMPage clickResetButton() {
		reset.click();
		return this;
	}

	/**
	 * Click on Search Button.
	 *
	 * @return the PIMPage class instance.
	 */
	public PIMPage clickSearchButton() {
		search.click();
		return this;
	}

	/**
	 * Click on Time Link.
	 *
	 * @return the PIMPage class instance.
	 */
	public PIMPage clickTimeLink() {
		time.click();
		return this;
	}

	/**
	 * Click on Upgrade Button.
	 *
	 * @return the PIMPage class instance.
	 */
	public PIMPage clickUpgrade1Button() {
		upgrade1.click();
		return this;
	}

	/**
	 * Click on Upgrade Button.
	 *
	 * @return the PIMPage class instance.
	 */
	public PIMPage clickUpgrade2Button() {
		upgrade2.click();
		return this;
	}

	/**
	 * Fill every fields in the page.
	 *
	 * @return the PIMPage class instance.
	 */
	public PIMPage fill() {
		setMmAnhconfigurationEmployeeListaddEmployeereportsTextField();
		setEmployeeNameTextField();
		setEmployeeIdTextField();
		setSupervisorNameTextField();
		setAdd1RecordFoundidfirstMiddleCheckboxField();
		setMmVnanhhrManagerDeletedfulltimePermanenthumanResourcesCheckboxField22();
		return this;
	}

	/**
	 * Fill every fields in the page and submit it to target page.
	 *
	 * @return the PIMPage class instance.
	 */
	public PIMPage fillAndSubmit() {
		fill();
		return submit();
	}

	/**
	 * Set Add 1 Record Foundidfirst Middle Nameascendingdescendinglast
	 * Nameascendingdescendingjob Titleascendingemployment
	 * Statusascendingdescendingsub Unitascendingdescendingactionsfulltime Permanent
	 * Checkbox field.
	 *
	 * @return the PIMPage class instance.
	 */
	public PIMPage setAdd1RecordFoundidfirstMiddleCheckboxField() {
		if (!add1RecordFoundidfirstMiddle.isSelected()) {
			add1RecordFoundidfirstMiddle.click();
		}
		return this;
	}

	/**
	 * Set default value to Employee Id Text field.
	 *
	 * @return the PIMPage class instance.
	 */
	public PIMPage setEmployeeIdTextField() {
		return setEmployeeIdTextField(data.get("EMPLOYEE_ID"));
	}

	/**
	 * Set value to Employee Id Text field.
	 *
	 * @return the PIMPage class instance.
	 */
	public PIMPage setEmployeeIdTextField(String employeeIdValue) {
		employeeId.sendKeys(employeeIdValue);
		return this;
	}

	/**
	 * Set default value to Employee Name Text field.
	 *
	 * @return the PIMPage class instance.
	 */
	public PIMPage setEmployeeNameTextField() {
		return setEmployeeNameTextField(data.get("EMPLOYEE_NAME"));
	}

	/**
	 * Set value to Employee Name Text field.
	 *
	 * @return the PIMPage class instance.
	 */
	public PIMPage setEmployeeNameTextField(String employeeNameValue) {
		employeeName.sendKeys(employeeNameValue);
		return this;
	}

	/**
	 * Set default value to Mm Anhconfiguration Employee Listadd Employeereports
	 * Text field.
	 *
	 * @return the PIMPage class instance.
	 */
	public PIMPage setMmAnhconfigurationEmployeeListaddEmployeereportsTextField() {
		return setMmAnhconfigurationEmployeeListaddEmployeereportsTextField(
				data.get("MM_ANHCONFIGURATION_EMPLOYEE_LISTADD_EMPLOYEEREPORTS"));
	}

	/**
	 * Set value to Mm Anhconfiguration Employee Listadd Employeereports Text field.
	 *
	 * @return the PIMPage class instance.
	 */
	public PIMPage setMmAnhconfigurationEmployeeListaddEmployeereportsTextField(
			String mmAnhconfigurationEmployeeListaddEmployeereportsValue) {
		mmAnhconfigurationEmployeeListaddEmployeereports
				.sendKeys(mmAnhconfigurationEmployeeListaddEmployeereportsValue);
		return this;
	}

	/**
	 * Set 22mm Vnanhhr Manager Deletedfulltime Permanenthuman Resources Checkbox
	 * field.
	 *
	 * @return the PIMPage class instance.
	 */
	public PIMPage setMmVnanhhrManagerDeletedfulltimePermanenthumanResourcesCheckboxField22() {
		if (!mmVnanhhrManagerDeletedfulltimePermanenthumanResources22.isSelected()) {
			mmVnanhhrManagerDeletedfulltimePermanenthumanResources22.click();
		}
		return this;
	}

	/**
	 * Set default value to Supervisor Name Text field.
	 *
	 * @return the PIMPage class instance.
	 */
	public PIMPage setSupervisorNameTextField() {
		return setSupervisorNameTextField(data.get("SUPERVISOR_NAME"));
	}

	/**
	 * Set value to Supervisor Name Text field.
	 *
	 * @return the PIMPage class instance.
	 */
	public PIMPage setSupervisorNameTextField(String supervisorNameValue) {
		supervisorName.sendKeys(supervisorNameValue);
		return this;
	}

	/**
	 * Submit the form to target page.
	 *
	 * @return the PIMPage class instance.
	 */
	public PIMPage submit() {
		clickSearchButton();
		return this;
	}

	/**
	 * Unset Add 1 Record Foundidfirst Middle Nameascendingdescendinglast
	 * Nameascendingdescendingjob Titleascendingemployment
	 * Statusascendingdescendingsub Unitascendingdescendingactionsfulltime Permanent
	 * Checkbox field.
	 *
	 * @return the PIMPage class instance.
	 */
	public PIMPage unsetAdd1RecordFoundidfirstMiddleCheckboxField() {
		if (add1RecordFoundidfirstMiddle.isSelected()) {
			add1RecordFoundidfirstMiddle.click();
		}
		return this;
	}

	/**
	 * Unset 22mm Vnanhhr Manager Deletedfulltime Permanenthuman Resources Checkbox
	 * field.
	 *
	 * @return the PIMPage class instance.
	 */
	public PIMPage unsetMmVnanhhrManagerDeletedfulltimePermanenthumanResourcesCheckboxField22() {
		if (mmVnanhhrManagerDeletedfulltimePermanenthumanResources22.isSelected()) {
			mmVnanhhrManagerDeletedfulltimePermanenthumanResources22.click();
		}
		return this;
	}

	public void setfirstname(String firstName) {
		this.firstName.sendKeys(firstName);

	}

	public void setmiddlename(String middleName) {
		this.middleName.sendKeys(middleName);

	}

	public void setlastname(String lastname) {
		this.lastname.sendKeys(lastname);

	}

	public void clickOnSaveButton() {
		savebtn.click();
	}

}
