import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Sowjanya\\Selenium\\Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		
		//XPath
		driver.get("https://login.salesforce.com/");
		/*driver.findElement(By.xpath("//input[@id='username']")).sendKeys("qwe@gmail.com");
		driver.findElement(By.xpath("//input[@name='pw']")).sendKeys("fdqwfdu");
		driver.findElement(By.xpath("//input[@value='Log In']")).submit();
		System.out.println(driver.findElement(By.xpath("//div[@id='error']")).getText());
		driver.close();*/
		
		
		//CSS		
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("afdaf@gmail.com");
		driver.findElement(By.cssSelector("input#password")).sendKeys("dgasgdf");
		driver.findElement(By.cssSelector("input[id='Login']")).click();
		System.out.println(driver.findElement(By.cssSelector("div#error")).getText());
		driver.close();	
		
	}

}
