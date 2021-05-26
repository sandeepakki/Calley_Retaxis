package Retaxisb2cEntireFlowz;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BuyerRegistration extends BaseClass {
	
	@BeforeClass
	public void register() throws InterruptedException {
		
		driver.get("https://b2cdemo.retaxis.com/register");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
	}
	@Test
	public void testFormFilling() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("right_txtname")).sendKeys("Test");
		driver.findElement(By.id("right_txtemailid")).sendKeys("sandeepakki03@gmail.com");
		driver.findElement(By.id("right_txtpwd")).sendKeys("12345");
		driver.findElement(By.id("right_txtcpwd")).sendKeys("12345");
		driver.findElement(By.id("right_txtcontact")).sendKeys("9745463210");
		try {
			WebElement checkbox =driver.findElement(By.xpath("//*[@id='Agree']"));
			Actions action = new Actions(driver);
			action.moveToElement(checkbox).click().perform();
		}catch(Exception e) {
			System.out.println(e.getStackTrace());
		}
		
		WebElement reg = driver.findElement(By.className("btn-full"));
		Actions action1 = new Actions(driver);
		action1.moveToElement(reg).click().perform();
		driver.findElement(By.xpath("//button[@class='confirm']")).click();
		driver.findElement(By.xpath("//div[text()='Sign In']")).click();
		driver.findElement(By.id("left_txtemail")).sendKeys("sandeepakki03@gmail.com");
		driver.findElement(By.id("left_txtpwd")).sendKeys("12345");
		driver.findElement(By.id("signin_btnlogin")).click();
		
		//Address
		driver.navigate().to("https://b2cdemo.retaxis.com/manage-addresses");
		driver.findElement(By.id("txtshippingfname")).sendKeys("Test");
		driver.findElement(By.id("txtshippinglname")).sendKeys("Test");
		driver.findElement(By.id("txtshippingaddress")).sendKeys("37-93/93 NH65 Shirdi Nagar -Hayathnagar_Khalsa");
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
		driver.findElement(By.id("textfield")).sendKeys("Puma"+Keys.ENTER);
	
		driver.findElement(By.linkText("Proceed to Checkout")).click();
		driver.findElement(By.linkText("PROCEED TO CHECKOUT")).click();
		driver.findElement(By.xpath("//div[@id='Applycon']/a")).click();
		driver.findElement(By.xpath("//a[@id='cod_mop']")).click();
		driver.findElement(By.xpath("//a[@id='btnplaceorder']")).click();
	}

}
