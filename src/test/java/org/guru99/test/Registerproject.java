package org.guru99.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Driver.banK;

public class Registerproject extends Baseclass
{
	@Test
	public void registerTest() 
	{

		banK.driver.get("https://demo.guru99.com/");
		banK.driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("adv@gmail.com");
		banK.driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement dd = banK.driver.findElement(By.xpath("//h2[text()='Access details to demo site.']"));

		/*Assert.assertEquals(dd, "Access details to demo site.");

		
		
		
		
		
		/*
		 * if(dd.getText().equalsIgnoreCase("Access details to demo site.")) {
		 * System.out.println("pass"); } else { System.out.println("test failed"); }
		 */

	}

}
