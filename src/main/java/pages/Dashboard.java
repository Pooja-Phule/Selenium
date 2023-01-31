package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Dashboard {




public Dashboard(WebDriver d)
{

	driver=d;
}
  static WebDriver driver;
By logout=By.id("submit");

public void Logout()
{
	driver.findElement(logout).click();
}
}
