package com.usatoday.testscripts;

import org.junit.Test;

import com.usatoday.Libraries.Reports;
import com.usatoday.frameworkengine.Testexecutor;

import junit.framework.TestCase;

public class NFLScoreCards extends TestCase
{
	@Test
	public void testNFLScoreCards()
	{
		try
		{
			System.out.println("inside testNFLScoreCards test try block");
			Reports.passlogcntr=0;
			Reports.faillogcntr=0;
			Reports.totlscenarios=0;
			Testexecutor executor = new Testexecutor();
			executor.executeTest(this.getClass().getSimpleName());
		}
		catch (Exception e)
		{
			System.out.println("inside testNFLScoreCards test catch block");
			System.out.println(e);
		}
	}

}
