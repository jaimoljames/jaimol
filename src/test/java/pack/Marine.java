package pack;

import org.openqa.selenium.WebDriver;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Marine
{
	WebDriver driver;
	By leavingfrom=By.xpath("/html/body/div/div/div[2]/section/div[1]/form/div[2]/div[1]/div/div[1]/div/div/div/div/input");
	
	By goingto=By.xpath("/html/body/div/div/div[2]/section/div[1]/form/div[2]/div[1]/div/div[2]/div/div/div/div/input");
	
	By depart=By.xpath("//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[2]/div[2]/div/div/input");
	
	By arrow=By.xpath("/html/body/div[2]/div[2]/div/div/div/div[1]/div[1]/button");
	
	By year=By.xpath("/html/body/div[2]/div[2]/div/div/div/div[2]/div/div/div[125]/button");
	
	By rightarrow=By.xpath("/html/body/div[2]/div[2]/div/div/div/div[1]/div[2]/button[2]");
	
	By month=By.xpath("/html/body/div[2]/div[2]/div/div/div/div[1]/div[1]/div[1]/div");

	By day=By.xpath("/html/body/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div/div/div/button");
	
	By travellers=By.xpath("//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[3]/ul/li/div");
	By adult=By.xpath("//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[3]/ul/li/ul/li[1]/div/div/div[3]/p");
	
	By child=By.xpath("//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[3]/ul/li/ul/li[2]/div/div/div[3]/p");
	
	By business=By.xpath("//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[3]/ul/li/ul/li[4]/div/div[1]/fieldset/div/label[2]/span[1]/span[1]/input");
	By done=By.xpath("//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[3]/ul/li/ul/li[4]/div/div[2]/span");
	By search=By.xpath("//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[4]/input");
	public Marine(WebDriver driver)
	{
		this.driver=driver;  //constructor
	}
	public void leaving_going()
	{
		driver.findElement(leavingfrom);
		driver.findElement(goingto);
	}
	public void departing()
	{
		driver.findElement(depart).click();
		driver.findElement(arrow).click();
		driver.findElement(year).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		while(true)
		{
			WebElement temp=driver.findElement(month);
			String mon=temp.getText();
			if(mon.equals("November"))
			{
				System.out.println(mon);
				break;
			}
			else
			{
				driver.findElement(rightarrow).click();
			}
		}
		List<WebElement> dates=driver.findElements(day);
				for(WebElement tem:dates)
		{
			String s=tem.getText();
			if(s.equals("26"))
			{
				tem.click();
				break;
			}
		}
	}
	public void traveller()
	{
		driver.findElement(travellers).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(adult).click();
	driver.findElement(child).click();
	driver.findElement(business).click();
	driver.findElement(done).click();
	}
	public void Search()
	{
		driver.findElement(search).click();
	}
}
