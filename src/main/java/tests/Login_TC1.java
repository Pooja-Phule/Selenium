package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Dashboard;
import pages.Home;
import pages.Login;

public class Login_TC1 {

	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\POPHULE\\Documents\\Driver_Notes\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/books");
		
		Home home= new Home(driver);
		home.clickLogin();
		Thread.sleep(3000);
		Login log=new Login(driver);
		log.enterusername("poojaphule");
		log.enterpassword("Ppm@2024");
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,200)", " ");
		log.clicklogin();
		Thread.sleep(3000);
		Dashboard dash=new Dashboard(driver);
		dash.Logout();
		Thread.sleep(3000);
		driver.close();
	}
	
}
