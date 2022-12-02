package com.Adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
//@CucumberOptions(features = "src//test//java//com//Adactin//feature", 
@CucumberOptions(features = "C:\\Users\\AbdulsalS\\eclipse-workspace\\Adactin.cucumberBD\\src\\test\\java\\com\\Adactin\\feature\\Adactin.feature",
glue = "com.Adactin.Stepdef",
monochrome = true,
dryRun= false,
strict = true,
tags="@Testcase",
plugin = {"html:Reports/HtmlReports", "pretty","json:Reports/JsonReports.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtentReport.html"})

public class Runner {

	public static WebDriver driver;
	
	@BeforeClass
	public static void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@AfterClass
	public static void close() {
		driver.close();
	}
}
