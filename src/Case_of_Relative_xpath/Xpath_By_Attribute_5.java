package Case_of_Relative_xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Attribute_5 
{
public static void main(String[] args) throws Throwable
{
System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

//open web browser

driver.get("https://demo.actitime.com/login.do");

//Enter Username
driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");

//Enter Password
driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");

Thread.sleep(3000);

//check login page is opened or not

String expT = "actiTIME - Login";
String actT = driver.getTitle();

if (actT.equals(expT))
{
	System.out.println("Login page is opened & TC is pass");
}
else
{
	System.out.println("Login page is not opened & TC is fail");
}
}
}
