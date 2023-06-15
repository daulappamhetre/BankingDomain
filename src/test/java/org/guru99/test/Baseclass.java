package org.guru99.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Driver.banK;

public class Baseclass 
{
       @BeforeMethod
		public void browseropen()
		{
			banK.ss();
		}
		
		@AfterMethod
		public void brwserclosee()
		{
		   banK.teardown();
		}
		
	}
