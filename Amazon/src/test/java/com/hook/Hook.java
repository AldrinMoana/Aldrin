package com.hook;

import com.base.BaseTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends BaseTest {
	
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
