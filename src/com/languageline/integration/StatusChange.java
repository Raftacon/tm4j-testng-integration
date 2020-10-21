package com.languageline.integration;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
 * Sample login test, configured to always fail for
 * illustration purposes.
 */
public class StatusChange extends BaseTest {
	@Test
	@TestData(key="QAT-T2")
	public void StatusChangeTest() {
		System.out.println("====StatusChangeTest====");
		System.out.println("[DEBUG] Starting the test...");
	  
		// Do relevant test stuff here.
		Assert.assertTrue(false);
	  
		System.out.println("[DEBUG] Test completed!");
	}
}
