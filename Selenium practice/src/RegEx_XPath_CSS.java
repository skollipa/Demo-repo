import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegEx_XPath_CSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Sowjanya\\Selenium\\Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("//a[contains(@title, 'Sign in')]")).click();
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("cdgasfd@gmail.com");
		driver.findElement(By.cssSelector("input[name*='passw']")).sendKeys("adsg");
		driver.findElement(By.cssSelector("input[name*='procee']")).click();
		
	}

}
