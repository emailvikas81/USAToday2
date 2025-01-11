package com.usatoday.testscripts;

import junit.framework.TestCase;

import org.junit.Test;

import com.usatoday.Libraries.Reports;
import com.usatoday.frameworkengine.Testexecutor;

public class NHLSchedules extends TestCase
{
	@Test
	public void testNHLSchedules()
	{
		try
		{
			System.out.println("inside testNHLSchedules test try block");
			Reports.passlogcntr=0;
			Reports.faillogcntr=0;
			Reports.totlscenarios=0;
			Testexecutor executor = new Testexecutor();
			executor.executeTest(this.getClass().getSimpleName());
		}
		catch (Exception e)
		{
			System.out.println("inside testNHLSchedules test catch block");
			System.out.println(e);
		}
	}
}
