package ZaakartCalculations;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BuyerOrdrsz extends BaseClass {

	@BeforeMethod
	public void testCase3() throws InterruptedException, IOException {
		
		driver.get("https://www.zaakart.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/form[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/a[1]")).click();
		driver.findElement(By.id("left_txtemail")).sendKeys("sandeepakkic2@gmail.com");
		driver.findElement(By.id("left_txtpwd")).sendKeys("12345");
		driver.findElement(By.id("signin_btnlogin")).click();
		Thread.sleep(1000);
	}
		@Test
		public void testSCCOD() throws IOException, InterruptedException {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 		//p1	buyer Cancellation		
// 				driver.navigate().to("https://www.zaakart.com/search&searchkey=Test/products/TestProduct1/Green/BMP-S1703456#.YFWsZq8zbIU");
// 				driver.findElement(By.xpath("javascript:add_into_cart(\"SKUC1\",\"Retaxis\",\"\",\"SupplierCode|SKUCode|Color|Size|Variant|0|0|0|0|0\",\"BMP-S1703456\");")).click();
// 				Thread.sleep(2000);
 		//P2 Seller Cancellation
 				driver.navigate().to("https://www.zaakart.com/search&searchkey=Test/products/TestProduct3/Black/BMP-S1703456#.YFWssq8zbIU");
 				driver.findElement(By.xpath("//a[@onclick='javascript:add_into_cart(\"SKU3\",\"Retaxis\",\"No\",\"SupplierCode|SKUCode|Color|Size|Variant|0|0|0|0|0\",\"BMP-S1703456\");']")).click();
 				
 		//p3 Seller Cancellation
 				
 				driver.navigate().to("https://www.zaakart.com/search&searchkey=Test/products/TestProduct2/Black/BMP-S1703456#.YFWs768zbIU");
 				driver.findElement(By.xpath("//a[@onclick='javascript:add_into_cart(\"SKUC2\",\"Retaxis\",\"No\",\"SupplierCode|SKUCode|Color|Size|Variant|0|0|0|0|0\",\"BMP-S1703456\");']")).click();
 				Thread.sleep(2000);
// 				
// 				WebElement foot = driver.findElement(By.id("drpdownQty_1"));
// 				Select Qty4 = new Select(foot);
// 				Qty4.selectByValue("2");
// 				
 				
 		//p4 Admin Cancellation
 				driver.navigate().to("https://www.zaakart.com/search&searchkey=Test/products/TestProduct4/Brown/BMP-S1703456#.YFWtLa8zbIU");
 				driver.findElement(By.xpath("//a[@onclick='javascript:add_into_cart(\"SKU4\",\"Retaxis\",\"No\",\"SupplierCode|SKUCode|Color|Size|Variant|0|0|0|0|0\",\"BMP-S1703456\");']")).click();
 				Thread.sleep(2000);
 				
// 				WebElement Br = driver.findElement(By.id("drpdownQty_0"));
// 				Select Qty3 = new Select(Br);
// 				Qty3.selectByValue("2");
 				
 				
 		// Others
 				//p7
 				driver.navigate().to("https://www.zaakart.com/search&searchkey=Test/products/TestProduct6/Pink/BMP-S1703456#.YFWujK8zbIU");
 				driver.findElement(By.xpath("//a[@onclick='javascript:add_into_cart(\"SKU6\",\"Retaxis\",\"No\",\"SupplierCode|SKUCode|Color|Size|Variant|0|0|0|0|0\",\"BMP-S1703456\");']")).click();
 				Thread.sleep(2000);
 				//p5
 				driver.navigate().to("https://www.zaakart.com/search&searchkey=Test/products/TestProduct5/Blue/BMP-S1703456#.YFWtfq8zbIU");
 				driver.findElement(By.xpath("//a[@onclick='javascript:add_into_cart(\"SKU5\",\"Retaxis\",\"No\",\"SupplierCode|SKUCode|Color|Size|Variant|0|0|0|0|0\",\"BMP-S1703456\");']")).click();
 	
 		//p6
 				Thread.sleep(2000);
 				driver.navigate().refresh();
 				driver.findElement(By.xpath("//div[@class='lg_img']/img")).click();
 				driver.findElement(By.xpath("//a[@onclick='javascript:add_into_cart(\"SKU5\",\"Retaxis\",\"No\",\"SupplierCode|SKUCode|Color|Size|Variant|0|0|0|0|0\",\"BMP-S1703456\");']")).click();
 				
 				
 		
 				
 	// Qty Adding others
 				
 				WebElement Saree = driver.findElement(By.id("drpdownQty_0"));
 				Select Qty0 = new Select(Saree);
 				Qty0.selectByValue("3");
 				
 				WebElement Blue = driver.findElement(By.id("drpdownQty_1"));
 				Select Qty1 = new Select(Blue);
 				Qty1.selectByValue("4");
 				
 				WebElement Brown = driver.findElement(By.id("drpdownQty_2"));
 				Select Qty2 = new Select(Brown);
 				Qty2.selectByValue("2");
 				
 				
 				
 				//cart
 				Thread.sleep(3000);
 		//	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/form[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/a[1]/div[1]/span[1]")).click();
 				
 				Thread.sleep(2000);
 				driver.findElement(By.xpath("//a[text()='PROCEED TO CHECKOUT']")).click();
 				Thread.sleep(2000);
 				driver.findElement(By.xpath("//a[text()='CONTINUE']")).click();
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
 			
 	}
 				@AfterMethod
 				public void MyOrderPage() throws InterruptedException {
 					driver.navigate().to("/myaccount");
 					Thread.sleep(5000);
 					
 					
 	}

	
	
	
}
