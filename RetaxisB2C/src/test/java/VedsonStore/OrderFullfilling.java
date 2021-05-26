package VedsonStore;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrderFullfilling extends BaseClass{

	@BeforeMethod
	public void SelelrLogin() {
		
		driver.get("http://sellervedson.cstechns.com/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.findElement(By.id("left_txtemail")).sendKeys("sandeepakki03@gmail.com");
		driver.findElement(By.id("left_txtpwd")).sendKeys("12345");
		driver.findElement(By.id("signin_btnlogin")).click();
	}
	
   @Test
   public void testFullfillment() throws InterruptedException {
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Confirming all the buyer Pending orders
	Thread.sleep(3000);
		for(int j=0;j<=0;j++) {
			driver.navigate().to("http://sellervedson.cstechns.com/suppliermyaccount/pending");
		
				List<WebElement> ManageOrder = driver.findElements(By.xpath("//img[@title='MANAGE ORDER']"));
		for(int i=0;i<ManageOrder.size();i++){
			System.out.println(ManageOrder.get(i).getText());
		}
				ManageOrder.get(0).click();
				WebElement ConfirmOrder = driver.findElement(By.id("orderstatustype"));
				Select option= new Select(ConfirmOrder);
				option.selectByVisibleText("Confirm");
			Thread.sleep(2000);
			driver.findElement(By.linkText("Submit")).click();
	
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Dashboard')]")).click();
		}
		
//	Ready to ship all the confirmed orde
		for(int k=0;k<=0;k++) {
			driver.navigate().to("http://sellervedson.cstechns.com/suppliermyaccount/confirm");
			List<WebElement> ManageOrder1 = driver.findElements(By.xpath("//img[@title='MANAGE ORDER']"));
			for(int L=0;L<ManageOrder1.size();L++){
				System.out.println(ManageOrder1.get(L).getText());
			}
					ManageOrder1.get(0).click();
					WebElement ShippingOrders = driver.findElement(By.id("orderstatustype"));
					Select option1= new Select(ShippingOrders);
					option1.selectByVisibleText("Ready To Ship");
				Thread.sleep(2000);
				WebElement Logistics = driver.findElement(By.id("ddl_logistic"));
				Select option2=new Select(Logistics);
				option2.selectByVisibleText("Delhivery");
				Thread.sleep(2000);
				driver.findElement(By.id("txtshippingheight")).clear();
				driver.findElement(By.id("txtshippingheight")).sendKeys("40");
				driver.findElement(By.id("txtpackagelength")).clear();
				driver.findElement(By.id("txtpackagelength")).sendKeys("40");
				driver.findElement(By.id("txtpackagewidth")).clear();
				driver.findElement(By.id("txtpackagewidth")).sendKeys("40");
				driver.findElement(By.id("txtshippingweight")).clear();
				driver.findElement(By.id("txtshippingweight")).sendKeys("1500");
				driver.findElement(By.id("txt_awbn_no")).sendKeys("43rf4e5");
				Thread.sleep(7000);
				driver.findElement(By.xpath("//span[@class='button_01']/a")).click();
				Thread.sleep(5000);
		
			}	
//Manage order- click here to download manifest -- upload manifest
		
		
		Thread.sleep(2000);
		for(int M=0;M<=0;M++) {
			driver.navigate().to("http://sellervedson.cstechns.com/suppliermyaccount/confirmed");
			List<WebElement> ManageOrder2 = driver.findElements(By.xpath("//img[@title='MANAGE ORDER']"));
			for(int N=0;N<ManageOrder2.size();N++){
				System.out.println(ManageOrder2.get(N));
			}
					ManageOrder2.get(0).click();
					Thread.sleep(2000);
					
				WebElement manifest=driver.findElement(By.xpath("//a[@id='manifestli']"));
				Actions action = new Actions(driver);
				action.moveToElement(manifest).click().build().perform();
				
					
					driver.findElement(By.id("filetomenfest")).sendKeys("C:\\Users\\sande\\OneDrive\\Documents\\SportManifest.jpg");
					Thread.sleep(2000);
					driver.findElement(By.xpath("//a[@id='btn_ship']")).click();
					
				Thread.sleep(5000);
		}

			
		}		
		
		@AfterMethod // change order no:
		public void adminDelivers() {
			driver.get("http://siteadminvedson.cstechns.com/");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.name("txtLogin")).sendKeys("vedson@cstech.in");
			driver.findElement(By.name("txtPassword")).sendKeys("45824582");
			
			driver.findElement(By.name("btnSubmit")).click();
		WebElement element =	driver.findElement(By.id("liSales_parent"));
		Actions action= new Actions(driver);
		action.moveToElement(element).build().perform();
		driver.findElement(By.linkText("New Orders")).click();
		
		driver.findElement(By.xpath("//a[@href ='orderupdate.aspx?id=1136-S1855506&pid=0']/img[@title='MANAGE ORDER']")).click();
		
		WebElement shipped = driver.findElement(By.id("dl_orderstatus"));
		Select status = new Select(shipped);
		status.selectByVisibleText("Shipped");
		driver.findElement(By.linkText("Search")).click();
		
		WebElement OrderStatus1=driver.findElement(By.id("ddlorderstatus"));
		Select select1 = new Select(OrderStatus1);
		select1.selectByVisibleText("Delivered");

		WebElement PaymentStatus1 = driver.findElement(By.id("ddlpaystatus"));
		Select select2=new Select(PaymentStatus1);
		select2.selectByVisibleText("Paid");
		
		driver.findElement(By.id("txt_desc")).sendKeys("Order Delivered Successfully and Payment Received from Buyer");
	driver.findElement(By.linkText("Submit")).click();
	
	//2
	driver.findElement(By.xpath("//a[@href ='orderupdate.aspx?id=1137-S1855506&pid=0']/img[@title='MANAGE ORDER']")).click();
	
	WebElement shipped1 = driver.findElement(By.id("dl_orderstatus"));
	Select status1 = new Select(shipped1);
	status1.selectByVisibleText("Shipped");
	driver.findElement(By.linkText("Search")).click();
	
	WebElement OrderStatus2=driver.findElement(By.id("ddlorderstatus"));
	Select select3 = new Select(OrderStatus2);
	select3.selectByVisibleText("Delivered");

	WebElement PaymentStatus2 = driver.findElement(By.id("ddlpaystatus"));
	Select select4=new Select(PaymentStatus2);
	select4.selectByVisibleText("Paid");
	
	driver.findElement(By.id("txt_desc")).sendKeys("Order Delivered Successfully and Payment Received from Buyer");
driver.findElement(By.linkText("Submit")).click();

//3
driver.findElement(By.xpath("//a[@href ='orderupdate.aspx?id=1138-S1855506&pid=0']/img[@title='MANAGE ORDER']")).click();

WebElement shipped2 = driver.findElement(By.id("dl_orderstatus"));
Select status2 = new Select(shipped2);
status2.selectByVisibleText("Shipped");
driver.findElement(By.linkText("Search")).click();

WebElement OrderStatus3=driver.findElement(By.id("ddlorderstatus"));
Select select5 = new Select(OrderStatus3);
select5.selectByVisibleText("Delivered");

WebElement PaymentStatus4 = driver.findElement(By.id("ddlpaystatus"));
Select select6=new Select(PaymentStatus4);
select6.selectByVisibleText("Paid");

driver.findElement(By.id("txt_desc")).sendKeys("Order Delivered Successfully and Payment Received from Buyer");
driver.findElement(By.linkText("Submit")).click();
	
		
		}
   }

