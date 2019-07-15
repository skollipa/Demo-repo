import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class section11_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Sowjanya\\Selenium\\Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		
		//Count of links on the page
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//Count of links in footer section
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		//Count of links in first column of the footer section
		WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td/ul"));
		int count = columndriver.findElements(By.tagName("a")).size();
		System.out.println(count);
		
		//To open each link in the first column of the footer section
				
		for(int i=1; i<count; i++) {
			
			String clickonlinktab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);					
			
		}
		
		Set<String> ids = driver.getWindowHandles();
		java.util.Iterator<String> it = ids.iterator();
		
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
	}

}
