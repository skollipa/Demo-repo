import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Sowjanya\\Selenium\\Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		
		//Firefox
//		System.setProperty("webdriver.gecko.driver", "C:\\Sowjanya\\Selenium\\Jars\\geckodriver-v0.20.1-win64\\geckodriver.exe");
//		WebDriver driver1 = new FirefoxDriver();
////		
//		//IE
//		System.setProperty("webdriver.ie.driver", "C:\\Sowjanya\\Selenium\\Jars\\MicrosoftWebDriver.exe");
//		WebDriver driver1 = new InternetExplorerDriver();
			
		
		//Dynamic dropdown		
		driver1.get("http://spicejet.com/");
		driver1.manage().window().maximize();
		Thread.sleep(1000);
				
		driver1.findElement(By.cssSelector("input[id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver1.findElement(By.cssSelector("a[value='GOI']")).click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath("(//a[@value='IXE'])[2]")).click();
		Thread.sleep(2000);
		//Static dropdown
		Select s1 = new Select(driver1.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s1.selectByValue("6");
		
		//Child selection
		s1 = new Select(driver1.findElement(By.id("ctl00_mainContent_ddl_Child")));
		s1.selectByValue("2");
			
		
		
	}

}
