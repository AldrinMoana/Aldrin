package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;



public class BaseTest {

	protected WebDriver driver;


	
	public void setup() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in/b/ref=ohlr_bstof_Budgetstore/?_encoding=UTF8&node=21557580031&pd_rd_w=Un4Pt&content-id=amzn1.sym.08eb4761-c8dc-4a56-a42e-2e73c2ad771c&pf_rd_p=08eb4761-c8dc-4a56-a42e-2e73c2ad771c&pf_rd_r=VWFBHQZAM59C9DC49P67&pd_rd_wg=ngcMe&pd_rd_r=bbda41e8-8f07-44c0-aed5-95bcf36791d5&ref_=pd_hp_d_hero_unk");
		driver.manage().window().maximize();

	}

	
	public void tearDown() {
		if (driver != null) {
			driver.quit(); 
		}}
		
	    public WebDriver getDriver() {
	        return driver;

	}



}
