package testngSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMTest extends BaseTest {
	
	

	@Test(priority = 2)
	public void orangeHRMTitleTest() {
		Assert.assertEquals(driver.getTitle(), "Sign Up for a Free HR Software Trial | OrangeHRM");
	}

	@Test(priority = 3)
	public void orangeHRMUrlTest() {
		Assert.assertTrue(driver.getCurrentUrl().contains("orangehrm"));
	}

	@Test
	public void orangeHRMFreeTrailButtonTest() {
		
		Assert.assertTrue(driver.findElement(By.cssSelector(".contact-ohrm")).isDisplayed());
	}
	@Test
	public void orangeHRMEnterValues() {
		driver.findElement(By.name("FirstName")).sendKeys("MALLESWARI");
		System.out.println("entered firstName");
		
	}
	@Test
	public void orangeHRMEnterLastValue() {
		driver.findElement(By.name("LastName")).sendKeys("Sibyala");
		System.out.println("entered lastName");
	}
	@Test
	public void orangeHRMEnterEmail() {
		driver.findElement(By.name("Email")).sendKeys("malleswarisibyala@gmail.com");
		System.out.println("entered mail");
	}
	@Test
	public void orangeHRMEnterCompanyName() {
		driver.findElement(By.name("CompanyName")).sendKeys("CTS");
		System.out.println("entered companyName");
	}
	@Test
	public void orangeHRMEnterContact() {
		driver.findElement(By.name("Contact")).sendKeys("8639636968");
		System.out.println("entered contact");
	}
	@Test
	public void orangeHRMEnterSelectValue() {
		Select text=new Select(driver.findElement(By.id("Form_submitForm_NoOfEmployees")));
		text.selectByIndex(5);
	}
	@Test
	public void orangeHRMEnterSelectCountry() {
		Select text=new Select(driver.findElement(By.name("Country")));
		text.selectByIndex(5);
	}
	@Test
	public void orangeHRMEnterSelectIndustry() {
		Select text=new Select(driver.findElement(By.name("Industry")));
		text.selectByIndex(5);
	}
	
	@Test
	public void orangeCheckBox() {
		driver.findElement(By.xpath("(//input[@id='Form_submitForm_SetDummyData'])")).click();
	}
	@Test
	public void orangeHRMSubmitBelowText() {
		String text=driver.findElement(By.id("Form_submitForm_LabelFieldSystemNote")).getText();
		System.out.println(text);
	}
	@Test(priority = 1) 
	public void orangeHRMEnterSelectCountryMultiple() {
	
		Select text=new Select(driver.findElement(By.name("Country")));
		text.isMultiple();
	}

	@Test
	public void orangeHRMSubmit() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
}


