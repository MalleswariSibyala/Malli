package testngSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	WebDriver driver;
	@BeforeSuite
	public void setUp() {
		
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
		
	}
	
	

}
