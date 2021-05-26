package OrderBasedCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BuyerOrders extends BaseClass {
	
	@BeforeMethod
	public void testCase3() throws InterruptedException, IOException {
		
		driver.get("https://b2cdemo.retaxis.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
	driver.findElement(By.xpath("//body/div[@id='page']/form[@id='form1']/div[@id='divdefault']/div[@id='header-wrap']"+
		"/div[@id='fixedElement_relative']/div[@id='head']/div[@id='container']/div[@id='right']/div[@id='user']/span[1]/a[1]/div[1]")).click();
		driver.findElement(By.id("left_txtemail")).sendKeys("sandeepkumar@cstech.in");
		driver.findElement(By.id("left_txtpwd")).sendKeys("12345");
		driver.findElement(By.id("signin_btnlogin")).click();
		Thread.sleep(1000);
	}
		@Test
		public void testSCCOD() throws IOException, InterruptedException {
 	for(int i=0;i<=0;i++) {
 		//p1	buyer Cancellation		
 				driver.navigate().to("http://vedson.cstechns.com/products/Bagpackwildcraft/Orange/BMP-S1344649#.YE8ieZ0zbIU");
 				driver.findElement(By.xpath("//a[@onclick='javascript:add_into_cart(\"SKJIO\",\"Retaxis\",\"No\",\"SupplierCode|SKUCode|Color|Size|Variants|Model|Attribute1|Attribute2|Attribute3|Attribute4\",\"BMP-S1344649\",\"products\");']")).click();
 				driver.findElement(By.xpath("//button[@class='confirm']")).click();
 		//P2 Seller Cancellation
 				driver.navigate().to("http://vedson.cstechns.com/products/ABC-Product8/Red/BMP-S1476378#.YE8i-J0zbIU");
 				driver.findElement(By.xpath("//a[@onclick='javascript:add_into_cart(\"SKU8\",\"Retaxis\",\"\",\"SupplierCode|SKUCode|Color|Size|Variants|Model|Attribute1|Attribute2|Attribute3|Attribute4\",\"BMP-S1476378\",\"products\");']")).click();
 				driver.findElement(By.xpath("//button[@class='confirm']")).click();
 		//p3 Seller Cancellation
 				
 				driver.navigate().to("http://vedson.cstechns.com/products/ABC-Product7/Black/BMP-S1476378#.YE8jSJ0zbIU");
 				driver.findElement(By.xpath("//a[@onclick='javascript:add_into_cart(\"SKU7\",\"Retaxis\",\"\",\"SupplierCode|SKUCode|Color|Size|Variants|Model|Attribute1|Attribute2|Attribute3|Attribute4\",\"BMP-S1476378\",\"products\");']")).click();
 				driver.findElement(By.xpath("//button[@class='confirm']")).click();
 		//p4 Admin Cancellation
 				driver.navigate().to("http://vedson.cstechns.com/products/Jersey/Black/BMP-S1220197#.YE8j0J0zbIU");
 				driver.findElement(By.xpath("//input[@id='QtyAdd']")).click();
 				driver.findElement(By.xpath("//a[@onclick='javascript:add_into_cart(\"SKU9\",\"Retaxis\",\"No\",\"SupplierCode|SKUCode|Color|Size|Variants|Model|Attribute1|Attribute2|Attribute3|Attribute4\",\"BMP-S1220197\",\"products\");']")).click();
 				driver.findElement(By.xpath("//button[@class='confirm']")).click();
 				
 		//p5 Others
 				driver.navigate().to("http://vedson.cstechns.com/BMP-S1855506/products/ABC-Product4/Pink/BMP-S1855506#.YE8jop0zbIU");
 				driver.findElement(By.xpath("//input[@id='QtyAdd']")).click();
 				driver.findElement(By.xpath("//a[@onclick='javascript:add_into_cart(\"SKU4\",\"Retaxis\",\"No\",\"SupplierCode|SKUCode|Color|Size|Variants|Model|Attribute1|Attribute2|Attribute3|Attribute4\",\"BMP-S1855506\",\"products\");']")).click();
 				driver.findElement(By.xpath("//button[@class='confirm']")).click();
 			
 		//p6
 				Thread.sleep(2000);
 				driver.navigate().refresh();
 				driver.findElement(By.xpath("//a[@title='Black']/img")).click();
 				driver.findElement(By.xpath("//input[@id='QtyAdd']")).click();
 				Thread.sleep(1000);
 				driver.findElement(By.xpath("//input[@id='QtyAdd']")).click();
 				Thread.sleep(1000);
 				driver.findElement(By.xpath("//input[@id='QtyAdd']")).click();
 				driver.findElement(By.xpath("//a[@onclick='javascript:add_into_cart(\"SKU4\",\"Retaxis\",\"No\",\"SupplierCode|SKUCode|Color|Size|Variants|Model|Attribute1|Attribute2|Attribute3|Attribute4\",\"BMP-S1855506\",\"products\");']")).click();
 				driver.findElement(By.xpath("//button[@class='confirm']")).click();
 				
 		//p7
 				driver.navigate().to("http://vedson.cstechns.com/BMP-S1855506/products/ABC-Product6/Green/BMP-S1855506#.YE8lsJ0zbIU");
 				driver.findElement(By.xpath("//input[@id='QtyAdd']")).click();
 				Thread.sleep(1000);
 				driver.findElement(By.xpath("//input[@id='QtyAdd']")).click();
 				driver.findElement(By.xpath("//a[@onclick='javascript:add_into_cart(\"SKU6\",\"Retaxis\",\"\",\"SupplierCode|SKUCode|Color|Size|Variants|Model|Attribute1|Attribute2|Attribute3|Attribute4\",\"BMP-S1855506\",\"products\");']")).click();
 				driver.findElement(By.xpath("//button[@class='confirm']")).click();
 			
 				//cart
 				Thread.sleep(3000);
 			driver.findElement(By.xpath("/html[1]/body[1]/div[2]/form[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/a[1]/div[1]/span[1]")).click();
 				
 				WebElement Element = driver.findElement(By.xpath("//a[text()='Proceed to Checkout']"));
 				Actions action1 = new Actions(driver);
 				action1.moveToElement(Element).click().perform();
 				
 				Thread.sleep(2000);
 				driver.findElement(By.xpath("//a[text()='PROCEED TO CHECKOUT']")).click();
 				Thread.sleep(2000);
 	
 			// Store Credit
 				driver.findElement(By.xpath("//div[@id='Applystorecra']/a")).click();   
 				driver.findElement(By.id("display_storecredit")).sendKeys("500.00");
 				driver.findElement(By.id("applystorecredit")).click();
 				
 				//cod
 				driver.findElement(By.xpath("//a[@id='cod_mop']")).click();
 				Thread.sleep(3000);
 				WebElement placeOrder=driver.findElement(By.xpath("//a[@id='btnplaceorder']"));
 				Actions action2 = new Actions(driver);
 				action2.moveToElement(placeOrder).click().perform();
 				
 					
 				driver.findElement(By.id("txtcodnumber")).sendKeys("4582");
 				driver.findElement(By.id("btncodsubmit")).click();		
 				Thread.sleep(3000);
 			
 	}}
 				@AfterMethod
 				public void MyOrderPage() throws InterruptedException {
 					driver.navigate().to("https://b2cdemo.retaxis.com/myaccount");
 					Thread.sleep(5000);
 					
 					
 	}
}
