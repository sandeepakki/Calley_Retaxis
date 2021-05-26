package StoreSetup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HeaderNavigation {

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
		driver.findElement(By.linkText("Header Navigation")).click();
		driver.findElement(By.linkText("Create New")).click();
		driver.findElement(By.linkText("Root")).click();
		WebElement Menu= driver.findElement(By.id("ddl_type"));
		Select select=new Select(Menu);
		select.selectByVisibleText("Category");
		driver.findElement(By.name("Txtheading")).sendKeys("test");
		driver.findElement(By.name("txtlink")).sendKeys("test");
		driver.findElement(By.name("txt_expm_li")).sendKeys("test1");
		WebElement target= driver.findElement(By.id("ddl_target"));
		Select select1=new Select(target);
		select1.selectByVisibleText("Blank");
		driver.findElement(By.name("txtSortingOrder")).sendKeys("0");
		driver.findElement(By.id("chkNew")).click();
		driver.findElement(By.id("chk_left")).click();
		driver.findElement(By.name("txtcss")).sendKeys("4");
		driver.findElement(By.linkText("Submit")).click();
		driver.findElement(By.id("lnk_publish")).click();
	
}
}
