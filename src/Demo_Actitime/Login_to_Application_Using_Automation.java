package Demo_Actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_to_Application_Using_Automation 
{
public static void main(String[] args)
{
	System.setProperty("Webdriver.chrome.driver","C:\\Users\\user\\Downloads\\Pooja Testing files\\chromedriver_win32\\chromedriver.exe");
	//WebDriver driver=new ChromeDriver();
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
}
}
