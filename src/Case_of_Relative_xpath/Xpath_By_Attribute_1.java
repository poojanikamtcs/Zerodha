package Case_of_Relative_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Attribute_1 
{
public static void main(String[] args) throws Throwable 
{
System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\Pooja Testing files\\chromedriver_win32\\chromedriver.exe");	

WebDriver driver = new ChromeDriver();

driver.get("https://demo.actitime.com/login.do");

//enter Username
driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");

// Enter Password
driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");

Thread.sleep(3000);

// verify login page is open or not

String expT = "actiTIME - Login";
String actT = driver.getTitle();

if(actT.equals(expT))
{
	System.out.println("Login page is open & TC is pass");
}
else
{
	System.out.println("Login page is not open & TC is fail");
}
}
}

