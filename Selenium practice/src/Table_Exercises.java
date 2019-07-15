import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Exercises {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Sowjanya\\Selenium\\Jars\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		int Sum=0;
		driver.get("http://www.cricbuzz.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("nav[id='cb-main-menu'] a:nth-child(2)")).click();
		driver.findElement(By.cssSelector("nav[class='cb-mat-mnu'] a:nth-child(3)")).click();
		driver.findElement(By.cssSelector("nav[class='cb-nav-bar'] a:nth-child(2)")).click();
		
		Thread.sleep(2000);
		WebElement table = driver.findElement(By.xpath("//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int rowcount = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		
		//Screenshot of the table
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Sowjanya\\Selenium\\Selenium learning\\workspace\\Selenium\\src\\Screenshots\\Pakistan_Innings.png"));
		
		for(int i=0; i<count-2; i++)
		{
			String run = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			Sum = Sum+Integer.parseInt(run);
			
		}
		
		String Extras = table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		Sum = Sum+Integer.parseInt(Extras);
		
		String Total = table.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int integerTotal = Integer.parseInt(Total);
		
		if(Sum==integerTotal)
		{
			System.out.print("Count is correct");
		}else
			System.out.println("Count is incorrect");
		
		driver.close();
	}

}
