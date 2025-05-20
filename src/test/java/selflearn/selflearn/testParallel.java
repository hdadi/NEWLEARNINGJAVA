package selflearn.selflearn;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class testParallel{
	public static WebDriver driver;
	String name="";
	@SuppressWarnings("deprecation")
	@Test
	public void test1() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().setSize(new Dimension(1024,768)); // to set to specific size
		driver.get("https://www.google.com");
		Set<Cookie> cookies=driver.manage().getCookies();
		for(Cookie c: cookies) {
			System.out.println("Cookie name: "+c.getName());
			System.out.println("Cookie value: "+c.getValue());
		}		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		Wait<WebDriver> fluentWait=new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
		WebElement ele=wait.until(new Function<WebDriver, WebElement>(){
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("test"));
			}
			
			
		});
		
	}
//	@SuppressWarnings("deprecation")
//	@Test
//	public void test2() throws InterruptedException {
//		driver=new ChromeDriver();
//		System.out.println("This is from parallel-1 facebook test2-Thread"+Thread.currentThread().getId());
//		System.out.println("This is from parallel-1 facebook test2-"+System.currentTimeMillis());
//		driver.get("https://www.facebook.com");
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	}
//	@AfterMethod
//	public void close() {
//		driver.quit();
//		
//	}
	@AfterMethod
	public void tearDown() {
		driver.quit();		
	}
}
