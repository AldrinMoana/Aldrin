package baseClass;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.netty.handler.timeout.TimeoutException;

public class BaseClass {

	protected static WebDriver driver = null;

	public void setup() {

		
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		 	}


	public void selectThevalue(WebElement web,String value) {

		Select s=new Select(web);

		s.selectByVisibleText(value);
		
	}
	
	 public void selectRadioButton(String value) {
	        WebElement radio = driver.findElement(By.xpath("//input[@value='radio1']"));
	        radio.click();
	       
	    }
	 
	 

		    public static String selectTheAlert(WebDriver driver, String text) {
		        try {
		            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		            Alert alert = wait.until(ExpectedConditions.alertIsPresent()); 

		            String alertText = alert.getText(); 
		            System.out.println("Captured Alert Text: " + alertText);

		            if (text != null && !text.isEmpty()) {
		                try {
		                    alert.sendKeys(text);
		                    System.out.println("Entered text in alert: " + text);
		                } catch (Exception e) {
		                    System.out.println("Alert does not support text input.");
		                }
		            }

		            alert.accept(); // Accept alert
		        } catch (TimeoutException e) {
		            System.out.println("No alert present within timeout.");
		        } catch (NoAlertPresentException e) {
		            System.out.println("No alert present.");
		        } catch (Exception e) {
		            System.out.println("Unexpected error handling alert: " + e.getMessage());
		        }
				return "Error occurred.";
		    }

		    public static String getAlertText(WebDriver driver) {
		        try {
		            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		            Alert alert = wait.until(ExpectedConditions.alertIsPresent());

		            return alert.getText();
		        } catch (TimeoutException | NoAlertPresentException e) {
		            return "No alert present.";
		        }
		    }
		
	 
//	 public void selectThealert(String text) {
//		 
//try {
//	
//	String lastAlertText = "";
//	
//	
//	
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//	wait.until(ExpectedConditions.alertIsPresent());
//	Alert alert = driver.switchTo().alert();
//		 try {
//			   
//			    Alert alert1 = wait.until(ExpectedConditions.alertIsPresent());
//			    System.out.println("Captured Alert Text: " + alert1.getText());
//			    alert1.accept();
//			} catch (TimeoutException e) {
//			    System.out.println("No alert present within the timeout.");
//			}
//		 lastAlertText = alert.getText(); // Store the text before accepting the alert
//	        System.out.println("Captured Alert Text: " + lastAlertText);
//		  if (text != null && !text.isEmpty()) {
//	            try {
//	                alert.sendKeys(text);
//	                System.out.println("Entered text in alert: " + text);
//	            } catch (Exception e) {
//	                System.out.println("Alert does not support text input, skipping sendKeys().");
//	            }
//		  }
//	            alert.accept();
//	        }		  catch (NoAlertPresentException e) {
//		        System.out.println("No alert present.");
//		    } catch (Exception e) {
//		        System.out.println("Error handling alert: " + e.getMessage());
//		    }
//		}
//	 
//	 
//	 
//	 
//	 
//	 public String getAlertText() throws InterruptedException 
//	 {
//		 String lastAlertTexts = "";
//		 
//		 Alert alert = driver.switchTo().alert();
//			Thread.sleep(2000);
//			 lastAlertTexts = alert.getText();
//			 
//			 
//			 
//		 if (lastAlertTexts.isEmpty()) {
//	        return "No alert present.";
//	    } else {
//	        return lastAlertTexts;
//	    }
//
//	        }
	 
	 
	 
//	 public void switchTheWindow(WebElement web,String value) {
//
//			Select s=new Select(web);
//
//			s.selectByVisibleText(value);
//			
//		}
		
	 

	public void tearDown() {
		if (driver != null) {
			driver.quit(); 
		}}

	public WebDriver getDriver() {
		return driver;

	}
}
