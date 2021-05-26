package CalleyStandardUpload;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CSVfile {
	
	public static WebDriver driver;
	@BeforeClass
	public void setUp() {
	String browser="Chrome";
	if(browser.equals("Firefox"))
	{
		System.setProperty("webdriver.gecko.driver","C:\\drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	else if(browser.equals("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	}
	@Test(priority=1)
	public void testRegister() throws InterruptedException{
		 driver.get("https://appv20.getcalley.com/");
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		 driver.manage().deleteAllCookies();
		 
		 driver.findElement(By.xpath("//a[@id='cmdsinup']")).click();
		 driver.findElement(By.name("txtName")).sendKeys("Testing");
		 driver.findElement(By.name("txtEmail")).sendKeys("testing03@cstech.in");
		 driver.findElement(By.name("txtPassword")).sendKeys("12345");
		 driver.findElement(By.name("txt_mobile")).sendKeys("123456789");
		 driver.findElement(By.name("inputcaptcha")).click();
		 Thread.sleep(7000);
		 driver.findElement(By.id("checkbox-signup")).click();
		 driver.findElement(By.name("btnSignUp")).click();
		 Thread.sleep(2000);
	}
	@Test(priority=2)     
	public void testUploadCSV() throws InterruptedException {    /*The Commented Script is incase if u directly do login and upload csv */
//		driver.get("https://appv20.getcalley.com/");
//		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//		 driver.manage().deleteAllCookies();
//		driver.findElement(By.name("txtEmailId")).sendKeys("testing01@cstech.in");   
//		driver.findElement(By.name("txtPassword")).sendKeys("12345");
//		driver.findElement(By.name("btnLogIn")).click();
		
		driver.findElement(By.xpath("//span[@onclick='SetTogglevalue();']")).click();
		driver.findElement(By.xpath("//button[@class='close']")).click();
		driver.findElement(By.xpath("//header/div[2]/div[1]/div[1]/ul[1]/li[2]/a[1]/i[1]")).click();
		WebElement w1=driver.findElement(By.xpath("//header/div[2]/div[1]/div[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[1]"));
		Actions action = new Actions(driver);
		action.moveToElement(w1).click().build().perform();
		driver.findElement(By.id("ContentPlaceHolder1_listname")).sendKeys("Test Data");
		driver.findElement(By.linkText("Proceed to load data >>")).click();
		driver.findElement(By.linkText("Add Numbers in Bulk")).click();
		driver.findElement(By.id("ContentPlaceHolder1_fileUpload")).sendKeys("C:\\Users\\sande\\OneDrive\\Documents\\CallListSamplar.csv");
		driver.findElement(By.id("btn_automation")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='confirm']")).click();
		Thread.sleep(10000);
		WebElement element2 = driver.findElement(By.xpath("//div[@class='dataTables_info']"));
		Actions action2 = new Actions(driver);
		action2.moveToElement(element2).build().perform();
		Thread.sleep(3000);
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
