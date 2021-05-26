package SellerCreation_Products_Ordering_Fullfill_Return;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BuyerRegistration_OrderPlacing extends BaseClass{

	@BeforeClass
	public void register() throws InterruptedException {
		
		driver.get("https://b2cdemo.retaxis.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//div[text()='Sign In']")).click();
		driver.findElement(By.linkText("Create Account")).click();
		Thread.sleep(2000);
	}
	@Test
	public void testFormFilling() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("right_txtname")).sendKeys("Test");
		driver.findElement(By.id("right_txtemailid")).sendKeys("wocedot797@bulkbye.com");
		driver.findElement(By.id("right_txtpwd")).sendKeys("12345");
		driver.findElement(By.id("right_txtcpwd")).sendKeys("12345");
		driver.findElement(By.id("right_txtcontact")).sendKeys("9745463210");
		Thread.sleep(5000);
		//iver.findElement(By.xpath("//input[@id='Agree']")).click();
		driver.findElement(By.id("reg_btnlogin")).click();
		driver.findElement(By.xpath("//button[@class='confirm']")).click();
		driver.findElement(By.xpath("//div[text()='Sign In']")).click();
		driver.findElement(By.id("left_txtemail")).sendKeys("wocedot797@bulkbye.com");
		driver.findElement(By.id("left_txtpwd")).sendKeys("12345");
		driver.findElement(By.id("signin_btnlogin")).click();
		driver.findElement(By.linkText("Shipping Addresses")).click();
		driver.findElement(By.id("txtshippingfname")).sendKeys("Test");
		driver.findElement(By.id("txtshippinglname")).sendKeys("Test");
		driver.findElement(By.id("txtshippingaddress")).sendKeys("37-93/93, NH65, Shirdi Nagar, Hayathnagar_Khalsa,");
		driver.findElement(By.id("txtshippingpin")).sendKeys("501505");
		driver.findElement(By.id("txtshippingmobile")).sendKeys("9502627001");
		driver.findElement(By.id("txtlandmark")).sendKeys("HYD");
		driver.findElement(By.id("home-mobile")).click();
		driver.findElement(By.linkText("SAVE AND CONTINUE")).click();
		
	}
	
	@AfterClass
	public void Ordering() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("textfield")).clear();
		driver.findElement(By.id("textfield")).sendKeys("MenJacket3"+Keys.ENTER);
		driver.findElement(By.xpath("//img[@id='imgall_0']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Add To Cart')]")).click();
		driver.findElement(By.xpath("//button[@class='confirm']")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/form[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/a[1]/div[1]/span[1]")).click();
		driver.findElement(By.linkText("Proceed to Checkout")).click();
		driver.findElement(By.linkText("PROCEED TO CHECKOUT")).click();
		driver.findElement(By.xpath("//div[@id='Applycon']/a")).click();
		driver.findElement(By.xpath("//a[@id='cod_mop']")).click();
		driver.findElement(By.xpath("//a[@id='btnplaceorder']")).click();
	}
	
}
