package StoreSetup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AttributeCreation {
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
		driver.findElement(By.linkText("Product Attributes")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Custom Attribute")).click();
		driver.findElement(By.name("textname")).sendKeys("RAM Memory");
		WebElement w3=driver.findElement(By.name("ddltype"));
		Select s1 =new Select(w3);
		s1.selectByVisibleText("DropDownList");
		driver.findElement(By.name("txtinitialvalue")).sendKeys("3GB|4GB|6GB");
		driver.findElement(By.name("txtseqid")).sendKeys("2");
		driver.findElement(By.linkText("GO")).click();

}
	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
	}}