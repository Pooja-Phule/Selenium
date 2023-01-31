package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Login {

	public Login (WebDriver d)
	{

		driver=d;
	}
	
	 static WebDriver driver;
	 
	By username1=By.id("userName");
	
	By password1=By.id("password");
	
	By login=By.id("login");
	
  public void enterusername(String username)
	{
		driver.findElement(username1).sendKeys(username);
	}
	public void enterpassword(String password)
	{
		driver.findElement(password1).sendKeys(password);
	}
	public void clicklogin()
	{
		driver.findElement(login).click();
	}
	
	
}
