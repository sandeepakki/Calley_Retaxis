package Retaxisb2cEntireFlowz;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Form1 {
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
	public void testSellerForm1Registration() throws InterruptedException, IOException {

		 
		driver.get("https://b2cdemoseller.retaxis.com/register");
	//	takeScreenshot("Retaxis_Reg_Page");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("right_txtname")).sendKeys("Sandeep4");
		driver.findElement(By.id("right_txtemailid")).sendKeys("firipe5549@ichkoch.com");
		driver.findElement(By.id("right_txtpwd")).sendKeys("12345");
		driver.findElement(By.id("right_txtcpwd")).sendKeys("12345");
		driver.findElement(By.id("right_txtcontact")).sendKeys("9502627001");
		driver.findElement(By.id("Agree")).click();	
//		takeScreenshot("Retaxis_Form1_Page");
		driver.findElement(By.xpath("//input[@value='REGISTER']")).click();
		Thread.sleep(5000);
		
		
		
}
@AfterClass
public void tearDown() throws InterruptedException {
driver.close();

}		
}
