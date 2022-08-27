package Testng_advantages;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations 
{
@BeforeClass
public void Openbrowser()
{
	Reporter.log("open the browser",true);
}
@BeforeMethod
public void LoginApplication()
{
	Reporter.log("Login to application",true);
}
@Test
public void VerifyUserId()
{
	Reporter.log("Verify user ID",true);
}
@AfterMethod
public void Logout()
{
	Reporter.log("Logout the application",true);
}
@AfterClass
public void closeBrowser()
{
	Reporter.log("Close the Browser",true);
}
}
