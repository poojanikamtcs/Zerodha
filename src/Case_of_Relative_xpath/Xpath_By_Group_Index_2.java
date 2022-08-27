package Case_of_Relative_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Group_Index_2 
{
public static void main(String[] args) throws Throwable 
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	//open web browser
	driver.get("https://demo.actitime.com/login.do");

	//Enter Username 
	driver.findElement(By.xpath("(//input)[3]")).sendKeys("admin");
	Thread.sleep(2000);

	//Enter Password
	driver.findElement(By.xpath("(//input)[4]")).sendKeys("manager");
	Thread.sleep(2000);

	//Click on Login button
	driver.findElement(By.xpath("(//div)[13]")).click();
	Thread.sleep(2000);

	//Check home page is open or not
	String expT = "actiTIME - Login";
	String actT= driver.getTitle();
	if(actT.equals(expT))
	{
		System.out.println("Home page is open & TC  is pass");
	}
	else
	{
		System.out.println("Home page is not open & TC  is fail");
	}
	}
	}

