import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class multiplewindow_handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Sowjanya\\Selenium\\Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orbitz.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("tab-hotel-tab-hp")).click();
		driver.findElement(By.id("hotel-destination-hp-hotel")).sendKeys("NYC");
		driver.findElement(By.id("hotel-destination-hp-hotel")).sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebDriverWait d = new WebDriverWait(driver,20);
		d.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='4164']/div[2]/div[1]/a"))));
		driver.findElement(By.xpath("//*[@id='4164']/div[2]/div[1]/a")).click();
		
		Set<String>ids = driver.getWindowHandles();
		System.out.println(ids);
		Iterator<String> it = ids.iterator();
		String Parentid = it.next();
		String Childid = it.next();
		System.out.println("Before Switching " +driver.getTitle());
		driver.switchTo().window(Childid);
		System.out.println("After Switching " +driver.getTitle());
		driver.switchTo().window(Parentid);
		System.out.println("Switching back to parent " +driver.getTitle());
		
		
		
		
		
		
	}

}
