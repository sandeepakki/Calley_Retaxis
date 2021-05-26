package StoreSetup;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class RulesForSimiliar {

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
		
		driver.get("https://www.sportalook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://www.sportalook.com/tshirtsandteesmen/products/AshGreyTShirt/Grey/BMP-S1269714#.YKX3IqgzbIU");
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
	       ImageIO.write(screenshot.getImage(),"PNG",new File("C:\\Users\\sande\\OneDrive\\Documents\\RetaxisStore\\Screenshots\\SS"+"dashboard"+".png") );

	}
	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
