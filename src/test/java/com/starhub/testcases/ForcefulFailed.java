package com.starhub.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.starhub.constants.BaseClass;
import com.starhub.constants.CustomTestListners;

@Listeners(CustomTestListners.class)
public class ForcefulFailed extends BaseClass
{
	
	@Test(priority = 3)
	public void verifyForcefulFailedTest() throws IOException
	{
		
		verifyEquals("abc", "ABC");
		Assert.fail();
		
	}
	

}
