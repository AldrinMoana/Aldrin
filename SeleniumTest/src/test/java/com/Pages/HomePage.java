package com.Pages;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseClass.BaseClass;

public class HomePage extends BaseClass {
    WebDriver driver;

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By dropdown =By.xpath("//select[@id='dropdown-class-example']");
    
    
   
    
    // Locators

   
    
    // Actions
    public WebElement OptionCheckBoxClick() {

 	return driver.findElement(dropdown);
    	
   
    	
        
        
    }
    
}

  
