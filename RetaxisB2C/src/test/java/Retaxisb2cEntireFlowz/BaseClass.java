package Retaxisb2cEntireFlowz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	public static WebDriver driver;
//	public static void takeScreenshot(String fileName) throws IOException {	
//		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
//	    ImageIO.write(screenshot.getImage(),"PNG",new File("C:\\Users\\sande\\OneDrive\\Documents\\RetaxisStore\\Screenshots\\ss"+fileName+".png") );
//		   
//		}
	@BeforeTest
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
	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
