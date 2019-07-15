import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IELaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "C:\\Sowjanya\\Selenium\\Jars\\MicrosoftWebDriver.exe");
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://finance.google.com");
		System.out.println(driver.manage().logs());
		driver.close();
		
	}

}
