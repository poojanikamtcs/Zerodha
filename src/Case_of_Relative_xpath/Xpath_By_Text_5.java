package Case_of_Relative_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Text_5 
{
public static void main(String[] args) throws Throwable 
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	//open the web browser
	driver.get("https://demo.actitime.com/login.do");
	
	//Enter Username 
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
	
	//Enter Password
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	Thread.sleep(2000);
	
	//Click on login button
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	
	//Check Home page is open or not
	
	String expT = "actiTIME - Login";
	String actT=driver.getTitle();
	if (actT.equals(expT))
	{
		System.out.println("Home page is open & TC is pass");
	}
	else
	{
		System.out.println("Home page is not opened & TC is fail");
	}
}
}
