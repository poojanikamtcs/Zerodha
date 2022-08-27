package Testng_advantages;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class timeout 
{
@Test (timeOut = 9000)
public void TC()
{
	Reporter.log("Running Tc",true);
}
}
