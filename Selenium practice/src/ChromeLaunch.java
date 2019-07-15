import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ChromeLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Sowjanya\\Selenium\\Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
//		System.out.println(driver.getTitle());
//		//System.out.println(driver.getPageSource());
//		System.out.println(driver.getCurrentUrl());
//		driver.get("https://peerstreet.com");
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.close();
		
		//driver.findElement(By.name("q")).sendKeys("Mahanati Showtimes");
		//driver.findElement(By.name("btnK")).click();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.name("username")).sendKeys("abc@gmail.com");		
		driver.findElement(By.name("pw")).sendKeys("Hello");
		//driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		driver.findElement(By.cssSelector("#Login")).click();
		System.out.println(driver.findElement(By.cssSelector("#error")).getText());
		driver.close();
		
				
	}

}
