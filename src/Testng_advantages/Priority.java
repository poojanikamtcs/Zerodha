package Testng_advantages;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority 
{
@Test (enabled = false)
public void TC1()
{
	Reporter.log("Hii",true);
}
@Test (priority = 1)
public void TC2() 
{
	Reporter.log("Good Morning",true);	
}
@Test (priority = 2)
public void TC3()
{
	Reporter.log("Friends",true);	
}
@Test (priority = 4)
public void TC4()
{
	Reporter.log("I am Fine",true);	
}
@Test (priority = 3)
public void TC5()
{
	Reporter.log("How r u",true);	
}
}
