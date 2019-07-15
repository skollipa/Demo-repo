import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Sowjanya\\Selenium\\Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orbitz.com/");
		System.out.println(java.time.LocalTime.now());
		driver.manage().window().maximize();
		
		//- If used here, total run time is 6 secs, 7 sec
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
				
		driver.findElement(By.id("tab-hotel-tab-hp")).click();
		driver.findElement(By.id("hotel-destination-hp-hotel")).clear();
		driver.findElement(By.id("hotel-destination-hp-hotel")).sendKeys("NYC");
		driver.findElement(By.id("hotel-destination-hp-hotel")).sendKeys(Keys.ENTER);
		
		//driver.findElement(By.xpath("//*[@id='gcw-hotel-form-hp-hotel']/div[8]/label/button")).click();
		
		//- If used here, total run time is 7 secs, 8 sec
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		WebDriverWait d = new WebDriverWait(driver,20);
		d.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='sortContainer']/div[1]/div/div[2]/div/fieldset/div/button")));
		driver.findElement(By.xpath("//div[@id='sortContainer']/div[1]/div/div[2]/div/fieldset/div/button")).click();
		driver.findElement(By.xpath("//div[@id='sortContainer']/div[1]/div/div[2]/div/fieldset/div/div/ul/li[4]/button")).click();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
						
		d.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='25888']/div[2]/div[1]/a"))));
		System.out.println(driver.findElement(By.xpath("//*[@id='25888']/div[2]/div[1]/a")).getAttribute("href"));
					
		
		System.out.println(java.time.LocalTime.now());
		
	}

}
