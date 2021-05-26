package StoreSetup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver.WindowType;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProductTypeCreation {
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
	public void testb2cSetup() throws InterruptedException, AWTException {
		
		driver.get("http://siteadminvedson.cstechns.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String main=driver.getWindowHandle();
		driver.findElement(By.name("txtLogin")).sendKeys("vedson@cstech.in");
		driver.findElement(By.name("txtPassword")).sendKeys("45824582");
		driver.findElement(By.name("btnSubmit")).click();
		WebElement element =	driver.findElement(By.partialLinkText("Master"));
		Actions action= new Actions(driver);
		action.moveToElement(element).build().perform();
		driver.findElement(By.linkText("Product Attributes")).click();
		Thread.sleep(2000);
		List<WebElement> Type=driver.findElements(By.xpath("//i[@title='Manage Attribute Value']"));
		for(int i=0;i<Type.size();i++) {
			System.out.println(Type.get(i));
		}
		Type.get(1).click();
		Set<String> a = driver.getWindowHandles();
		for(String s:a)
		{
			driver.switchTo().window(s);
			if(driver.getTitle().contains("Manage Attribute Values"))
			{
				WebElement btn=driver.findElement(By.id("btnAddAttribute"));
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click();",btn);
				driver.findElement(By.id("txtName")).sendKeys("TestSample");
				driver.findElement(By.id("txt_sortid")).clear();
				driver.findElement(By.id("txt_sortid")).sendKeys("0");
				driver.findElement(By.linkText("GO")).click();
				Thread.sleep(5000);
				driver.switchTo().alert().accept();
			}
		}
		driver.switchTo().window(main);
		WebElement element1=	driver.findElement(By.partialLinkText("Master"));
		Actions action1= new Actions(driver);
		action1.moveToElement(element1).build().perform();
		driver.findElement(By.linkText("Product Type Values")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Add More")).click();
		WebElement w3=driver.findElement(By.name("ddlproducttype"));
		Select s1 =new Select(w3);
		s1.selectByVisibleText("TestSample");
		driver.findElement(By.id("chkmainattribute_4")).click();
		driver.findElement(By.id("chkcustomattribute_30")).click();
		driver.findElement(By.id("btnsubmit")).click();
		
}
	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
	}}