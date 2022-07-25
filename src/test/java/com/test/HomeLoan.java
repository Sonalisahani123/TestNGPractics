package com.test;

import org.testng.annotations.Test;

public class HomeLoan {
	@Test
	public void giveaddress()
	{
		System.out.println("address given");
	}
    @Test
	public void checkprevioushome(){
		System.out.println("came to check the home");
		
	}
    @Test(groups={"SmokeTest"})
    public void webapihomeloan()
    {
    	System.out.println("web api home loan");
    }
}

