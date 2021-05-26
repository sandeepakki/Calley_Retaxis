package Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BulkAdding {
	WebDriver driver;
	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://sellervedson.cstechns.com/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.findElement(By.id("left_txtemail")).sendKeys("sandeepkumar@cstech.in");
		driver.findElement(By.id("left_txtpwd")).sendKeys("Xyz@123");
		driver.findElement(By.id("signin_btnlogin")).click();
		Thread.sleep(2000);
	}
	@Test(dataProvider = "testData1")
	public void testAddCategories(String MainCat,String CommCate,String SubCat,String DisCat,
			String ptValue,String Pname,String Hcode,String Tax,String Desc,String SKU,
			String mImg,String Rpolicy,String att1,String att2,String att3,
			String color1, String color2,String size1,String size2,String SChart,String upImg1,String upImg2,
			String liImg1,String ulSclr1,String liImg2,String ulSclr2) throws InterruptedException {
		
		WebElement element = driver.findElement(By.xpath("//a[@href='supplierproductlist']"));
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		driver.findElement(By.linkText("Add Single Listing")).click();

		//Commission Category	
				WebElement w1=driver.findElement(By.id("maincategory"));
				Select option=new Select(w1);
				option.selectByVisibleText(MainCat);
				
				WebElement w2 = driver.findElement(By.id("ddlcommissioncategory"));
				Select option2= new Select(w2);
				option2.selectByVisibleText(CommCate);
				
				WebElement w3 = driver.findElement(By.id("ddlsubcategorywithcommision"));
				Select option3= new Select(w3);
				option3.selectByVisibleText(SubCat);

				
				Thread.sleep(2000);
				driver.findElement(By.linkText("NEXT")).click();
			//	Display Category
				//clothing
				Thread.sleep(2000);
				driver.findElement(By.id(DisCat)).click();
			//	driver.findElement(By.xpath("//a[@id='myTreeViewn136']//img[@src='images/iconPlus.png']")).click();
				//Men Clothing
		//		driver.findElement(By.id(DisSub)).click();
			//	driver.findElement(By.xpath("//a[@id='']//img[@src='images/iconPlus.png']")).click();
			//Jacket & Hoodie
//				driver.findElement(By.id("myTreeViewn147CheckBox")).click();
				driver.findElement(By.linkText("NEXT")).click();
				
		    //Basic Info
					WebElement w4 = driver.findElement(By.id("ddlproducttype"));
					Select option4= new Select(w4);
					option4.selectByVisibleText(ptValue);
					Thread.sleep(1000);
					driver.findElement(By.id("rbt_prebook_1")).click();
				driver.findElement(By.xpath("//input[@id='txt_Name']")).sendKeys(Pname);
				Thread.sleep(1000);
				driver.findElement(By.id("txt_hsn")).sendKeys(Hcode);
				driver.findElement(By.id("txt_igst")).sendKeys(Tax+Keys.ENTER);
				Thread.sleep(1000);
				
				driver.findElement(By.id("txt_desc")).sendKeys(Desc);
				Thread.sleep(1000);
				driver.findElement(By.id("txt_Skucode")).sendKeys(SKU);
				driver.findElement(By.id("fl_MainImg")).sendKeys(mImg);
//				driver.findElement(By.id("fl_bookpdf")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\SamplePdf.pdf");
//				driver.findElement(By.id("txt_Metakeywords")).sendKeys("Jersy,Men Jersy");
				WebElement w5 = driver.findElement(By.id("ddlretunpolicy"));
				Select option5= new Select(w5);
				option5.selectByVisibleText(Rpolicy);
				Thread.sleep(1000);
				driver.findElement(By.linkText("NEXT")).click();
				
			//Attribute Settings
				WebElement Fit = driver.findElement(By.id("ddl5"));
				Select select=new Select(Fit);
				select.selectByVisibleText(att1);
				
				WebElement Fabric = driver.findElement(By.id("ddl17"));
				Select select2=new Select(Fabric);
				select2.selectByVisibleText(att2);
				
//				WebElement  Closure= driver.findElement(By.id("ddl15"));
//				Select select3=new Select(Closure);
//				select3.selectByVisibleText("Lace-Up");
				
				
//				WebElement  Material= driver.findElement(By.id("ddl23"));
//				Select select4=new Select(Material);
//				select4.selectByVisibleText("Crochet");
				
			
//				WebElement  SoleMaterial= driver.findElement(By.id("ddl36"));
//				Select select5=new Select(SoleMaterial);
//				select5.selectByVisibleText("PU");
				
//				WebElement  Cleats= driver.findElement(By.id("ddl37"));
//				Select select6=new Select(Cleats);
//				select6.selectByVisibleText("No Cleats");
				
				WebElement  Brand= driver.findElement(By.id("ddl44"));
				Select select7=new Select(Brand);
				select7.selectByVisibleText(att3);
				
//				WebElement  Technology= driver.findElement(By.id("ddl40"));
//				Select select8=new Select(Technology);
//				select8.selectByVisibleText("Clima Cool");
//				takeScreenshot("Attribute2");
				
		//color		Thread.sleep(1000);
				driver.findElement(By.id(color1)).click();
				driver.findElement(By.id(color2)).click();
			//	driver.findElement(By.id("Checkl44_3")).click();
		//size			
				Thread.sleep(5000);
//			driver.findElement(By.xpath("//*[@id='Checkl46_8']")).click();
//			driver.findElement(By.id("//*[@id='Checkl46_9']")).click();
			//	driver.findElement(By.id("Checkl45_10")).click();
			
				WebElement  SizeChart= driver.findElement(By.id("ddlsizechart"));
				Select select9=new Select(SizeChart);
				select9.selectByVisibleText(SChart);
				driver.findElement(By.linkText("NEXT")).click();
				Thread.sleep(1000);
				
		        //COD &Shipping		
				
				driver.findElement(By.id("rbt_cod_0")).click();
				driver.findElement(By.id("txt_Weight")).clear();
				driver.findElement(By.id("txt_Weight")).sendKeys("1000");
				driver.findElement(By.xpath("//span[@class='button_03']//a[@id='LinkButton1']")).click();
				Thread.sleep(3000);
				
		        //Upload Multiple Images
				driver.findElement(By.linkText("Upload Multiple Image Files")).click();
				driver.findElement(By.id("file-1")).sendKeys(upImg1);
				driver.findElement(By.id("file-1")).sendKeys(upImg2);
			//	driver.findElement(By.id("file-1")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\Jacket4.jpg");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[@title='Upload selected files']//span[text()='Upload']")).click();
				driver.findElement(By.xpath("//div[@class='close fileinput-remove']")).click();
				
				WebElement e1 = driver.findElement(By.id(liImg1));
				WebElement e2 = driver.findElement(By.id(ulSclr1));
				Actions a1 = new Actions(driver);
				a1.dragAndDrop(e1, e2).build().perform();
				
//				WebElement e3 = driver.findElement(By.xpath("//li[@id='Jacket3.jpg']"));
//				WebElement e4 = driver.findElement(By.xpath("//ul[@id='sortableBlack']"));
//				Actions a2 = new Actions(driver);
//				a1.dragAndDrop(e3, e4).build().perform();
				
				
				WebElement e5 = driver.findElement(By.id(liImg2));
				WebElement e6 = driver.findElement(By.id(ulSclr2));
				Actions a3 = new Actions(driver);
				a1.dragAndDrop(e5, e6).build().perform();
				
				Thread.sleep(5000);
//				driver.findElement(By.linkText("Next")).click();
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
				driver.findElement(By.id("1Price")).sendKeys("1500");
				driver.findElement(By.id("1offerPrice")).clear();
				driver.findElement(By.id("1offerPrice")).sendKeys("1500");
				driver.findElement(By.name("1Stock")).clear();
				driver.findElement(By.name("1Stock")).sendKeys("100");
				driver.findElement(By.name("1Stockremove")).clear();
				driver.findElement(By.name("1Stockremove")).sendKeys("10");
				
				driver.findElement(By.id("2Price")).clear();
				driver.findElement(By.id("2Price")).sendKeys("2500");
				driver.findElement(By.id("2offerPrice")).clear();
				driver.findElement(By.id("2offerPrice")).sendKeys("2500");
				driver.findElement(By.name("2Stock")).clear();
				driver.findElement(By.name("2Stock")).sendKeys("100");
				driver.findElement(By.name("2Stockremove")).clear();
				driver.findElement(By.name("2Stockremove")).sendKeys("10");
			
		
				driver.findElement(By.linkText("Submit")).click();
		
		
				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[@href='supplierwelcome']")).click();
		
		
		
		
		
		
		
		
		
		
	}
	
	@DataProvider(name="testData1")
			public Object[][] getData() {
				String excelPath = "C:\\Users\\sande\\eclipse-workspace\\RetaxisDemoStore\\"+
			"AddingBulkProducts\\ExcelSheets\\BulkProducts.xlsx";
				String sheetName = "Sheet1";
				Object data[][]= testData(excelPath, sheetName);
				return data;
	}
	
	public  Object[][] testData(String excelPath,String sheetName) {
		
		ExcelUtils excel = new ExcelUtils(excelPath,sheetName);
		int rowCount  = excel.getRowCount();
		int colCount = excel.getColCount();
		
		Object data[][] =new Object[rowCount-1][colCount];
		
		for(int i=1;i<rowCount;i++) {
			for(int j=0;j<colCount;j++) {
				
			String cellData = excel.getCellDataString(i, j);
				System.out.print(cellData+ " | ");
				data[i-1][j] = cellData;
			}
			System.out.println();
		}
		return data;
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}


}
