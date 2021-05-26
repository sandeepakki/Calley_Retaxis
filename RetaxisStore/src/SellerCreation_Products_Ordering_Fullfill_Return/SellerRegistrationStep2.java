package SellerCreation_Products_Ordering_Fullfill_Return;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SellerRegistrationStep2 extends BaseClass{

	@BeforeClass
	public void SellerResgisterPage2() {
		
		driver.get("http://sellervedson.cstechns.com/SupplierRegistration/4740F143-7708-4784-AAF1-F7CD151F9A92");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}
	@Test
	public void test_RegistrationProcess() throws IOException, InterruptedException {
		
		driver.findElement(By.xpath("//input[@id='txtcompanyname']")).clear();
		driver.findElement(By.xpath("//input[@id='txtcompanyname']")).sendKeys("Testing");
		
		driver.findElement(By.id("txtdisplayname")).clear();
		driver.findElement(By.id("txtdisplayname")).sendKeys("Testing sellers");
		
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
		 takeScreenshot("Seller-info");
		 driver.findElement(By.linkText("NEXT STEP")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//button[@class='confirm']")).click();
		 
		Thread.sleep(5000);

		
	 driver.findElement(By.id("filetopancard")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\SamplePdf.pdf");
	 Thread.sleep(2000);
	 driver.findElement(By.id("filetocst")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\seller.jpg");
	 Thread.sleep(2000);
	 driver.findElement(By.id("filetocancelcheque")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\pngCancel.png");
	 Thread.sleep(2000);
	 driver.findElement(By.id("filetologo")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\orangecap.jpg");
	 Thread.sleep(2000);
	 driver.findElement(By.id("filetoCmAdPr")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\orangecap.jpg");
	 Thread.sleep(2000);
	 driver.findElement(By.id("filetoinvsig")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\orangecap.jpg");
	 Thread.sleep(2000);
	 driver.findElement(By.id("filetoperPan")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\orangecap.jpg");
	 Thread.sleep(2000);
	 driver.findElement(By.id("filetobrand")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\brand.jpg");
	 Thread.sleep(2000);
	 driver.findElement(By.id("filetosignature")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\signature.jpeg");
	 Thread.sleep(2000);
	 driver.findElement(By.id("tp1")).click();
	 driver.findElement(By.id("tp1")).click();
	 takeScreenshot("Seller-KYC-docs");

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
	 driver.findElement(By.name("filetobrand")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\SamplePdf.pdf");
	 Thread.sleep(2000);
	 takeScreenshot("Seller-Brand-Docs");

	 driver.findElement(By.id("btndoc")).click();
	 
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//button[@class='confirm']")).click();
	  Thread.sleep(2000);
		 takeScreenshot("Seller-Brand-Img");

	  driver.findElement(By.id("btnsave")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@class='confirm']")).click();

		
	}
	@AfterClass
	public void sellerApproving() throws IOException, InterruptedException {
		driver.get("https://b2cdemositeadmin.retaxis.com/");
				String main = driver.getWindowHandle();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("txtLogin")).sendKeys("sportalook@cstech.in");
		driver.findElement(By.name("txtPassword")).sendKeys("45824582");
	
		
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
	takeScreenshot("SLA");
		driver.findElement(By.linkText("Submit")).click();
		Thread.sleep(5000);
		WebElement CommissionAssign =driver.findElement(By.xpath("//a[@id='btnEdit39']//img[@title='Edit']"));
		Actions action2=new Actions(driver);
		action2.moveToElement(CommissionAssign).click().build().perform();
		takeScreenshot("Cat-Commission");
		Thread.sleep(2000);
		driver.findElement(By.id("39txtCommissionRate")).clear();
		driver.findElement(By.id("39txtCommissionRate")).sendKeys("10.00");
		takeScreenshot("Comm-Set");
	
		WebElement Update=driver.findElement(By.xpath("//a[@id='btnUpdate39']//img[@title='Update']"));
		try {
			Actions action3=new Actions(driver);
			action3.moveToElement(Update).click().build().perform();
			takeScreenshot("Comm-Update");
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
