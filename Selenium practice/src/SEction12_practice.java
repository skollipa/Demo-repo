import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SEction12_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.chrome.driver", "C:\\Sowjanya\\Selenium\\Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();*/
		
		System.setProperty("webdriver.gecko.driver", "C:\\Sowjanya\\Selenium\\Jars\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		int number = findFrameNumber(driver,By.id("fb_xdm_frame_https"));
		driver.switchTo().frame(number);
		driver.findElement(By.xpath("//iFrame[@id='fb_xdm_frame_https']")).click();
				
	}
	
	public static int findFrameNumber(WebDriver driver, By by) {
		
		int i;
		int framecount = driver.findElements(By.tagName("iFrame")).size();
		
		for(i=0; i<framecount; i++) {
			
			int count = driver.findElements(by).size();
			if(count>0) {
				break;
			}else
				System.out.println("Element not found");
		}
		driver.switchTo().defaultContent();
		return i;
	}
	

}
