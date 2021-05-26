package StoreSetup;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SellerApprovalActivationbyAdmin {
	
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
	public void sellerApproving() throws IOException, InterruptedException {
		driver.get("http://siteadminvedson.cstechns.com/");
				String main = driver.getWindowHandle();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("txtLogin")).sendKeys("vedson@cstech.in");
		driver.findElement(By.name("txtPassword")).sendKeys("45824582");
		driver.findElement(By.name("btnSubmit")).click();
	WebElement element =	driver.findElement(By.id("liSales_parent"));
	Actions action= new Actions(driver);
	action.moveToElement(element).build().perform();
	driver.findElement(By.linkText("Sellers")).click();
	// Approve Brand
	List<WebElement> brandQ=driver.findElements(By.xpath("//a[@title='Brand Request']"));
	for(int j=0;j<brandQ.size();j++){

		System.out.println(brandQ.get(j));

		}
	brandQ.get(0).click();
	Set<String> a = driver.getWindowHandles();
	for(String s:a)
	{
		driver.switchTo().window(s);
		if(driver.getTitle().contains("Seller Brand Request"))
		{
			WebElement w1=driver.findElement(By.xpath("//td[@align='center'][6]/a[1]/i"));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", w1);
			Thread.sleep(3000);
		}
	}
	
	try {
		Alert alt=driver.switchTo().alert();
		alt.accept();
	}catch(Exception e) {
	System.out.println(e.getMessage());
	}
	Thread.sleep(2000);
	driver.switchTo().window(main);
	driver.findElement(By.xpath("//i[@title='Edit'][1]")).click();
	
	driver.findElement(By.name("txtslashipperiod")).clear();
	driver.findElement(By.name("txtslashipperiod")).sendKeys("48");
	driver.findElement(By.id("rbtLstActive_0")).click();
	Thread.sleep(1000);
		driver.findElement(By.linkText("Submit")).click();
		Thread.sleep(5000);
		WebElement CommissionAssign =driver.findElement(By.xpath("//a[@id='btnAdd39']//img[@title='Assign']"));
		Actions action2=new Actions(driver);
		action2.moveToElement(CommissionAssign).click().build().perform();
		Thread.sleep(2000);
		WebElement w2=driver.findElement(By.xpath("//img[@title='Edit']"));
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();", w2);
		driver.findElement(By.id("0txtCommissionRate")).clear();
		driver.findElement(By.id("0txtCommissionRate")).sendKeys("10.00");
		WebElement Update=driver.findElement(By.xpath("//a[@id='btnUpdate0']//img[@title='Update']"));
		Actions action3=new Actions(driver);
		action3.moveToElement(Update).click().build().perform();
		Thread.sleep(2000);
		try {
			Alert alert = driver.switchTo().alert();
	        alert.accept();
		} catch (UnhandledAlertException f) {
		        System.out.println(f.getAlertText());
		}
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();

	}	
	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	}
