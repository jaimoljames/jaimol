package pack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Maketrip {
	
		WebDriver driver;
		By dep=By.xpath("//span[normalize-space()='Departure']");
		By date=By.xpath("//div[@class='DayPicker-Day DayPicker-Day--start DayPicker-Day--selected']//p[contains(text(),'30')]");
		By retun=By.xpath("//span[normalize-space()='Return']");
		By date2=By.xpath("//div[@class='DayPicker-Day DayPicker-Day--end DayPicker-Day--selected']//p[contains(text(),'31')]");
		public Maketrip(WebDriver driver)
		{
			this.driver=driver;  //constructor
		}
		public void departing()
		{
			
			
			driver.findElement(dep).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(date).click();
			driver.findElement(retun).click();
			driver.findElement(date2).click();
			
			
		}
}
