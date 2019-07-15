import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Sowjanya\\Selenium\\Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		/*System.setProperty("webdriver.gecko.driver", "C:\\Sowjanya\\Selenium\\Jars\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();*/
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Knee");
		Thread.sleep(5000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.DOWN);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String script = "return document.getElementById(\"twotabsearchtextbox\").value;";
		String text = (String) js.executeScript(script);
		int i = 0;
		while(!text.equalsIgnoreCase("Knee high socks"))
		{
			i++;
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.DOWN);
			text = (String) js.executeScript(script);
			System.out.println(text);
			
			if(i>11) {
				break;
			}
			
		}
		if(i>11) {
			System.out.println("Element not found");
		}else
		{
			System.out.println("Element found");
		}
		
				
	}

}
