package hookSelenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import baseClass.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookSelenium extends BaseClass {
	
	//BaseClass base = new BaseClass();
	
	@Before
	public void before() {
		setup();
		System.out.println("before");
	}
	
	@After
	public void after() {
		tearDown(); 
		System.out.println("after");
	}

	
}
