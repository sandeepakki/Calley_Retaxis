package VedsonStore;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BuyerCancelationPage extends BaseClass {
	
	@BeforeMethod
	public void login() {
		driver.get("http://sellervedson.cstechns.com/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.findElement(By.id("left_txtemail")).sendKeys("vicod87879@nobitcoin.net");
		driver.findElement(By.id("left_txtpwd")).sendKeys("12345");
		driver.findElement(By.id("signin_btnlogin")).click();
	}
	@Test
	public void testBuyerCancellation() throws InterruptedException{	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(3000);
		//Buyer Cancellation Page
		driver.navigate().to("http://sellervedson.cstechns.com/suppliermyaccount/discard");

			List<WebElement> ManageOrder = driver.findElements(By.xpath("//img[@title='MANAGE ORDER']"));
			for(int i=0;i<ManageOrder.size();i++){
				System.out.println(ManageOrder.get(i).getText());
					ManageOrder.get(0).click();
					Thread.sleep(10000);
		}}
					@AfterMethod
					public void Screenshot() throws InterruptedException {
						
						WebElement element =driver.findElement(By.xpath("//a[@href='logout.aspx']"));
						Actions action = new Actions(driver);
						action.moveToElement(element).click().perform();
						driver.get("http://vedson.cstechns.com/login");
						driver.findElement(By.id("left_txtemail")).sendKeys("sandeepkumar@cstech.in");
						driver.findElement(By.id("left_txtpwd")).sendKeys("12345");
						driver.findElement(By.id("signin_btnlogin")).click();
						driver.navigate().to("http://vedson.cstechns.com/myaccount");
						driver.findElement(By.xpath("//a[@href='storecredit']")).click();
						Thread.sleep(5000);
					}

}
