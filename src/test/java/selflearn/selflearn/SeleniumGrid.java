package selflearn.selflearn;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGrid {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws MalformedURLException {
		String huburl="http://192.168.29.210:4444/wd/hub";
		DesiredCapabilities cap=new DesiredCapabilities();
//		cap.setPlatform(Platform.WIN11);
		cap.setBrowserName("chrome");
		WebDriver driver=new RemoteWebDriver(new URL(huburl), cap);
//		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		System.out.println("Title of the driver is: "+driver.getTitle());
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		driver.quit();
	}

}
