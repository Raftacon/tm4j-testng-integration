package com.languageline.integration;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.testng.annotations.Listeners;

import com.languageline.listeners.ConnectorListener;
import com.languageline.listeners.IntegrationListener;

@Listeners({ ConnectorListener.class, IntegrationListener.class })
public class BaseTest {
	/*
	 * Define the custom TestData tag for storing the
	 * TM4J test key for all inherited tests.
	 */
	@Retention(RetentionPolicy.RUNTIME)
	@Target({ ElementType.METHOD })
	public @interface TestData {
		String key() default "";
	}
}
