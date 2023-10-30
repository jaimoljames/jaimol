package testtask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pack.Maketrip;


public class Maketriptest {
	
		WebDriver driver;
		@BeforeTest
		public void setup()
		{
			driver=new ChromeDriver();
		}
		@BeforeMethod
		public void url()
		{
			driver.get("https://www.makemytrip.com/");
		}
		@Test
		public void test()
		{
		
		Maketrip mi=new Maketrip(driver);
			driver.manage().window().maximize();
			
			mi.departing();
			
		}

	}



