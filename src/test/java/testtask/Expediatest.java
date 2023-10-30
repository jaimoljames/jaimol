package testtask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pack.Expedia;



public class Expediatest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.expedia.co.in");
	}
	@Test
	public void test()
	{
		
	Expedia e=new Expedia(driver);
		driver.manage().window().maximize();
		e.go("maldives");
		//e.tdate();
		e.tick();
	     //e.travel();
		e.search();
	}


}
