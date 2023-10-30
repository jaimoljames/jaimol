package pack;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Expedia
{
	WebDriver driver;
	By goingto=By.xpath("//*[@id=\"lodging_search_form\"]/div/div/div[1]/div/div[2]/div[1]/button");
     By go=By.xpath("//*[@id=\"destination_form_field\"]");
	By date=By.xpath("//*[@id=\"lodging_search_form\"]/div/div/div[2]/div/div[1]/div/div/button");
	
	By arrow=By.xpath("//*[@id=\"app-layer-uitk-date-selector-dialog-default\"]/section/div[3]");
	
	By monyear=By.xpath("//*[@id=\"app-layer-uitk-date-selector-dialog-default\"]/section/div[3]/div/div/div/div[3]/span");
	By day1=By.xpath("//*[@id=\"ktjwme\"]/span");
	By day2=By.xpath("//*[@id=\"app-layer-uitk-date-selector-dialog-default\"]/section/div[3]/div/div/div/div[3]/table/tbody/tr[1]/td[5]/div/div[2]");
	By done=By.xpath("//*[@id=\"app-layer-uitk-date-selector-dialog-default\"]/section/footer/button");
	By travellers=By.xpath("//*[@id=\"lodging_search_form\"]/div/div/div[3]/div/div[1]/button");
	By adult=By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[2]/div[1]/div[4]/div[1]/div/div/div/div[2]/form/div/div/div[3]/div/div[2]/div/div/section/div[1]/div[1]/div/div/button[2]/span");
    By child=By.xpath("//*[@id=\"lodging_search_form\"]/div/div/div[3]/div/div[2]/div/div/section/div[1]/div[2]/div[1]/div/button[2]/span");
    By search=By.xpath("//*[@id=\"search_button\"]");
    By flight=By.xpath("//*[@id=\"soft_packages_flight_pill\"]");
  By month=By.xpath("//*[@id=\"app-layer-uitk-date-selector-dialog-default\"]/section/div[3]/div/div/div/div[2]/span");

    public Expedia(WebDriver driver)
	{
		this.driver=driver;  //constructor
	}
    public void go(String place)
    {
    	driver.findElement(goingto).click();
    	driver.findElement(go).click();
    	driver.findElement(go).sendKeys(place);
    	driver.findElement(go).isSelected();
    	
    }
  /*  public void tdate()
    {
    	driver.findElement(date).click();
    	driver.findElement(arrow).click();
    	//driver.findElement(day1).click();
    	//driver.findElement(day2).click();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    	while(true)
		{
			WebElement temp=driver.findElement(monyear);
			String mon=temp.getText();
			if(mon.equals("November"))
			{
				System.out.println(mon);
				break;
			}
		}
    	List<WebElement> dates=driver.findElements(day1);
		for(WebElement tem:dates)
		{
			String s=tem.getText();
			if(s.equals("1"))
			{
				tem.click();
				break;
			}
		}
    	
    	driver.findElement(done).click();
    }*/
    public void tick()
    {
    	driver.findElement(flight).click();
    }
    
    public void search()
    {
    	driver.findElement(search).click();
    }   
	/*public void travel()
	{
	    
		driver.findElement(travellers).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(adult).click();
		driver.findElement(child).click();
		
		driver.findElement(done).click();
	}*/
}
    

