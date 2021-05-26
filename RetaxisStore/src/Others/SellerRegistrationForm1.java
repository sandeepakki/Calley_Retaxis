package Others;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class SellerRegistrationForm1 {
	public static WebDriver driver;
//public static void takeScreenshot(String fileName) throws IOException {
//		
//	Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
//    ImageIO.write(screenshot.getImage(),"PNG",new File("C:\\Users\\sande\\OneDrive\\Documents\\RetaxisStore\\Screenshots\\ss"+fileName+".png") );
//	
//	}
	
	 
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
		
		driver.findElement(By.id("right_txtname")).sendKeys("Sandeep");
		driver.findElement(By.id("right_txtemailid")).sendKeys("sandeepakkic2@gmail.com");
		driver.findElement(By.id("right_txtpwd")).sendKeys("12345");
		driver.findElement(By.id("right_txtcpwd")).sendKeys("12345");
		driver.findElement(By.id("right_txtcontact")).sendKeys("9502627001");
		driver.findElement(By.id("Agree")).click();	
//		takeScreenshot("Retaxis_Form1_Page");
		driver.findElement(By.xpath("//input[@value='REGISTER']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='confirm']")).click();
		
		
		
}
@AfterClass
public void tearDown() throws InterruptedException {
driver.close();

}	


}
