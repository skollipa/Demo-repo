import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Sowjanya\\Selenium\\Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://spicejet.com/");
		driver.manage().window().maximize();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_2']")).click();
		int count = driver.findElements(By.xpath("//*[@name='ctl00$mainContent$rbtnl_Trip']")).size();
		System.out.println(count);
		
		for(int i=0; i<count; i++) {
			String button_value = driver.findElements(By.xpath("//*[@name='ctl00$mainContent$rbtnl_Trip']")).get(i).getAttribute("value");
			System.out.println(button_value);
			
			if(button_value.equals("TripPlanner")) {
				driver.findElements(By.xpath("//*[@name='ctl00$mainContent$rbtnl_Trip']")).get(i).click();
			}
		}
		
		driver.findElement(By.id("MultiCityModelAlert")).click();
		driver.close();
		
	}

}
