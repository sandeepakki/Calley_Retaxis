package SellerCreation_Products_Ordering_Fullfill_Return;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AddingDiscounts extends BaseClass {
	
	
	@BeforeClass
	public void login() {
		driver.get("https://b2cdemositeadmin.retaxis.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.findElement(By.name("txtLogin")).sendKeys("sportalook@cstech.in");
		driver.findElement(By.name("txtPassword")).sendKeys("45824582");
		driver.findElement(By.name("btnSubmit")).click();

	}
	@Test
	public void testAddingCoupons() throws IOException, InterruptedException {
		WebElement element =	driver.findElement(By.id("liSales_parent"));
		Actions action= new Actions(driver);
		action.moveToElement(element).build().perform();
		takeScreenshot("Coupons");
		driver.findElement(By.linkText("Coupon Codes")).click();
		driver.findElement(By.linkText("Create New")).click();
		
		driver.findElement(By.id("txtcode")).sendKeys("Discs10");
		driver.findElement(By.id("txtdiscountcapping")).sendKeys("300");
		driver.findElement(By.id("txtdiscount")).sendKeys("10");
		driver.findElement(By.id("txtUpperLimit")).sendKeys("1500");
		driver.findElement(By.id("txtvaliditystartdate")).click();
		driver.findElement(By.linkText("1")).click();
		driver.findElement(By.id("txtvalidityenddate")).click();
		driver.findElement(By.linkText("28")).click();
		driver.findElement(By.id("txtdesc")).sendKeys("10 percent discount on cart amount of 1500/-");
		driver.findElement(By.id("txtcouponuses")).clear();
		driver.findElement(By.id("txtcouponuses")).sendKeys("10");
		driver.findElement(By.id("txtuseruses")).clear();
		driver.findElement(By.id("txtuseruses")).sendKeys("2");
		driver.findElement(By.linkText("Submit")).click();
		takeScreenshot("Discount10");
//		Thread.sleep(2000);
//		driver.findElement(By.id("btn_next")).click();
//		driver.findElement(By.id("chk24")).click();
//		takeScreenshot("specific1");
//		driver.findElement(By.id("chk92")).click();
//		takeScreenshot("specific2");
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("Publish")).click();
//Flat 500 off coupon			
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create New")).click();	
		driver.findElement(By.id("txtcode")).sendKeys("Flat500");
		driver.findElement(By.xpath("//input[@value='Flat']")).click();
		driver.findElement(By.id("txtdiscount")).sendKeys("500");
		driver.findElement(By.id("txtUpperLimit")).clear();
		driver.findElement(By.id("txtUpperLimit")).sendKeys("2000");
		driver.findElement(By.id("txtvaliditystartdate")).click();
		driver.findElement(By.linkText("1")).click();
		driver.findElement(By.id("txtvalidityenddate")).click();
		driver.findElement(By.linkText("28")).click();
		driver.findElement(By.id("txtdesc")).sendKeys("Flat 500 off on order amount of 2000/-");
		driver.findElement(By.id("txtcouponuses")).clear();
		driver.findElement(By.id("txtcouponuses")).sendKeys("10");
		driver.findElement(By.id("txtuseruses")).clear();
		driver.findElement(By.id("txtuseruses")).sendKeys("2");	
		driver.findElement(By.linkText("Submit")).click();
		takeScreenshot("Flat500");
		Thread.sleep(2000);
//		driver.findElement(By.id("btn_next")).click(); //specific
//		driver.findElement(By.id("chk24")).click();
//		takeScreenshot("specific3");
//		driver.findElement(By.id("chk92")).click();
//		takeScreenshot("specific4");
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("Publish")).click();
		
		Thread.sleep(5000);

	}
	
	@AfterClass
	public void PromotionDisc() throws IOException, InterruptedException {
		WebElement element =	driver.findElement(By.id("liSales_parent"));
		Actions action= new Actions(driver);
		action.moveToElement(element).build().perform();
		driver.findElement(By.linkText("Promotions")).click();
		driver.findElement(By.id("AccjA")).click();
		driver.findElement(By.id("chk_slab")).click();
		
		driver.findElement(By.id("txt_datefrom")).click();
		//driver.findElement(By.xpath("//"))
		driver.findElement(By.linkText("1")).click();
		
		driver.findElement(By.id("txt_dateto")).click();
		driver.findElement(By.linkText("28")).click();
		
		driver.findElement(By.id("txt_amount")).sendKeys("2000");
		driver.findElement(By.xpath("//input[@value='Flat']")).click();
		
		driver.findElement(By.id("txt_discount")).sendKeys("300");
		takeScreenshot("Promo300");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Submit")).click();
		try {
		driver.findElement(By.linkText("Finish")).click();
		Thread.sleep(2000);
		}
		catch(Exception e) {
			System.out.println(e.getStackTrace());
		}

	}
	

}
