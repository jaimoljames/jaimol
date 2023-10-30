package testtask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pack.Choco;



public class ChocoTest {



	WebDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
}
@BeforeMethod
public void url()
{
	driver.get("https://www.firstcry.com/");
}
@Test
public void test() throws Throwable
{

	Choco fc=new Choco(driver);
	driver.manage().window().maximize();
      fc.title();
	fc.catgry();
	fc.search("pamper");
	fc.code("686691");
}
}
