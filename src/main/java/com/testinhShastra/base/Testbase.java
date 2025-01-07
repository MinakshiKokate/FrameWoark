package com.testinhShastra.base;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.testingShastra.Keyword;
import com.testinhShastra.utile.App;



public class Testbase {
	
	

	@BeforeMethod
	public void teardown() {
		Keyword keyword = new Keyword();
		keyword.LaunchBrowser("Firefox");
		keyword.launchUrl(App.getAppUrl("qa"));
		

	}
	@AfterMethod
	 public void tearDown() throws Exception {
	 Keyword.driver.quit();

	 }

}
