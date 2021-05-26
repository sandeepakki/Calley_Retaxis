package StoreSetup;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class StaticContentPages {
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
		WebElement element =	driver.findElement(By.partialLinkText("Content"));
		Actions action= new Actions(driver);
		action.moveToElement(element).build().perform();
		driver.findElement(By.linkText("Seller Static Pages")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create New")).click();
		driver.findElement(By.name("txtHeading")).sendKeys("Test");
		driver.findElement(By.name("txtLinkName")).sendKeys("This-is-test-page");
		driver.findElement(By.name("txtUniqueURL")).sendKeys("TestPage");
		driver.findElement(By.name("txtSortID")).sendKeys("2");
		driver.findElement(By.name("txtImgAltname")).sendKeys("Static Bnanner"+Keys.TAB+"This is seller content page");
		driver.findElement(By.linkText("Save as Draft")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Publish All Pages")).click();
		List<WebElement> EditPage = driver.findElements(By.xpath("//img[@title='Edit']"));
		for(int i=0;i<EditPage.size();i++){
		System.out.println(EditPage.get(i));
		}
				EditPage.get(11).click();
				driver.findElement(By.name("txtHeading")).clear();
				driver.findElement(By.name("txtHeading")).sendKeys("TestPage");
				Thread.sleep(2000);
				driver.findElement(By.linkText("Save as Draft")).click();
				Thread.sleep(2000);
				driver.findElement(By.linkText("Publish All Pages")).click();
				driver.navigate().to("http://sellervedson.cstechns.com//content/TestPage");
				Thread.sleep(5000);
}
	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
	}}
