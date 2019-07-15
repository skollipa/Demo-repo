import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Sowjanya\\Selenium\\Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orbitz.com/");
		driver.findElement(By.id("tab-hotel-tab-hp")).click();
		driver.findElement(By.id("hotel-destination-hp-hotel")).sendKeys("NYC");
		driver.findElement(By.id("hotel-destination-hp-hotel")).sendKeys(Keys.TAB);
		driver.findElement(By.id("hotel-checkin-hp-hotel")).click();
		
		List<WebElement> dates = driver.findElements(By.className("datepicker-cal-date"));
		int count = driver.findElements(By.className("datepicker-cal-date")).size();
		
		for(int i=0; i<count; i++)
		{
			String text = driver.findElements(By.className("datepicker-cal-date")).get(i).getText();
			if(text.equals("31"))
			{
				driver.findElements(By.className("datepicker-cal-date")).get(i).click();
				break;
			}
		}
		System.out.println("Test passed");
	}

}
