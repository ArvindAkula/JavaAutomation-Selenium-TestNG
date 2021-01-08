package SampleTestApplication;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTestApplication {
	ChromeDriver driver;
	String url = "https://google.com";

	@BeforeMethod
	public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\GOALCAST\\AutomationScript-Selenium-Java\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}

	@Test(priority = 0)
	public void verfiyTitle() {
		String expectedTitle = "Google";
		String currentTitle = driver.getTitle();
		AssertJUnit.assertEquals(expectedTitle, currentTitle);
	}

	@Test(priority = 2)
	public void verifyLogin() {
		WebElement userId = driver.findElement(By.name("uid"));
		WebElement userPassword = driver.findElement(By.name("password"));
		WebElement loginButton = driver.findElement(By.name("btnLogin"));
		userId.sendKeys("TestUserName");
		userPassword.sendKeys("TestPassword");
		loginButton.click();

	}

	@Test(priority = 3)
	public void addCustomer() {
		WebElement addCustomerLink = driver.findElement(By.linkText("New Customer"));
		addCustomerLink.click();
        //Radio Button Click
		driver.findElement(By.xpath("//input[@value='f']")).click();
		driver.findElement(By.name("name")).sendKeys("Arvind Kumar A");
		driver.findElement(By.name("dob")).sendKeys("01/01/1960");
		driver.findElement(By.name("sub")).click();

	}

	@Test(priority = 4)
	public void getCustomerID() {

		String customerID = driver.findElement(By.xpath("//table[@id='customer']/tbody/tr[4]/tr[2]")).getText();
		System.out.println("CustomerID is :" + customerID);

	}

}
