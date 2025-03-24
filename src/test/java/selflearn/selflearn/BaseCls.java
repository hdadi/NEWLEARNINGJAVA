package selflearn.selflearn;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseCls {
	public WebDriver driver;
	DesiredCapabilities cap=new DesiredCapabilities();
	String huburl="http://192.168.29.210:4444/wd/hub";
	
	@BeforeMethod
	@Parameters({"browser"})
	public void browserInit(@Optional String browser) throws MalformedURLException {
//		if(driver!=null) driver.quit();
		if(browser.equals("chrome"))cap.setBrowserName("chrome");
		else cap.setBrowserName("firefox");
		driver=new RemoteWebDriver(new URL(huburl), cap);
	}
	@SuppressWarnings("deprecation")
	@Test
	@Parameters("browser")
	public void test1(String browser) {
		driver.get("https://www.facebook.com");
		System.out.println("Title of the driver from test1 from the browser: "+browser+" is \""+driver.getTitle()+"\"");
		driver.manage().timeouts().implicitlyWait(200000, TimeUnit.SECONDS);
	}
	@SuppressWarnings("deprecation")
	@Test
	@Parameters("browser")
	public void test2(String browser) {
		driver.get("https://www.selenium.dev/documentation/grid/getting_started/");
		System.out.println("Title of the driver from test2 from the browser: "+browser+" is \""+driver.getTitle()+"\"");
		driver.manage().timeouts().implicitlyWait(200000, TimeUnit.SECONDS);
	}
	@SuppressWarnings("deprecation")
	@Test
	@Parameters("browser")
	public void test3(String browser) {
		driver.get("https://www.selenium.dev/");
		System.out.println("Title of the driver from test3 from the browser: "+browser+" is \""+driver.getTitle()+"\"");
		driver.manage().timeouts().implicitlyWait(200000, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
//	@AfterClass
//	public void tearDownn() {
//		if(driver!=null)driver.quit();
//	}

}
