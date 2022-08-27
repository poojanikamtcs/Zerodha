package Case_of_Relative_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Contains_4 
{
public static void main(String[] args) throws Throwable 
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	//open web browser
	driver.get("https://demo.actitime.com/login.do");

	//Enter Username 
	driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("admin");
	Thread.sleep(2000);

	//Enter Password
	driver.findElement(By.xpath("//input[contains(@name,'pwd')]")).sendKeys("manager");
	Thread.sleep(2000);

	//Click on login button
	driver.findElement(By.xpath("//div[contains(text(),'Login ')]")).click();
	Thread.sleep(2000);

	//check home page is open or not
	String expT = "actiTIME - Login";
	String actT = driver.getTitle();
	if(actT.equals(expT))
	{
		System.out.println("Home page is open & TC is pass");
	}
	else
	{
		System.out.println("Home page is not opened & TC is fail");
	}
	}
}
