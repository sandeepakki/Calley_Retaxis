package StoreSetup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProductApprovalRejection {
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
	
	@Test
	public void testb2cSetup() throws InterruptedException {
		
		driver.get("http://siteadminvedson.cstechns.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("txtLogin")).sendKeys("vedson@cstech.in");
		driver.findElement(By.name("txtPassword")).sendKeys("45824582");
		driver.findElement(By.name("btnSubmit")).click();
		WebElement element =	driver.findElement(By.partialLinkText("Master"));
		Actions action= new Actions(driver);
		action.moveToElement(element).build().perform();
		driver.findElement(By.linkText("Product's List")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("chk_usr")).click();
		driver.findElement(By.linkText("Bulk Active")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@title='Reject Product']")).click();
		driver.findElement(By.name("txtdisc")).sendKeys("Test Reject");
		driver.findElement(By.linkText("GO")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();

}
	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
	}}
