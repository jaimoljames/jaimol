package testtask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pack.Saucedemo;

public class Saucedemotest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.saucedemo.com/");
	}
	@Test
	public void test()
	{
		Saucedemo s1=new Saucedemo(driver);
		//driver.manage().window().maximize();
		s1.login("standard_user","secret_sauce");
		s1.additem();
		s1.addcart();
		s1.fill("luther", "jomon", "682311");
		s1.back();


	}
}
