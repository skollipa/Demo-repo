import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Browser initiation
		System.setProperty("webdriver.gecko.driver", "C:\\Sowjanya\\Selenium\\Jars\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//Browser Navigation
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.name("username")).sendKeys("abc@gmail.com");		
		driver.findElement(By.name("pw")).sendKeys("Hello");
		//driver.findElement(By.xpath("//*[@id=\'Login\']")).click();	
		driver.findElement(By.cssSelector("#Login")).click();
		
		
		
	}

}
