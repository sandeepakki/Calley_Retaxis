package Retaxisb2cEntireFlowz;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AddingSingleProduct extends BaseClass{

	@BeforeClass
	public void Login() throws IOException {
	
		driver.get("https://b2cdemoseller.retaxis.com/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.findElement(By.id("left_txtemail")).sendKeys("sandeepakki03@gmail.com");
		driver.findElement(By.id("left_txtpwd")).sendKeys("12345");
		driver.findElement(By.id("signin_btnlogin")).click();
		
	}
	@Test
	public void test_AddSingleListing() throws IOException, InterruptedException {
		
	
//product 1 adding	Adding		
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.xpath("//a[@href='supplierproductlist']"));
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		driver.findElement(By.linkText("Add Single Listing")).click();
	
	//Commission Category	
		WebElement w1=driver.findElement(By.id("maincategory"));
		Select option=new Select(w1);
		option.selectByVisibleText("Clothing");
		
		WebElement w2 = driver.findElement(By.id("ddlcommissioncategory"));
		Select option2= new Select(w2);
		option2.selectByVisibleText("Men Clothing");
		
		
		WebElement w3 = driver.findElement(By.id("ddlsubcategorywithcommision"));
		Select option3= new Select(w3);
		option3.selectByVisibleText("Jacket & Hoodie");
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("NEXT")).click();
	//	Display Category
		//clothing
		Thread.sleep(2000);
		driver.findElement(By.id("myTreeViewn136CheckBox")).click();
	//	driver.findElement(By.xpath("//a[@id='myTreeViewn136']//img[@src='images/iconPlus.png']")).click();
		//Men Clothing
	//	driver.findElement(By.id("myTreeViewn145CheckBox")).click();
	//	driver.findElement(By.xpath("//a[@id='']//img[@src='images/iconPlus.png']")).click();
	//Jacket & Hoodie
//		driver.findElement(By.id("myTreeViewn147CheckBox")).click();

		driver.findElement(By.linkText("NEXT")).click();
		
    //Basic Info
			WebElement w4 = driver.findElement(By.id("ddlproducttype"));
			Select option4= new Select(w4);
			option4.selectByVisibleText("BulkImported");
			Thread.sleep(1000);
			driver.findElement(By.id("rbt_prebook_1")).click();
		driver.findElement(By.xpath("//input[@id='txt_Name']")).sendKeys("Jacket");
		Thread.sleep(1000);
		driver.findElement(By.id("txt_hsn")).sendKeys("HSNCode1");
		driver.findElement(By.id("txt_igst")).sendKeys("18"+Keys.ENTER);
		Thread.sleep(1000);
		
		driver.findElement(By.id("txt_desc")).sendKeys("Sports wear");
		Thread.sleep(1000);
		driver.findElement(By.id("txt_Skucode")).sendKeys("SKUCODE1");
		driver.findElement(By.id("fl_MainImg")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\Jacket1.jpg");
//		driver.findElement(By.id("fl_bookpdf")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\SamplePdf.pdf");
//		driver.findElement(By.id("txt_Metakeywords")).sendKeys("Jersy,Men Jersy");
		WebElement w5 = driver.findElement(By.id("ddlretunpolicy"));
		Select option5= new Select(w5);
		option5.selectByVisibleText("Easy exchange or return within 5 days");
		Thread.sleep(1000);
	
		driver.findElement(By.linkText("NEXT")).click();
		
	//Attribute Settings
		WebElement Fit = driver.findElement(By.id("ddl1"));
		Select select=new Select(Fit);
		select.selectByVisibleText("Regular Fit");
		
		WebElement Fabric = driver.findElement(By.id("ddl2"));
		Select select2=new Select(Fabric);
		select2.selectByVisibleText("Leather");
		
//		WebElement  Closure= driver.findElement(By.id("ddl15"));
//		Select select3=new Select(Closure);
//		select3.selectByVisibleText("Lace-Up");
		
		
//		WebElement  Material= driver.findElement(By.id("ddl23"));
//		Select select4=new Select(Material);
//		select4.selectByVisibleText("Crochet");
		
	
//		WebElement  SoleMaterial= driver.findElement(By.id("ddl36"));
//		Select select5=new Select(SoleMaterial);
//		select5.selectByVisibleText("PU");
		
//		WebElement  Cleats= driver.findElement(By.id("ddl37"));
//		Select select6=new Select(Cleats);
//		select6.selectByVisibleText("No Cleats");
		
		WebElement  Brand= driver.findElement(By.id("ddl8"));
		Select select7=new Select(Brand);
		select7.selectByVisibleText("adidas brabd");
		
//		WebElement  Technology= driver.findElement(By.id("ddl40"));
//		Select select8=new Select(Technology);
//		select8.selectByVisibleText("Clima Cool");
//		takeScreenshot("Attribute2");
		
//color		Thread.sleep(1000);
		driver.findElement(By.id("Checkl9_1")).click();
		driver.findElement(By.id("Checkl9_48")).click();
	//	driver.findElement(By.id("Checkl44_3")).click();
//size			
		driver.findElement(By.id("Checkl10_8")).click();
		driver.findElement(By.id("Checkl10_9")).click();
	//	driver.findElement(By.id("Checkl45_10")).click();
	
		WebElement  SizeChart= driver.findElement(By.id("ddlsizechart"));
		Select select9=new Select(SizeChart);
		select9.selectByVisibleText("Test 3");
		
		driver.findElement(By.linkText("NEXT")).click();
		Thread.sleep(1000);
		
        //COD &Shipping		
		
		driver.findElement(By.id("rbt_cod_0")).click();
		driver.findElement(By.id("txt_Weight")).clear();
		driver.findElement(By.id("txt_Weight")).sendKeys("1000");
		
		driver.findElement(By.xpath("//span[@class='button_03']//a[@id='LinkButton1']")).click();
		Thread.sleep(5000);
		
        //Upload Multiple Images
		driver.findElement(By.linkText("Upload Multiple Image Files")).click();
		driver.findElement(By.id("file-1")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\Jacket2.jpg");
		driver.findElement(By.id("file-1")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\Jacket3.jpg");
		driver.findElement(By.id("file-1")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\Jacket4.jpg");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Upload selected files']//span[text()='Upload']")).click();
		driver.findElement(By.xpath("//div[@class='close fileinput-remove']")).click();

		
		WebElement e1 = driver.findElement(By.xpath("//li[@id='Jacket2.jpg']"));
		WebElement e2 = driver.findElement(By.xpath("//ul[@id='sortableBlack']"));
		Actions a1 = new Actions(driver);
		a1.dragAndDrop(e1, e2).build().perform();
		
		WebElement e3 = driver.findElement(By.xpath("//li[@id='Jacket3.jpg']"));
		WebElement e4 = driver.findElement(By.xpath("//ul[@id='sortableBlack']"));
		Actions a2 = new Actions(driver);
		a1.dragAndDrop(e3, e4).build().perform();
		
		
		WebElement e5 = driver.findElement(By.xpath("//li[@id='Jacket4.jpg']"));
		WebElement e6 = driver.findElement(By.xpath("//ul[@id='sortableWhite']"));
		Actions a3 = new Actions(driver);
		a1.dragAndDrop(e5, e6).build().perform();
		
		driver.findElement(By.xpath("//div[@class='product button_03']//a[@id='LinkButton1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("txtmrpall")).clear();
		driver.findElement(By.id("txtmrpall")).sendKeys("1200");
		driver.findElement(By.id("txtofferall")).clear();
		driver.findElement(By.id("txtofferall")).sendKeys("1000");
		driver.findElement(By.linkText("Confirm")).click();
		driver.findElement(By.name("0Stock")).clear();
		driver.findElement(By.name("0Stock")).sendKeys("100");
		driver.findElement(By.name("0Stockremove")).clear();
		driver.findElement(By.name("0Stockremove")).sendKeys("10");
		driver.findElement(By.id("0chkdefaultval")).click();
		
		
		driver.findElement(By.id("1Price")).clear();
		driver.findElement(By.id("1Price")).sendKeys("1200");
		driver.findElement(By.id("1offerPrice")).clear();
		driver.findElement(By.id("1offerPrice")).sendKeys("1000");
		driver.findElement(By.name("1Stock")).clear();
		driver.findElement(By.name("1Stock")).sendKeys("100");
		driver.findElement(By.name("1Stockremove")).clear();
		driver.findElement(By.name("1Stockremove")).sendKeys("10");
		
		driver.findElement(By.id("2Price")).clear();
		driver.findElement(By.id("2Price")).sendKeys("1800");
		driver.findElement(By.id("2offerPrice")).clear();
		driver.findElement(By.id("2offerPrice")).sendKeys("1500");
		driver.findElement(By.name("2Stock")).clear();
		driver.findElement(By.name("2Stock")).sendKeys("100");
		driver.findElement(By.name("2Stockremove")).clear();
		driver.findElement(By.name("2Stockremove")).sendKeys("10");
		
		
//		driver.findElement(By.id("2Price")).sendKeys("2600");
//		driver.findElement(By.id("2offerPrice")).sendKeys("2400");
//		driver.findElement(By.name("2Stock")).clear();
//		driver.findElement(By.name("2Stock")).sendKeys("10");
//		driver.findElement(By.name("2Stockremove")).clear();
//		driver.findElement(By.name("2Stockremove")).sendKeys("03");
		
		
		driver.findElement(By.linkText("Submit")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='supplierwelcome']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='desk']//a[text()='Sign Out']")).click();
	
	}
	@AfterClass
	public void Logout() throws IOException, InterruptedException {
		driver.get("https://b2cdemositeadmin.retaxis.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.findElement(By.name("txtLogin")).sendKeys("b2cdemo@cstech.in");
		driver.findElement(By.name("txtPassword")).sendKeys("123456789");
		driver.findElement(By.name("btnSubmit")).click();
		
			WebElement element = driver.findElement(By.id("liCatalog"));
			Actions action= new Actions(driver);
			action.moveToElement(element).build().perform();
			driver.findElement(By.linkText("Product's List")).click();
//	     1st product admin approves			
			driver.findElement(By.xpath("//input[@prdcode='SKUCODE1']")).click(); //change based on SKU code
			driver.findElement(By.linkText("Bulk Active")).click();
			Alert alert=driver.switchTo().alert();
			alert.accept();
			Thread.sleep(2000);
			Thread.sleep(1000);
			driver.findElement(By.linkText("Logout")).click();
			}
	}
