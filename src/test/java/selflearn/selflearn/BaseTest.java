package selflearn.selflearn;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {
	protected static ThreadLocal<WebDriver> driver=new ThreadLocal<WebDriver>();
	public ThreadLocal<Integer> val=new ThreadLocal<Integer>();
	public static String url="http://192.168.0.99:4444/wd/hub";
	public DesiredCapabilities capab= new DesiredCapabilities();
	
	@Parameters("browser")
	@BeforeMethod
	public void setDriver(@Optional String browser) throws MalformedURLException { 
		capab.setPlatform(Platform.WIN11);
		if(browser.equals("chrome")) {
			
//			options=new ChromeOptions();
			capab.setBrowserName("chrome");
		}
		if(browser.equals("edge")) {
//			options=new EdgeOptions();
			capab.setBrowserName("MicrosoftEdge");
		}
		driver.set(new RemoteWebDriver(new URL(url), capab));
		driver.get().get("https://www.facebook.com");
		driver.get().manage().window().maximize();
		
	}
	public WebDriver getDriver() {
		return driver.get();
	}
	@AfterMethod
	public void closeBrowser() {
		driver.get().quit();
		driver.remove();
	}
	
	
//	@Test
//	@Parameters("browser")
//	public void openGoogle(String browser)
//	{
//		getDriver().findElement(By.xpath("//input[@name='email']"));
//		System.out.println("Successfully validated Email from the browser: "+ browser);
//	}
	
	
	
	
	
	
	
	
	
	
}
