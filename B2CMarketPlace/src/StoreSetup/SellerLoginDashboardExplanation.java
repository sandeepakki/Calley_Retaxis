package StoreSetup;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class SellerLoginDashboardExplanation {
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
	@Test() 
	public void testRegistrationF2() throws InterruptedException, IOException {
		
		driver.get("http://sellervedson.cstechns.com/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.id("left_txtemail")).sendKeys("lemine8927@geekale.com");
		driver.findElement(By.id("left_txtpwd")).sendKeys("12345");
		driver.findElement(By.id("signin_btnlogin")).click();
		Thread.sleep(3000);
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
	       ImageIO.write(screenshot.getImage(),"PNG",new File("C:\\Users\\sande\\OneDrive\\Documents\\RetaxisStore\\Screenshots\\SS"+"dashboard"+".png") );

	}
	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
