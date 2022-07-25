package com.test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PersonalLoan {
	@Test(enabled=false)
	public void givePersonalDetails(){
		System.out.println("all personal details given");
		Reporter.log("details about your personal information");
	}
	@Test
	public void givePayslip(){
		System.out.println("3 monts pay slip given");
		Reporter.log("Details about ur 3 nmonths pay slip");
	}
	@Test(groups={"SmokeTest"})
	public void webLoginPersonalLoan()
	{
		System.out.println("Weblogin personal loan");
		Reporter.log("Details about your personal loan");
	}

}
