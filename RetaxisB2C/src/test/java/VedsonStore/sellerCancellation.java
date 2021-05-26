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

public class sellerCancellation extends BaseClass{
	
	@BeforeMethod
	public void login() {
		driver.get("http://sellervedson.cstechns.com/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.findElement(By.id("left_txtemail")).sendKeys("sandeepakkic2@gmail.com");
		driver.findElement(By.id("left_txtpwd")).sendKeys("12345");
		driver.findElement(By.id("signin_btnlogin")).click();
	}

	@Test
	public void testSellerCancellation() throws InterruptedException{	
		//Cancellation of the buyer Pending order
		 Thread.sleep(5000);
		driver.navigate().to("http://sellervedson.cstechns.com/suppliermyaccount/pending");
try {
		List<WebElement> ManageOrder = driver.findElements(By.xpath("//img[@title='MANAGE ORDER']"));
		for(int i=0;i<ManageOrder.size();i++){
			System.out.println(ManageOrder.get(i).getText());
		}
				ManageOrder.get(0).click();
				WebElement CancelOrder = driver.findElement(By.id("orderstatustype"));
				Select option= new Select(CancelOrder);
				option.selectByVisibleText("Seller Cancellation");
				driver.findElement(By.name("txt_rejection_reason")).sendKeys("Cancellaton");
			
				driver.findElement(By.xpath("//a[@id='btn_reject']")).click();
				driver.findElement(By.xpath("//button[@class='confirm']")).click();
}
				catch(StaleElementReferenceException e){
					System.out.println(e.getStackTrace());
				} 
		}
	@AfterMethod
	public void StoreCreditPage() throws InterruptedException {
		driver.navigate().to("http://sellervedson.cstechns.com/ordersummary");
		Thread.sleep(20000);
		WebElement element =driver.findElement(By.xpath("//a[@href='logout.aspx']"));
		Actions action = new Actions(driver);
		action.moveToElement(element).click().perform();
		driver.get("http://vedson.cstechns.com/login");
		driver.findElement(By.id("left_txtemail")).sendKeys("sandeepkumar@cstech.in");
		driver.findElement(By.id("left_txtpwd")).sendKeys("12345");
		driver.findElement(By.id("signin_btnlogin")).click();
		Thread.sleep(5000);
		driver.navigate().to("http://vedson.cstechns.com/myaccount");
		driver.findElement(By.xpath("//a[@href='storecredit']")).click();
		Thread.sleep(5000);
	}
	
}

	

