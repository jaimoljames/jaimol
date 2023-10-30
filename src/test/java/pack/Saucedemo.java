package pack;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Saucedemo {
	WebDriver driver;
	By username=By.xpath("//*[@id=\"user-name\"]");
	By paswrd=By.xpath("//*[@id=\"password\"]");
	By login=By.xpath("//*[@id=\"login-button\"]");
	By element1=By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");
	By element2=By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]");
	By element3=By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]");
	
	By element4=By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]");
	By element5=By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]");
	By element6=By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]");

	By addcart=By.xpath("//*[@id=\"shopping_cart_container\"]/a");
	
	By checkout=By.xpath("//*[@id=\"checkout\"]");
	By fname=By.xpath("//*[@id=\"first-name\"]");
	By lname=By.xpath("//*[@id=\"last-name\"]");
	By pcode=By.xpath("//*[@id=\"postal-code\"]");
	By contnue=By.xpath("//*[@id=\"continue\"]");
	
	By hmenu=By.xpath("//*[@id=\"react-burger-menu-btn\"]");
	By logout=By.xpath("//*[@id=\"logout_sidebar_link\"]");
	public Saucedemo(WebDriver driver)
	{
		this.driver=driver;  //constructor
	}
	public void login(String uname,String pwd) 
	{
		driver.findElement(username).sendKeys(uname);
		driver.findElement(paswrd).sendKeys(pwd);
		driver.findElement(login).click();
		
	}
	public void additem()
	{
		driver.findElement(element1).click();
		driver.findElement(element2).click();
		driver.findElement(element3).click();
		driver.findElement(element4).click();
		driver.findElement(element5).click();
		driver.findElement(element6).click();
		
		 
		
	}
	public void addcart()
	{
		driver.findElement(addcart).click();
	}
	public void fill(String name,String lsname,String pincode )
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(checkout).click();
		driver.findElement(fname).sendKeys(name);
		driver.findElement(lname).sendKeys(lsname);
		driver.findElement(pcode).sendKeys(pincode);
		driver.findElement(contnue).click();
		
	}
	public void back()
	{
		driver.navigate().back();
		driver.findElement(hmenu).click();
		driver.findElement(logout).click();
		
	}
}
