package com.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import com.base.BaseTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseTest{

	//private WebDriver driver;

	public StepDefinition() {
		super.setup(); 
		//driver = getDriver(); // Inherit WebDriver from BaseTest
	}

	@Given("Launch the URL")
	public void launch_the_url() {

	}

	@When("Enter the username {string}")
	public void enter_the_username(String username) {

		WebElement usernameField = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		Actions actions =new Actions(driver);
		actions.moveToElement(usernameField).perform();
		WebElement usernameField1 = driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']"));
		usernameField1.click();
		WebElement usernameField2 = driver.findElement(By.xpath("//input[@name='email']"));
		usernameField2.sendKeys(username);
		WebElement usernameField3 = driver.findElement(By.xpath("//input[@class='a-button-input']"));
		usernameField3.click();
	}
	@When("Enter the password {string}")
	public void enter_the_password(String password) {

		//WebElement password1 = driver3.findElement(By.xpath("//input[@type='password']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement password1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
		password1.sendKeys(password);
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		loginButton.click();
	}
	@When("Click the login button")
	public void click_the_login_button() {

		WebElement addtocart = driver.findElement(By.xpath("//a[@aria-label='Furniture, You are currently on a drop-down. To open this drop-down, Press Enter.']"));
		Actions actions1 =new Actions(driver);
		actions1.moveToElement(addtocart).perform();
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement addtocart1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/s/ref=mega_sv_s23_4_3_1_2?rh=i%3Afurniture%2Cn%3A1380441031%2Cn%3A3591666031%2Cn%3A3591680031%2Cp_36%3A200000-99999999&bbn=3591680031&ie=UTF8']")));
		addtocart1.click();

	}
	@Then("Validate the HomePage {string}")
	public void validate_the_home_page(String message) {

		WebElement addtocart2 = driver.findElement(By.xpath("//button[@id='a-autoid-1-announce']"));
		addtocart2.click();
		System.out.println("Validation message: " + message);
	
		
		//driver.quit();

	}


}
