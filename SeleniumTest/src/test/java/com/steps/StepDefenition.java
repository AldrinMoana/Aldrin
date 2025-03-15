package com.steps;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Pages.HomePage;

import baseClass.BaseClass;
import dev.failsafe.internal.util.Assert;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Duration;

public class StepDefenition extends BaseClass {

	@Given("I open the automation practice page")
	public void i_open_the_automation_practice_page() {

		System.out.println("Current URL: " + driver.getCurrentUrl());

	}
	@When("I select the {string} dropdown")
	public void i_select_the_dropdown(String value)  {
		
		HomePage homePage=new HomePage(driver);
		WebElement element1ToSelctoption=homePage.OptionCheckBoxClick();

		selectThevalue(element1ToSelctoption, "Option1");
	}



	@Then("the {string} dropdown should be selected")
	public void the_dropdown_should_be_selected(String value) {
		

		WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select select = new Select(dropdown);
		List<WebElement> options = select.getOptions();
		for(WebElement option:options) {
			System.out.println(option.getText());

		}


	}

	@Given("I open the automation practice page for Radio button")
	public void i_open_the_automation_practice_page_for_radio_button() {


		System.out.println("Current URL: " + driver.getCurrentUrl());

	}
	@When("I select the text box {string}")
	public void i_select_the_radio_button(String radioValue) throws InterruptedException {

		selectRadioButton(radioValue);
		Thread.sleep(2000);

	}
	@Then("the text should be entry")
	public void the_radio_button_should_be_selected() throws InterruptedException {
		//List<Map<String, String>> listdata=table.asMaps(String.class, String.class);
		WebElement sendkey=driver.findElement(By.xpath("//input[@id='autocomplete']"));
		//sendkey.sendKeys("Aldrin");
		Thread.sleep(2000);
		//String text=sendkey.getAttribute("value");
	//	System.out.println(text);

		List<WebElement> checkboxes =driver.findElements(By.xpath("//div[@id='checkbox-example']//input[@type='checkbox']"));
		for(WebElement checkbox:checkboxes) {
			if(!checkbox.isSelected()) {
				checkbox.click();



			}}
	}


	@Given("I trigger an Alert")
	public void i_trigger_an_alert()  {

		WebElement sendkey=driver.findElement(By.xpath("//input[@id='name']"));


		sendkey.sendKeys("Aldrin");
		WebElement alertButton = driver.findElement(By.xpath("//input[@id='alertbtn']")); 
		alertButton.click();

		
		System.out.println("Alert triggered.");

	}
	@When("I accept the {string} alert")
	public void i_accept_the_alert(String text) {
		String capturedAlertText = selectTheAlert(driver, text);
	    System.out.println("Captured Alert Text: " + capturedAlertText);

	}
	@Then("the {string} button should be selected")
	public void the_button_should_be_selected(String expectedText) throws InterruptedException {

		
		System.out.println("Alert Text: " + expectedText);

	}

	private String mainWindowHandle;
	private String newWindowHandle;



	@Given("I am on the Automation Practice page")
	public void i_am_on_the_automation_practice_page() {
		setup();
		mainWindowHandle = driver.getWindowHandle(); 
		System.out.println("Main Window Handle: " + mainWindowHandle);
	}
	@When("I click on the {string} button")
	public void i_click_on_the_button(String string) throws InterruptedException {
		driver.findElement(By.xpath("//button[@id='openwindow']")).click(); 

		Set<String> windowHandles = driver.getWindowHandles();
		for (String handle : windowHandles) {
			if (!handle.equals(mainWindowHandle)) {
				newWindowHandle = handle;
				break;
			}
		}
		Thread.sleep(2000);
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.switchTo().window(newWindowHandle);
		System.out.println("Switched to new window. Title: " + driver.getTitle());
	}
	@Then("I verify that the new window title is {string}")
	public void i_verify_that_the_new_window_title_is(String string) {
		driver.close(); 
		System.out.println("New window closed.");
		driver.switchTo().window(mainWindowHandle); 
		System.out.println("Switched back to main window. Title: " + driver.getTitle());
	}
	@Then("I switch back to the main window")
	public void i_switch_back_to_the_main_window() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='opentab']")).click(); 
		Thread.sleep(2000);
		driver.switchTo().window(mainWindowHandle); 
		driver.quit();
	    
	}


}




