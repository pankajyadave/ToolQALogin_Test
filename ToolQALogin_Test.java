package Test;

import org.testng.annotations.Test;

import Pages.ToolQALogin_Page;

public class ToolQALogin_Test 
{
	ToolQALogin_Page ob=new ToolQALogin_Page();
	
	@Test(priority=1, enabled=true)
	public void getlaunchtoolsqa_url()
	{
		ob.getlaunchtoolsqa_url();
	}
	
	@Test(priority=2, enabled=true)
	public void ClickonDemosite()
	{
		ob.ClickonDemosite();
	}
	
	@Test(priority=3, enabled=true)
	public void ClickonElements()
	{
		ob.ClickonElements();
	}
}

