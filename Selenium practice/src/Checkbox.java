import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Sowjanya\\Selenium\\Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://spicejet.com/");
		driver.manage().window().maximize();
		if(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected()) {
			System.out.println("Already Selected");
			
		}else
			driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
		

	}

}
