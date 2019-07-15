/***********************************************************************************************************
Purpose: Test from Interactive Brokers Group
Task: Complete application using selenium webdriver
Language: Java
Author: Raj Patel			Last Revision: 8/29/18
References: https://www.seleniumhq.org/projects/webdriver/
			https://www.seleniumhq.org/docs/03_webdriver.jsp
			https://www.ecanarys.com/Blogs/ArticleID/170/Examples-of-Selenium-Webdriver-Scripts
			https://www.softwaretestingmaterial.com/first-selenium-webdriver-script/
***********************************************************************************************************/


//package newpackage;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyClass {
	
	//Declaring global variable
	 public static WebDriver driver = null;
	 
	 
	 public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Sowjanya\\Selenium\\Jars\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		 //Log In Information
		 driver.manage().window().maximize();
		 driver.get("https://gdcdyn.interactivebrokers.com/sso/Login");
		 driver.findElement(By.name("user_name")).sendKeys("testrp128");
		 driver.findElement(By.name("password")).sendKeys("tester12");
		 driver.findElement(By.id("submitForm")).click();

		 //All the methods below will complete the application page by page.
		 Tradepermissions();
		 Marketdatasubscriber();
		 Informationsystems();
		 ProfessionalMarketData();
		 AccountConfig();
		 ConfigReview();
		 GeneralAgreements();
		 MarketDataAgreements();
		 OnLineNasdaqAgreement();
		 NASDAgreement();
		 NYSEProfessionalAgreement();
		 SecureLogin();
		 Applicationstatus();
		 
		 driver.close(); //Chrome browser will close down if this code does not encounter any problem.
     }
	
	 
	 
	 /***********************************************************************************************************
	  * Image 1
	  * Page Name: Trade Permissions
	  * This method will select all the product under North America and then continue to the next page.
	  * Reference: https://stackoverflow.com/questions/25917132/org-openqa-selenium-
	  * elementnotvisibleexception-element-is-not-currently-visible
	  ***********************************************************************************************************/
	  public static void Tradepermissions() {
			WebElement NorthAmerica;
		
			String mainHandle = driver.getWindowHandle();
			//Wait for the new page to be loaded and elements are recongized by driver
			WebDriverWait waittime = new WebDriverWait(driver, 5);
			waittime.until(ExpectedConditions.visibilityOfElementLocated(By.id("continueID")));
			
			//checking all the checkboxes for all the products under North America
			for (int i = 26 ; i <= 32; i++) {
				NorthAmerica = driver.findElement(By.xpath("//*[@id=\"tradingConfTable\"]/tbody/tr["+i+"]/td[2]"));
				NorthAmerica.click();
			}
		
			driver.findElement(By.id("continueID")).click();	//continues to the next page
	  }
	  
	  
	  
	  /***********************************************************************************************************
	  * Image 2
	  * Page Name: Market Data Subscriber Status
	  * This method will select professional as an option and then continue to the next page.
 	  ***********************************************************************************************************/
	  public static void Marketdatasubscriber() {
		    //Wait for the new page to be loaded and elements are recongized by driver
			String mainHandle = driver.getWindowHandle();
			WebDriverWait waittime = new WebDriverWait(driver, 5);
			waittime.until(ExpectedConditions.visibilityOfElementLocated(By.id("agrees")));
			
			//selecting professional as an option
			WebElement Status = driver.findElement(By.xpath("//*[@id=\"userform\"]/table[1]/tbody/tr[4]/td/input[2]"));
			Status.click();
			driver.findElement(By.id("continueID")).click();	//continues to the next page
	  }
	  
	  
	   
	  /***********************************************************************************************************
	  * Image 3
	  * Page Name: Interactive Brokers Information Systems
	  * This method will save the information and continue to the next page.
 	  ***********************************************************************************************************/
	  public static void Informationsystems() {
		    //Wait for the new page to be loaded and elements are recongized by driver
			String mainHandle = driver.getWindowHandle();
			WebDriverWait waittime = new WebDriverWait(driver, 5);
			waittime.until(ExpectedConditions.visibilityOfElementLocated(By.id("continueID")));
			
			driver.findElement(By.id("continueID")).click();	//continues to the next page
	  }
	  
	  
	  
	  /***********************************************************************************************************
	  * Image 4
	  * Page Name: Interactive Brokers Information Systems
	  * This method will check all the market data boxes under North American Tab, retrive the title of the page,
	  *save all the information and continue to the next page.
 	  ***********************************************************************************************************/
	  public static void ProfessionalMarketData() {
			//Declaring and initializing variables
			WebElement Tradingcheckbox;
			int[] intArray = new int[] {0,2,6,6,2,23,1,4};
			int tablenum = 1;
			int divnum = 1;
			int total = 1;
			int  i;
			
		    //Wait for the new page to be loaded and elements are recongized by driver
			String mainHandle = driver.getWindowHandle();
			WebDriverWait waittime = new WebDriverWait(driver, 5);
			waittime.until(ExpectedConditions.visibilityOfElementLocated(By.className("registration")));
			
			String actualTitle = driver.getTitle();	//This will get the title of the page.
			System.out.println("The title of the page is "+actualTitle);
			
			//This will check all the market data boxes under North American Tab
			while (total != 8) {
				for(i = 1; i <= intArray[total]; i++) {
					Tradingcheckbox = driver.findElement(By.xpath("//*[@id=\"tabs-1\"]/table/tbody/tr/td["+tablenum+"]/div["+divnum+"]/ul/li["+i+"]/span/input"));
					Tradingcheckbox.click();
				}
				total++;
				i = 1;
				divnum++;
				if(total == 5) {
					tablenum = 2;
					divnum = 1;
				}
			}
	
			driver.findElement(By.id("continueID")).click();	//continues to the next page
	  }
	  
	  
	  
	  /***********************************************************************************************************
	  * Image 5
	  * Page Name: Account Configurations
	  * This method will select "Fixed" option for Account Configurations, save all the information and continue
	  * to the next page.
 	  ***********************************************************************************************************/
	  public static void AccountConfig() {
			//Declaring and initializing variables
			WebElement Account;
				
		    //Wait for the new page to be loaded and elements are recongized by driver
			String mainHandle = driver.getWindowHandle();
			WebDriverWait waittime = new WebDriverWait(driver, 5);
			waittime.until(ExpectedConditions.visibilityOfElementLocated(By.className("registration")));
			
			//This will check "Fixed" option
			Account = driver.findElement(By.xpath("//*[@id=\"userform\"]/table[1]/tbody/tr[3]/td[1]/div/span/input"));
			Account.click();
			Account = driver.findElement(By.xpath("//*[@id=\"userform\"]/table[2]/tbody/tr[3]/td[1]/div/span/input"));
			Account.click();
	
			driver.findElement(By.id("continueID")).click();	//continues to the next page
	  }
	  
	  
	 
	  /***********************************************************************************************************
	  * Image 6
	  * Page Name: Review
	  * This method will save the information and continue to the next page.
 	  ***********************************************************************************************************/
	  public static void ConfigReview() {
		    //Wait for the new page to be loaded and elements are recongized by driver
			String mainHandle = driver.getWindowHandle();
			WebDriverWait waittime = new WebDriverWait(driver, 5);
			waittime.until(ExpectedConditions.visibilityOfElementLocated(By.id("backID")));
			
			driver.findElement(By.id("continueID")).click();	//continues to the next page
	  }
	  
	  
	  
	  /***********************************************************************************************************
	  * Image 7
	  * Page Name: General Agreements & Disclosures
	  * This method will check if Day Trading Risk Disclosure Statement exists, accepts all the agreement terms, and 
	  * electronic sign the document. 
 	  ***********************************************************************************************************/
	  public static void GeneralAgreements() {
			//Declaring and initializing variables
			WebElement gnrlagr;
			String[] srgid = new String[] {"final4098", "final4154", "final4013", "final3024", "final4070", "final2192", 
					  "final3071", "final3070", "final3090", "final4002", "final4003", "final3077", "final3076", "final3230",
					  "final3074", "final3073", "final9130", "final3104", "final4016", "final4019"}; 
			  
		    //Wait for the new page to be loaded and elements are recongized by driver
			String mainHandle = driver.getWindowHandle();
			WebDriverWait waittime = new WebDriverWait(driver, 5);
			waittime.until(ExpectedConditions.visibilityOfElementLocated(By.id("backID")));
			
			//Checks if the Day Trading Risk Disclosure Statement exists on the page.
			if (driver.findElement(By.xpath("//strong[contains(text(),'Day Trading Risk Disclosure Statement')]")) != null)
				System.out.println("Day Trading Risk Disclosure Statement exists in this agreement page.");
			else 
				System.out.println("Day Trading Risk Disclosure Statement does not exists in this agreement page.");	
	
			//Aceepts to all the agreements
			for(int i = 0; i < 20; i++) {
				gnrlagr = driver.findElement(By.id(srgid[i]));
				gnrlagr.click();
			}
			
			driver.findElement(By.name("signatures")).sendKeys("Test Test");	//signs the documents
			driver.findElement(By.id("continueID")).click();	//continues to the next page
	  }

	  
	  
	  /***********************************************************************************************************
	  * Image 8
	  * Page Name: Market Data Agreements
	  * This method will electronic sign the document, save it, and continue to the next page. 
 	  ***********************************************************************************************************/
	  public static void MarketDataAgreements() {
		    //Wait for the new page to be loaded and elements are recongized by driver
			String mainHandle = driver.getWindowHandle();
			WebDriverWait waittime = new WebDriverWait(driver, 5);
			waittime.until(ExpectedConditions.visibilityOfElementLocated(By.className("legalbold")));
			
			driver.findElement(By.name("signatures")).sendKeys("Test Test");	//signs the documents
			driver.findElement(By.id("continueID")).click();	//continues to the next page
	  }

	  
	  
	  /***********************************************************************************************************
	  * Image -
	  * Page Name: On-Line Nasdaq Subscriber Agreement
	  * This method will electronic sign the document, save it, and continue to the next page. 
 	  ***********************************************************************************************************/
	  public static void OnLineNasdaqAgreement() {
		    //Wait for the new page to be loaded and elements are recongized by driver
			String mainHandle = driver.getWindowHandle();
			WebDriverWait waittime = new WebDriverWait(driver, 5);
			waittime.until(ExpectedConditions.visibilityOfElementLocated(By.className("legalbold")));
			
			driver.findElement(By.name("signatures")).sendKeys("Test Test");	//signs the documents
			driver.findElement(By.id("continueID")).click();	//continues to the next page
	  }
	  
	  

	  /***********************************************************************************************************
	  * Image 11
	  * Page Name: NASD BTDS Subscriber Agreement
	  * This method will electronic sign the document, save it, and continue to the next page. 
 	  ***********************************************************************************************************/
	  public static void NASDAgreement() {
		    //Wait for the new page to be loaded and elements are recongized by driver
			String mainHandle = driver.getWindowHandle();
			WebDriverWait waittime = new WebDriverWait(driver, 5);
			waittime.until(ExpectedConditions.visibilityOfElementLocated(By.className("legaldocument")));
			
			//signs the documents
			driver.findElement(By.name("signatures")).sendKeys("Test Test");	
			driver.findElement(By.name("bysignatures")).sendKeys("Test Test");	
			driver.findElement(By.id("continueID")).click();	//continues to the next page
	  }
	  
	  
	  
	  /***********************************************************************************************************
	  * Image 9
	  * Page Name: NYSE Professional Subscriber Agreement
	  * This method will select "no" when asked for existing account, agrees to all the agreement terms,
	  * electronic sign the document, save it, and continue to the next page. 
 	  ***********************************************************************************************************/
	  public static void NYSEProfessionalAgreement() {
			 WebElement nyseelement;
		    //Wait for the new page to be loaded and elements are recongized by driver
			String mainHandle = driver.getWindowHandle();
			WebDriverWait waittime = new WebDriverWait(driver, 5);
			waittime.until(ExpectedConditions.visibilityOfElementLocated(By.id("backID")));
		
			nyseelement = driver.findElement(By.cssSelector("input[type='radio'][value='N']")); //selects no when asked for existing account.
			nyseelement.click();
			nyseelement = driver.findElement(By.cssSelector("input[type='radio'][value='accept']")); 	//accepts the agreement
			nyseelement.click();
			
			driver.findElement(By.name("signatures")).sendKeys("Test Test");	//signs the documents
			driver.findElement(By.id("continueID")).click();	//continues to the next page
	  }

	  
	  
	  /***********************************************************************************************************
	  * Image 12
	  * Page Name: Secure Login System
	  * This method will click on "Do Not Activate" option for login system. 
 	  ***********************************************************************************************************/
	  public static void SecureLogin() {
		    //Wait for the new page to be loaded and elements are recongized by driver
			String mainHandle = driver.getWindowHandle();
			WebDriverWait waittime = new WebDriverWait(driver, 5);
			waittime.until(ExpectedConditions.visibilityOfElementLocated(By.id("activateNID")));
			driver.findElement(By.id("activateNID")).click();	//continues to the next page
	  }


	  
	  /***********************************************************************************************************
	  * Image 13
	  * Page Name: Application Status
	  * This method will check if the application status shows "pending review"
 	  ***********************************************************************************************************/
	  public static void  Applicationstatus() {
		    //Wait for the new page to be loaded and elements are recongized by driver
			String mainHandle = driver.getWindowHandle();
			WebDriverWait waittime = new WebDriverWait(driver, 5);
			waittime.until(ExpectedConditions.visibilityOfElementLocated(By.className("app_status_box")));
			
			//Checks if the Day Trading Risk Disclosure Statement exists on the page.
			if (driver.findElement(By.xpath("//span[contains(text(),'Pending Review')]")) != null)
				System.out.println("Application shows 'Pending Review'.");
			else 
				System.out.println("Application does not shows Pending Review.");	
	}
}

