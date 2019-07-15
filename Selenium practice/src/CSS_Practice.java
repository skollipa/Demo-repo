import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CSS_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.ie.driver", "C:\\Sowjanya\\Selenium\\Jars\\MicrosoftWebDriver.exe");
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://login.salesforce.com/");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		/*driver.findElement(By.cssSelector("input[name='username']")).sendKeys("afdaf@gmail.com");
		driver.findElement(By.cssSelector("input#pw")).sendKeys("dgasgdf");
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
		System.out.println(driver.findElement(By.cssSelector("div.loginError")).getText());*/
		
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("afdaf@gmail.com");
		driver.findElement(By.cssSelector("input#password")).sendKeys("dgasgdf");
		driver.findElement(By.cssSelector("input[id='Login']")).click();
		System.out.println(driver.findElement(By.cssSelector("div[id='error']")).getText());
		driver.close();	
		
	}

}
