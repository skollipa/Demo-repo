import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FormMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Sowjanya\\Selenium\\Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	/*	driver.get("https://www.makemytrip.com/");
		Thread.sleep(500);
		
		//Before selecting multicity
		System.out.println(driver.findElement(By.cssSelector("input[id='hp-widget__return']")).isDisplayed());
		System.out.println(driver.findElement(By.cssSelector("input[id='hp-widget__return']")).isEnabled());
		
		//After selecting multicity
		driver.findElement(By.xpath("//div[@id='multicity']/label")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id='hp-widget__return']")).isDisplayed());
		System.out.println(driver.findElement(By.cssSelector("input[id='hp-widget__return']")).isEnabled());
		driver.close();
		*/
		
		//Before changes
		driver.get("http://spicejet.com/");
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_view_date2")).isDisplayed());
		System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_view_date2")).isEnabled());
		System.out.println(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isSelected());
		
		//After changes
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_2']")).click();
		System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_view_date2")).isDisplayed());
		System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_view_date2")).isEnabled());
		driver.findElement(By.cssSelector("[id='MultiCityModelAlert']")).click();
		
		

	}

}
