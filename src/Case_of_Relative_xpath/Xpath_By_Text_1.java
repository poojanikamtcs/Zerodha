package Case_of_Relative_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Text_1 
{
public static void main(String[] args) throws Throwable 
{
System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

//open web browser
driver.get("https://demo.actitime.com/login.do");

//Enter Username
driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
Thread.sleep(3000);


//Enter Password
driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
Thread.sleep(3000);


//click on Login button
driver.findElement(By.xpath("//div[text()='Login ']")).click();

Thread.sleep(3000);

//check home page is opened or not
String ExpT = "actiTIME - Login";
String actT = driver.getTitle();
if (actT.equals(ExpT))
{
	System.out.println("Home page is opened & Tc is pass");
}
else
{
	System.out.println("Home page is not opened & Tc is fail");
}
}
}

