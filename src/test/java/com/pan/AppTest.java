package com.pan;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {
	
	@Test
	public void testlogin1() {
		App app = new App();
		Assert.assertEquals(0, app.getCreds("Pankaj", "Pankaj123"));
		System.out.println("First Test Case Executed");
	}
	
	@Test
	public void testlogin2() {
		App app = new App();
		Assert.assertEquals(1, app.getCreds("Pankaj", "Pankaj@123"));
		System.out.println("Second Test Case Executed");
	}

}
