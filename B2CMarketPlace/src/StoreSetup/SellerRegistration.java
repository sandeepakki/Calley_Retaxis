package StoreSetup;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SellerRegistration {
	
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
//	@Test()
//	public void testRegistrationF1() throws InterruptedException, IOException {
//		driver.get("http://sellervedson.cstechns.com/register");
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		Thread.sleep(2000);
//		driver.findElement(By.id("right_txtname")).sendKeys("Asif768374");
//		driver.findElement(By.id("right_txtemailid")).sendKeys("yawiye6488@frnla.com");
//		driver.findElement(By.id("right_txtpwd")).sendKeys("12345");
//		driver.findElement(By.id("right_txtcpwd")).sendKeys("12345");
//		driver.findElement(By.id("right_txtcontact")).sendKeys("9502627001");
//		driver.findElement(By.id("Agree")).click();	
//	WebElement w1=	driver.findElement(By.id("reg_btnlogin"));
//		JavascriptExecutor executor = (JavascriptExecutor)driver;
//		executor.executeScript("arguments[0].click();", w1);
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//button[@class='confirm']")).click();
//}
	@Test() //Comment out other test Function
	public void testRegistrationF2() throws InterruptedException, IOException {
		driver.get("http://sellervedson.cstechns.com/SupplierRegistration/402EEF1B-D659-44C7-9B70-24E50088C218");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath("//input[@id='txtcompanyname']")).clear();
		driver.findElement(By.xpath("//input[@id='txtcompanyname']")).sendKeys("Sandeep Test Company");
		
		driver.findElement(By.id("txtdisplayname")).clear();
		driver.findElement(By.id("txtdisplayname")).sendKeys("Sandeep seller");
		
		driver.findElement(By.id("txtcpan")).clear();
		driver.findElement(By.id("txtcpan")).sendKeys("873289");
		
		driver.findElement(By.id("txtfassai")).clear();
		driver.findElement(By.id("txtfassai")).sendKeys("CINONO1");
		
		driver.findElement(By.id("txtship_address")).clear();
		driver.findElement(By.id("txtship_address")).sendKeys("3-9-538 Sri rama hills colony");
		
		driver.findElement(By.id("txtship_landmark")).clear();
		driver.findElement(By.id("txtship_landmark")).sendKeys("Mansoorabad");
		
		driver.findElement(By.id("txtpinsupplier")).clear();
		driver.findElement(By.id("txtpinsupplier")).sendKeys("500068"+Keys.ENTER);
		

		Thread.sleep(2000);
		
		WebElement w1=driver.findElement(By.id("txtbusinesstype"));
		Select s1=new Select(w1);
		s1.selectByVisibleText("Sole Proprietor");
		
		driver.findElement(By.id("txtpassportno")).clear();
		driver.findElement(By.id("txtpassportno")).sendKeys("CDIN123455784");
		
		driver.findElement(By.id("txtaboutus")).clear();
		driver.findElement(By.id("txtaboutus")).sendKeys("This is for testing");
		
		driver.findElement(By.id("txtbuisnessdescription")).clear();
		driver.findElement(By.id("txtbuisnessdescription")).sendKeys("This is for testing");
		 Thread.sleep(2000);
	

		 driver.findElement(By.id("txtbankaccount")).clear();
		 driver.findElement(By.id("txtbankaccount")).sendKeys("2013045987");
		 
		 driver.findElement(By.id("txtBeneficiary")).clear();
		 driver.findElement(By.id("txtBeneficiary")).sendKeys("Sandeep");
		 
		 driver.findElement(By.id("txtbankname")).clear();
		 driver.findElement(By.id("txtbankname")).sendKeys("RBI");
		 
		 driver.findElement(By.id("txtbranch")).clear();
		 driver.findElement(By.id("txtbranch")).sendKeys("Mumbai");
		 
		 driver.findElement(By.id("txtifsc")).clear();
		 driver.findElement(By.id("txtifsc")).sendKeys("RBI0011999");
		
		 WebElement w2= driver.findElement(By.id("txtactype"));
		 Select s2=new Select(w2);
		 s2.selectByIndex(1);
		WebElement w3= driver.findElement(By.linkText("NEXT STEP"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", w3);
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//button[@class='confirm']")).click();
		 
		Thread.sleep(5000);

		
	 driver.findElement(By.id("filetopancard")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\epfo.pdf");
	 Thread.sleep(2000);
	 driver.findElement(By.id("filetocst")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\epfo.pdf");
	 Thread.sleep(2000);
	 driver.findElement(By.id("filetocancelcheque")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\N1.jpg");
	 Thread.sleep(2000);
	 driver.findElement(By.id("filetologo")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\N2.jpg");
	 Thread.sleep(2000);
	 driver.findElement(By.id("filetoCmAdPr")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\ss.png");
	 Thread.sleep(2000);
	 driver.findElement(By.id("filetoinvsig")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\N1.jpg");
	 Thread.sleep(2000);
	 driver.findElement(By.id("filetoperPan")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\N2.jpg");
	 Thread.sleep(2000);
	 driver.findElement(By.id("filetobrand")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\N1.jpg");
	 Thread.sleep(2000);
	 driver.findElement(By.id("filetosignature")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\sign.jpg");
	 Thread.sleep(2000);
	 driver.findElement(By.id("filetoprofileimage")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\profile.jpg");
	 Thread.sleep(2000);
//	WebElement w6= driver.findElement(By.id("tp1"));
//	JavascriptExecutor executor1 = (JavascriptExecutor)driver;
//	executor1.executeScript("arguments[0].click();", w6);

	WebElement w7= driver.findElement(By.id("btndoc"));
	 JavascriptExecutor executor2 = (JavascriptExecutor)driver;
		executor2.executeScript("arguments[0].click();", w7);
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//button[@class='confirm']")).click();
	 Thread.sleep(1000);
//brand step 3		
	 WebElement w4= driver.findElement(By.id("ddlbrandname"));
	 Select s3=new Select(w4);
	 s3.selectByIndex(1);
	 
	 WebElement w5= driver.findElement(By.id("ddldoctype"));
	 Select s4= new Select(w5);
	 s4.selectByIndex(1);
	 driver.findElement(By.name("filetobrand")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\Vedson.pdf");
	 Thread.sleep(2000);

	 driver.findElement(By.id("btndoc")).click();
	 
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//button[@class='confirm']")).click();
	  Thread.sleep(2000);

	 WebElement w8= driver.findElement(By.id("btnsave"));
	 JavascriptExecutor executor1 = (JavascriptExecutor)driver;	
	 executor1.executeScript("arguments[0].click();", w8);
	 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@class='confirm']")).click();

	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	}
	
	
	
	
