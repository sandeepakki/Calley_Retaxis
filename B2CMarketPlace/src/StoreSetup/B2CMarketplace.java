package StoreSetup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class B2CMarketplace {
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
		driver.findElement(By.linkText("Market Place Profile")).click();
		driver.findElement(By.name("txt_compname")).clear();
		driver.findElement(By.name("txt_compname")).sendKeys("Vedson.in");
		driver.findElement(By.name("txt_compaddress")).clear();
		driver.findElement(By.name("txt_compaddress")).sendKeys("Rajkot");
		driver.findElement(By.name("txtcountry")).clear();
		driver.findElement(By.name("txtcountry")).sendKeys("India");
		driver.findElement(By.name("txtPinCode")).clear();
		driver.findElement(By.name("txtPinCode")).sendKeys("360001");
		driver.findElement(By.name("txtCity")).clear();
		driver.findElement(By.name("txtCity")).sendKeys("RAJKOT");
		driver.findElement(By.name("txtState")).clear();
		driver.findElement(By.name("txtState")).sendKeys("GUJARAT");
		driver.findElement(By.name("txt_mobile")).clear();
		driver.findElement(By.name("txt_mobile")).sendKeys("+91 9687444111");
		driver.findElement(By.name("txt_fax")).clear();
		driver.findElement(By.name("txt_fax")).sendKeys("Test");
		driver.findElement(By.name("txt_email")).clear();
		driver.findElement(By.name("txt_email")).sendKeys("Vedson17@gmail.com");
		driver.findElement(By.name("txt_tin")).clear();
		driver.findElement(By.name("txt_tin")).sendKeys("27ABCCS6439D1ZB");
		driver.findElement(By.name("txt_panno")).clear();
		driver.findElement(By.name("txt_panno")).sendKeys("27ABCC");
		driver.findElement(By.name("txt_cinno")).clear();
		driver.findElement(By.name("txt_cinno")).sendKeys("Test");
		driver.findElement(By.id("lnk_publish")).click();
		driver.findElement(By.name("txt_website_title_text")).clear();
		driver.findElement(By.name("txt_website_title_text")).sendKeys("Vedson: The One-stop Shopping Destination");
		driver.findElement(By.name("txt_metatitle")).clear();
		driver.findElement(By.name("txt_metatitle")).sendKeys("Vedson");
		driver.findElement(By.name("txt_metakeywords")).clear();
		driver.findElement(By.name("txt_metakeywords")).sendKeys("Vedson");
		driver.findElement(By.name("txt_Metadesc")).clear();
		driver.findElement(By.name("txt_Metadesc")).sendKeys("Shop from the latest and trendy collection of Sportswear for Men,"+
		" Women and Kids, Offer running.");
		driver.findElement(By.name("txt_length")).clear();
		driver.findElement(By.name("txt_length")).sendKeys("100");
		driver.findElement(By.name("txt_copyright")).clear();
		driver.findElement(By.name("txt_copyright")).sendKeys("Copyright © 2021, Vedson.in, All Rights Reserved");
		driver.findElement(By.name("txtOrderSeq")).clear();
		driver.findElement(By.name("txtOrderSeq")).sendKeys("22");
		driver.findElement(By.name("txtsellerinvoice")).clear();
		driver.findElement(By.name("txtsellerinvoice")).sendKeys("1061");
		driver.findElement(By.name("itemsthreshold")).clear();
		driver.findElement(By.name("itemsthreshold")).sendKeys("5");
		driver.findElement(By.id("rbt_manageinventory_1")).click();
		driver.findElement(By.id("rbt_manageinventory_0")).click();
		driver.findElement(By.id("rbt_aucon_0")).click();
		driver.findElement(By.id("rbt_aucon_1")).click();
		driver.findElement(By.id("rbt_lowstock_1")).click();
		driver.findElement(By.id("rbt_lowstock_0")).click();
		driver.findElement(By.name("txtLowStock")).clear();
		driver.findElement(By.name("txtLowStock")).sendKeys("5");
		driver.findElement(By.name("txt_abdn_cart")).clear();
		driver.findElement(By.name("txt_abdn_cart")).sendKeys("5");
		driver.findElement(By.id("rbt_prd_lst_show_1")).click();
		driver.findElement(By.id("rbt_prd_lst_show_0")).click();
		driver.findElement(By.id("rbtnlistLiveChat_1")).click();
		driver.findElement(By.id("rbtnlistLiveChat_2")).click();
		driver.findElement(By.id("rbtnlistLiveChat_0")).click();
		driver.findElement(By.name("txtmailchimpapikey")).clear();
		driver.findElement(By.name("txtmailchimpapikey")).sendKeys("fc0df576895d98c28c5bd9af71e36cc8-us4");
		driver.findElement(By.name("txtmailchimpdatacenter")).clear();
		driver.findElement(By.name("txtmailchimpdatacenter")).sendKeys("us4");
		driver.findElement(By.name("txtmailchimpbuyerlistid")).clear();
		driver.findElement(By.name("txtmailchimpbuyerlistid")).sendKeys("d8b377291f");
		driver.findElement(By.name("txtmailchimpsellerlistid")).clear();
		driver.findElement(By.name("txtmailchimpsellerlistid")).sendKeys("123");
		driver.findElement(By.name("txtslacharge")).clear();
		driver.findElement(By.name("txtslacharge")).sendKeys("2.00");
		driver.findElement(By.id("ShowMostPopular")).click();
		WebElement e1 = driver.findElement(By.xpath("//li[text()='Relevance Order']"));
		WebElement e2 = driver.findElement(By.id("UnselectUL"));
		Actions a1 = new Actions(driver);
		a1.dragAndDrop(e1, e2).build().perform();
		driver.findElement(By.xpath("//span[@onclick='UpdateSortingData()']")).click();
		Thread.sleep(2000);
		try {
		    Alert alt = driver.switchTo().alert();
		    alt.accept();
		} catch(NoAlertPresentException noe) {
		    // No alert found on page, proceed with test.
		}
		Thread.sleep(2000);
		driver.findElement(By.id("btn_publish")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logo and Details")).click();
		driver.findElement(By.name("txtEmail")).clear();
		driver.findElement(By.name("txtEmail")).sendKeys("customersupport@vedson.in");
		driver.findElement(By.name("txtcontact")).clear();
		driver.findElement(By.name("txtcontact")).sendKeys("+917588774444");
		driver.findElement(By.id("btn_publish")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ui-accordion-accordion-header-3")).click();
		driver.findElement(By.id("chk_COD")).click();
		driver.findElement(By.id("chk_COD")).click();
		driver.findElement(By.name("txt_paymentmode4")).clear();
		driver.findElement(By.name("txt_paymentmode4")).sendKeys("Cash On Delivery (COD)");
		WebElement w3=driver.findElement(By.name("ddlCODType"));
		Select s1 =new Select(w3);
		s1.selectByVisibleText("Flat");
		driver.findElement(By.name("txtCODCharges")).clear();
		driver.findElement(By.name("txtCODCharges")).sendKeys("25");
		driver.findElement(By.linkText("Finish")).click();
	}
		@AfterTest
		public void tearDown() {
			driver.close();
			driver.quit();
		}
	}

	