package OrangeHrm;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pageobjectmodel.LoginPage;
import com.testingShastra.Keyword;
import com.testingShastra.pages.DashboardPage;
import com.testingShastra.pages.loginpage;
import com.testinhShastra.base.Testbase;
import com.testinhShastra.utile.App;

public class AdduserTests extends Testbase  {

	@Test

	public void verifyIfListsOfAlreadyCreatedUser() throws InterruptedException {

		Keyword Keyword = new Keyword();
		Keyword.waitForElementToBeVisible(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");

		Keyword.driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		Keyword.driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

		Keyword.waitForElementToBeVisible(By.xpath("//a[contains(@href,'PimModule')]"));
		Keyword.driver.findElement(By.xpath("//a[contains(@href,'PimModule')]")).click();

		Keyword.waitForElementToBeVisible(By.xpath("//button[text()=' Add ']"));
		Keyword.driver.findElement(By.xpath("//button[text()=' Add ']")).click();
		Thread.sleep(5000);
		Keyword.waitForElementToBeVisible(By.xpath("//input[@name=\"firstName\"]"));

		Keyword.driver.findElement(By.xpath("//input[@name=\"firstName\"]")).sendKeys("Minakshi");
		Keyword.driver.findElement(By.xpath("//input[@name=\"middleName\"]")).sendKeys("");
		Keyword.driver.findElement(By.xpath("//input[@name=\"lastName\"]")).sendKeys("Kokate");
		Keyword.driver.findElement(By.xpath("//button[text()=' Save ']")).click();

		Keyword.driver.findElement(By.xpath("//a[contains(@href,'AdminModule')]")).click();
		Thread.sleep(5000);
		Keyword.driver.findElement(By.xpath("//button[text()=' Add ']")).click();
		Thread.sleep(3000);
		Keyword.driver.findElement(By.xpath("//div[@class=\"oxd-select-text oxd-select-text--active\"][1]")).click();
		Keyword.driver.findElement(By.xpath("//div[@role='listbox']/descendant::*[contains(text(),'ESS')]")).click();
		Keyword.driver.findElement(By.xpath("//input[@placeholder=\"Type for hints...\"]")).sendKeys("Minakshi");
		Thread.sleep(3000);
		List<WebElement> nameList = Keyword.driver.findElements(By.xpath("//div[@role='option']/span"));
		boolean isfound = false;
		for (WebElement name : nameList) {
			if (name.getText().contains("Minakshi")) {
				isfound = true;
				break;
			}
		}
		Assert.assertTrue(isfound);
	}

	@Test

	public void verifyNameofAlreadyCreatedUserListsUsingKeywords() throws InterruptedException {
		Keyword keyword = new Keyword();

		keyword.waitForElementToBeVisible(By.xpath(Locator.username));
		keyword.enterText(Locator.username, App.getUserName("qa"));
		keyword.enterText(Locator.password, App.getPassword("qa"));
		keyword.click("xpath", Locator.sumbit);
		keyword.waitForElementToBeVisible(By.xpath(Locator.pimmenu));
		keyword.click("xpath", Locator.pimmenu);
		keyword.waitForElementToBeVisible(By.xpath(Locator.addbtn));
		keyword.click("xpath", Locator.addbtn);
		Thread.sleep(3000);
		keyword.waitForElementToBeVisible(By.xpath(Locator.firstname));
		keyword.enterText(Locator.firstname, "Minakshi");
		keyword.enterText(Locator.middlename, "");
		keyword.enterText(Locator.lastname, "kokate");
		keyword.click("xpath", Locator.save);
		Thread.sleep(5000);
		keyword.click("xpath", Locator.adminmodule);
		Thread.sleep(5000);
		keyword.click("xpath", Locator.add);
		Thread.sleep(3000);
		keyword.click("xpath", Locator.selecttext);
		keyword.click("xpath", Locator.listbox);
		keyword.enterText(Locator.placeholder, "Minakshi");
		Thread.sleep(3000);
		List<WebElement> nameList = keyword.driver.findElements(By.xpath("//div[@role='option']/span"));
		boolean isfound = false;
		for (WebElement name : nameList) {
			if (name.getText().contains("Minakshi")) {
				isfound = true;
				break;
			}
		}
		Assert.assertTrue(isfound);

	}

	@Test

	public void verifyNameofAlreadyCreatedUserInListsUsingPom()  {
		loginpage Loginpage = new loginpage();
		
		Loginpage.waitForUserNameToBeVisible();;
		Loginpage.enterUsername("Admin");
		Loginpage.enterPassword("admin123");
		Loginpage.clickOnLoginBtn();

		DashboardPage dashboard = new DashboardPage();
		
		dashboard.waitForPimMenuToBeVisible();
		dashboard.clickOnPimMenu();
	}

}
