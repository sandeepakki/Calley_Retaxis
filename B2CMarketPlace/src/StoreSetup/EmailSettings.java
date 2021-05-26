package StoreSetup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EmailSettings {

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
		WebElement element =	driver.findElement(By.partialLinkText("Setup"));
		Actions action= new Actions(driver);
		action.moveToElement(element).build().perform();
		driver.findElement(By.linkText("Email Settings")).click();
		driver.findElement(By.linkText("Create New")).click();
		driver.findElement(By.name("txtemailprovidername")).sendKeys("test");
		driver.findElement(By.name("txtUsername")).sendKeys("test@gmail.com");
		driver.findElement(By.name("txtPassword")).sendKeys("test");
		driver.findElement(By.name("txtSmtpHost")).sendKeys("smtp.1and1.com");
		driver.findElement(By.name("txtSmtpPort")).sendKeys("587");
		driver.findElement(By.id("chkSSL")).click();
		driver.findElement(By.id("chkNetwork")).click();
		driver.findElement(By.linkText("Save")).click();
		Thread.sleep(2000);
		try {
		driver.switchTo().alert().accept();
		}
		catch(NoAlertPresentException e) {
			System.out.println(e.getStackTrace());
		}
		Thread.sleep(2000);
		driver.findElement(By.linkText("Publish")).click();		
}	
}
