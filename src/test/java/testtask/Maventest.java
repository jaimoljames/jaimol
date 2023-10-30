package testtask;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pack.Marine;

public class Maventest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://marinersforex.com/Flights-Booking");
	}
	@Test
	public void test()
	{
		
	Marine mi=new Marine(driver);
		driver.manage().window().maximize();
		mi.leaving_going();
		mi.departing();
		mi.traveller();
		mi.Search();
	}

}
