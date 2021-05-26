package Retaxisb2cEntireFlowz;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Form2 {

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
	public void testSellerForm1Registration() throws InterruptedException, IOException {

		driver.get("https://b2cdemoseller.retaxis.com/SupplierRegistration/F1C3F9DB-7767-46A5-BA13-65D7A1A8F9CE");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	
		driver.findElement(By.xpath("//input[@id='txtcompanyname']")).clear();
		driver.findElement(By.xpath("//input[@id='txtcompanyname']")).sendKeys("Seller4");
		
		driver.findElement(By.id("txtdisplayname")).clear();
		driver.findElement(By.id("txtdisplayname")).sendKeys("Seller4");
		
		driver.findElement(By.id("txtship_address")).clear();
		driver.findElement(By.id("txtship_address")).sendKeys("567 Lakshmi Nagar");
		
		driver.findElement(By.id("txtship_landmark")).clear();
		driver.findElement(By.id("txtship_landmark")).sendKeys("Omni Hospital");
		
		driver.findElement(By.id("txtpinsupplier")).clear();
		driver.findElement(By.id("txtpinsupplier")).sendKeys("500035"+Keys.ENTER);
		

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
		 driver.findElement(By.linkText("NEXT STEP")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//button[@class='confirm']")).click();
		 
		Thread.sleep(5000);

		
	 driver.findElement(By.id("filetopancard")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\SamplePdf.pdf");
	 Thread.sleep(2000);
	 driver.findElement(By.id("filetocst")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\seller.jpg");
	 Thread.sleep(2000);
	 driver.findElement(By.id("filetocancelcheque")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\cancel.jpg");
	 Thread.sleep(2000);
	 driver.findElement(By.id("filetologo")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\orangecap.jpg");
	 Thread.sleep(2000);
//	 driver.findElement(By.id("filetoCmAdPr")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\orangecap.jpg");
//	 Thread.sleep(2000);
//	 driver.findElement(By.id("filetoinvsig")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\orangecap.jpg");
//	 Thread.sleep(2000);
//	 driver.findElement(By.id("filetoperPan")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\orangecap.jpg");
//	 Thread.sleep(2000);
	 driver.findElement(By.id("filetobrand")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\adidas.jpg");
	 Thread.sleep(2000);
	 driver.findElement(By.id("filetosignature")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\signature.png");
	 Thread.sleep(2000);
	 driver.findElement(By.id("tp1")).click();
	 driver.findElement(By.id("tp1")).click();
	 driver.findElement(By.id("btndoc")).click(); 
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//button[@class='confirm']")).click();
	 Thread.sleep(1000);
//brand step 3		
	 WebElement w3= driver.findElement(By.id("ddlbrandname"));
	 Select s3=new Select(w3);
	 s3.selectByIndex(1);
	 
	 WebElement w4= driver.findElement(By.id("ddldoctype"));
	 Select s4= new Select(w4);
	 s4.selectByIndex(1);
	 driver.findElement(By.name("filetobrand")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\adidas.jpg");
	 Thread.sleep(2000);

	 driver.findElement(By.id("btndoc")).click();
	 
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//button[@class='confirm']")).click();
	  Thread.sleep(2000);

	  driver.findElement(By.id("btnsave")).click();
//		 Thread.sleep(2000);
//		 driver.findElement(By.xpath("//button[@class='confirm']")).click();

		
	}
	@AfterClass
	public void sellerApproving() throws IOException, InterruptedException {
		driver.get("https://b2cdemositeadmin.retaxis.com/");
				String main = driver.getWindowHandle();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("txtLogin")).sendKeys("b2cdemo@cstech.in");
		driver.findElement(By.name("txtPassword")).sendKeys("123456789");
	
		
		driver.findElement(By.name("btnSubmit")).click();
	WebElement element =	driver.findElement(By.id("liSales_parent"));
	Actions action= new Actions(driver);
	action.moveToElement(element).build().perform();
	driver.findElement(By.linkText("Sellers")).click();
	// Approve Brand
	List<WebElement> brandQ=	driver.findElements(By.xpath("//a[@title='Brand Request']"));
	for(int j=0;j<brandQ.size();j++){

		System.out.println(brandQ.get(j));

		}
	brandQ.get(0).click();

	
	driver.switchTo().window(main);
	
	List<WebElement> Edit = driver.findElements(By.xpath("//i[@title='Edit']"));
	for(int i=0;i<Edit.size();i++){

		System.out.println(Edit.get(i));

		}
	Edit.get(0).click();

	driver.findElement(By.name("txtslashipperiod")).clear();
	driver.findElement(By.name("txtslashipperiod")).sendKeys("48");
	driver.findElement(By.id("rbtLstActive_0")).click();
	Thread.sleep(1000);
	
		driver.findElement(By.linkText("Submit")).click();
		Thread.sleep(5000);
		WebElement CommissionAssign =driver.findElement(By.xpath("//a[@id='btnEdit39']//img[@title='Edit']"));
		Actions action2=new Actions(driver);
		action2.moveToElement(CommissionAssign).click().build().perform();
		Thread.sleep(2000);
		driver.findElement(By.id("39txtCommissionRate")).clear();
		driver.findElement(By.id("39txtCommissionRate")).sendKeys("10.00");
	
		WebElement Update=driver.findElement(By.xpath("//a[@id='btnUpdate39']//img[@title='Update']"));
		try {
			Actions action3=new Actions(driver);
			action3.moveToElement(Update).click().build().perform();
		} catch (UnhandledAlertException f) {
		    try {
		        Alert alert = driver.switchTo().alert();
		        String alertText = alert.getText();
		        System.out.println("Alert data: " + alertText);
		        alert.accept();
		    } catch (NoAlertPresentException e) {
		        e.printStackTrace();
		    }
		}	
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();

	}	
}
