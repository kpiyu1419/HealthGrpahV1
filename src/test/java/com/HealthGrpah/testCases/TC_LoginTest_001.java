package com.HealthGrpah.testCases;

import org.testng.annotations.Test;

import com.HealthGraph.pageObject.LoginPage;
import com.HealthGraph.testData.BaseClass;

public class TC_LoginTest_001 extends BaseClass
{
	@Test
	public void loginTest()
	{
		driver.get(baseUrl);
		LoginPage lp= new LoginPage(driver);
		lp.setAccLoginlink();
		lp.setUsername(username);
		lp.setPassword(password);
		lp.clickSubmit();
	
		
		
	}
	

}
