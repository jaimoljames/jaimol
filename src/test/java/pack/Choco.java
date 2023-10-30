package pack;

import java.io.File;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Choco {
	WebDriver driver;
	By product=By.xpath("/html/body/div[1]/div[5]/div/div[2]/form/input");
	By searchbtn=By.xpath("/html/body/div[1]/div[5]/div/div[2]/form/span");
	
	By add=By.xpath("//*[@id=\"maindiv\"]/div[1]/div/div[1]/div[1]/a/img");
	By addcart=By.xpath("//div[@class='btn btn-add-cart add-cart']//span[@class='M16_white'][normalize-space()='ADD TO CART']");
	By cart=By.xpath("//*[@id=\"cart_TotalCount\"]/span[1]");

	
	By category=By.xpath("/html/body/div[1]/div[8]/div/div/div[2]/div[2]/ul/li[1]/a");
	By foot=By.xpath("/html/body/div[1]/div[8]/div/div/div[2]/div[2]/ul/li[4]/a");
		
	By caters=By.xpath("/html/body/div[1]/div[8]/div/div/div[1]/ul/li[15]/a/img");
	By romber=By.xpath("/html/body/div[1]/div[8]/div/div/div[2]/div[16]/div/div/ul[2]/li[2]/a");
	By pincode=By.xpath("//*[@id=\"cty_pin\"]");
	By apply=By.xpath("//*[@id=\"cty_pin\"]");
		public Choco(WebDriver driver)
	{
		this.driver=driver;  //constructor
	}
	
	public void title()
	{
		String Expected="Baby Products Online India: Newborn Baby Products & Kids Online Shopping at FirstCry.com";

		String actual=driver.getTitle()	;
		
		Assert.assertEquals(Expected,actual);
		System.out.println("passed");
		
	}
	public void search(String item) throws Throwable
	
	{
		
		String parentWindow=driver.getWindowHandle(); 
		driver.findElement(product).clear();
		driver.findElement(product).sendKeys(item);
		driver.findElement(searchbtn).click();
		
		driver.findElement(add).click();
		Set <String> allwindowhandles=driver.getWindowHandles();//next window store cheyan
		for(String handle:allwindowhandles)
		{
			System.out.println(handle);
			
			if(!handle.equalsIgnoreCase(parentWindow))
			{
				driver.switchTo().window(handle);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.findElement(addcart).click();
				driver.findElement(cart).click();
				File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileHandler.copy(src,new File("D://firstcry.png"));
				driver.close();
				
				
			}
			
			
		}
		driver.navigate().back();
		
	

	}
	
	public void catgry() throws Throwable
	{
		//WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement cate =driver.findElement(caters);
		Actions act =new Actions(driver);
		act.moveToElement(cate);
		act.perform();
		System.out.println("passed caters");
		
		
		driver.findElement(romber).click();
		System.out.println("passed");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		

		//driver.navigate().back();

	}
	

	public void code(String pin)  throws Throwable
	{
		//WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.findElement(cart).click();
		driver.findElement(pincode).sendKeys(pin);
		driver.findElement(apply).click();
	
		
	}
	
}
