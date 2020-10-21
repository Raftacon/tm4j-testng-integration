package com.languageline.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;

import com.languageline.utilities.Connector;

public class ConnectorListener implements ITestListener {
	/*
	 * Create a connector for use by the shared TestNG context.
	 */
	@Override
	public void onStart(ITestContext context) {
		Connector connector = new Connector();
		context.setAttribute("connector", connector);
		
		System.out.println("[DEBUG] Connector assigned & configured!");
	}
}
