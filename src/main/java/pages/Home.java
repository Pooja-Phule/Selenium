package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Home {

public Home(WebDriver d) {
		
	driver=d;
}

static WebDriver driver;
By Login=By.id("login");

public void clickLogin()
{
  driver.findElement(Login).click();
}
}
