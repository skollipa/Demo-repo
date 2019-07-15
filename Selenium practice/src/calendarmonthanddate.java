import java.sql.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendarmonthanddate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Sowjanya\\Selenium\\Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orbitz.com/");
		driver.findElement(By.id("tab-hotel-tab-hp")).click();
		driver.findElement(By.id("hotel-destination-hp-hotel")).sendKeys(" NYC");
		driver.findElement(By.id("hotel-destination-hp-hotel")).sendKeys(Keys.TAB);
		String checkOutMonth ="Sep";
		
		//CheckOutDate= 'Sep 21 2018'
		//Check IN Date=''
		//Select Check-in date
		driver.findElement(By.id("hotel-checkin-hp-hotel")).click();
		while(!driver.findElement(By.xpath("//*[@id='hotel-checkin-wrapper-hp-hotel']/div/div/div[2]/table/caption")).getText().contains("Aug 2018"))
		{
			System.out.println(driver.findElement(By.xpath("//*[@id='hotel-checkin-wrapper-hp-hotel']/div/div/div[2]/table/caption")).getText());
			driver.findElement(By.xpath("//*[@id='hotel-checkin-wrapper-hp-hotel']/div/div/button[2]")).click();			
		
		}
				
		List<WebElement> dates = driver.findElements(By.className("datepicker-cal-date"));
		int count = driver.findElements(By.className("datepicker-cal-date")).size();
		
		for(int i = 0; i<count; i++)
		{
			String text = driver.findElements(By.className("datepicker-cal-date")).get(i).getText();
			if(text.equals("23")) {
				driver.findElements(By.className("datepicker-cal-date")).get(i).click();
				break;
			}
		}
		System.out.println("Test passed - Check-in");
		
		//Select Check-out date
		driver.findElement(By.id("hotel-checkout-hp-hotel")).click();
		//System.out.println(driver.findElement(By.xpath("//*[@class='datepicker-cal-month-header']")).getText());
		
		String element1 = driver.findElement(By.xpath("//*[@id='hotel-checkout-wrapper-hp-hotel']/div/div/div[2]/table/caption")).getText();
		System.out.println(element1);
		String element2 = driver.findElement(By.xpath("//*[@id='hotel-checkout-wrapper-hp-hotel']/div/div/div[3]/table/caption")).getText();
		System.out.println(element2);
		//Define webelement 
		
		if((element2.equals(checkOutMonth))) 
		{			
			System.out.println(driver.findElement(By.xpath("//*[@id='hotel-checkout-wrapper-hp-hotel']/div/div/div[3]/table/caption")));
			//webelement  = driver.findElement(By.xpath("//*[@id='hotel-checkout-wrapper-hp-hotel']/div/div/div[3]/table/caption"))
		}
		else if((element2.equals("Aug 2018"))) 
		{
			System.out.println(driver.findElement(By.xpath("//*[@id='hotel-checkout-wrapper-hp-hotel']/div/div/div[2]/table/caption")));
			//webelement
			//webelement  = driver.findElement(By.xpath("//*[@id='hotel-checkout-wrapper-hp-hotel']/div/div/div[3]/table/caption"))
		}
		else
		{
			//throw error
			//throw exception
		}
		//use//webelement
			
			//System.out.println(driver.findElement(By.xpath("//*[@class='datepicker-cal-month-header']")).getText());
			List<WebElement >dates1 = driver.findElements(By.className("datepicker-cal-date"));
			int count2 = dates1.size();
			
			for(int i=0; i<count2; i++)
			{
				String text1 = driver.findElements(By.className("datepicker-cal-date")).get(i).getText();
				if(text1.equals("15")) {
					driver.findElements(By.className("datepicker-cal-date")).get(i).click();
					break;
				}
			}
			
		}else
			System.out.println("Select only current and next month");
		
		System.out.println("Test passed - Check-out");
		
		
		
		
		
		
	}

}
