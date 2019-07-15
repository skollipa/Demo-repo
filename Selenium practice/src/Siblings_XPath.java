import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Siblings_XPath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Sowjanya\\Selenium\\Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.qaclickacademy.com/");
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right']/li[4]/a")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//div[@class='interview-question']/div/div/ul/li")).click();
		
		//driver.findElement(By.xpath("//li[@id='tablist1-tab1']/following-sibling::li[3]")).click();
		
		//driver.findElement(By.xpath("//li[@id='tablist1-tab1']/parent::ul")).getText();
		
		System.out.println(driver.findElement(By.xpath(".//*[@id='tablist1-tab2']/parent::ul")).getAttribute("role"));
		
		driver.findElement(By.xpath("//*[text()=' Selenium ']")).click();
		driver.findElement(By.xpath("//*[text()=' Soap UI ']")).click();
		driver.findElement(By.xpath("//*[text()=' Testing ']")).click();
		
	}

}
