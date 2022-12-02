package com.Adactin.Stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Adactin.runner.Runner;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdef {
	
	public static WebDriver driver = Runner.driver;
	
	@Given("^User launch the adactin application$")
	public void user_launch_the_adactin_application() throws Throwable {
	   driver.get("https://adactinhotelapp.com/");
	}

	@When("^User Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
		WebElement f1 = driver.findElement(By.name("username"));
		f1.sendKeys("Salam123");	   
	}

	@When("^user Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
	   WebElement f2 = driver.findElement(By.name("password"));
	   f2.sendKeys("salam*1");
	   
	}

	@Then("^user Click The Login Button And It Navigates To Search Hotel Page$")
	public void user_Click_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page() throws Throwable {
	   WebElement f3 = driver.findElement(By.id("login"));
	   f3.click();
	   
	}

	@When("^user Select The Location In Location Field$")
	public void user_Select_The_Location_In_Location_Field() throws Throwable {
	   	   WebElement f1 = driver.findElement(By.id("location"));
		Select b = new Select(f1);
		b.selectByValue("London");
	}

	@When("^user Select The Hotel In Hotels Field$")
	public void user_Select_The_Hotel_In_Hotels_Field() throws Throwable {
		WebElement f2 = driver.findElement(By.id("hotels"));
	   Select c=new Select(f2);
	   c.selectByValue("Hotel Sunshine");	   
	}

	@When("^user Select The Room Type In Room Type Field$")
	public void user_Select_The_Room_Type_In_Room_Type_Field() throws Throwable {
		WebElement f3 = driver.findElement(By.id("room_type"));
		   Select d=new Select(f3);
		   d.selectByValue("Standard");
	   
	}

	@When("^user Select The Number Of Rooms In Rooms Field$")
	public void user_Select_The_Number_Of_Rooms_In_Rooms_Field() throws Throwable {
	   WebElement f4 = driver.findElement(By.id("room_nos"));
	   Select e=new Select(f4);
	   e.selectByIndex(3);
	   
	}

	@When("^user Enter The Date In Check In Date Field$")
	public void user_Enter_The_Date_In_Check_In_Date_Field() throws Throwable {
	   WebElement f5 = driver.findElement(By.name("datepick_in"));
	   f5.sendKeys("30/11/2022");
	   
	}

	@When("^user Enter The Date In Check Out Date Field$")
	public void user_Enter_The_Date_In_Check_Out_Date_Field() throws Throwable {
	   WebElement f6 = driver.findElement(By.name("datepick_out"));
	   f6.sendKeys("01/12/2022");
	   
	}

	@When("^user Select The Number Of Adults In Adults Per Room Field$")
	public void user_Select_The_Number_Of_Adults_In_Adults_Per_Room_Field() throws Throwable {
	   WebElement f7 = driver.findElement(By.id("adult_room"));
	   Select f=new Select(f7);
	   f.selectByVisibleText("3 - Three");
	   
	}

	@When("^user Select The Number Of Childrens In Children Per Room Field$")
	public void user_Select_The_Number_Of_Childrens_In_Children_Per_Room_Field() throws Throwable {
	   WebElement f8 = driver.findElement(By.id("child_room"));  
	   Select g=new Select(f8);
	   g.selectByVisibleText("1 - One");
	}

	@Then("^user Search The Search Box It Navigates To Select Hotel Page$")
	public void user_Search_The_Search_Box_It_Navigates_To_Select_Hotel_Page() throws Throwable {
	   WebElement f9 = driver.findElement(By.id("Submit"));
	   f9.click();
	   
	}



}
