package seleniumScripts;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithChrome {
	ChromeDriver driver;
	String url = "https://google.com";

	
	public void invokeBrowser() {
		System.out.println("This is arivn kumar ");
		System.setProperty("webdriver.chrome.driver", "C:\\GOALCAST\\AutomationScript-Selenium-Java\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}

	
	public void getTitle() {
	String titleOfthePage = driver.getTitle();
	System.out.println("This is the title of this Page :"+titleOfthePage);
	}

	public void closeBrowser() {
		driver.close();
		driver.quit();
	}
	
	public static void main(String[] args) {
		WorkingWithChrome chrome = new WorkingWithChrome();
		
		chrome.invokeBrowser();
		chrome.getTitle();
		chrome.closeBrowser();
	}

}
