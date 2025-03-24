package selflearn.selflearn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class testParallel{
	public static WebDriver driver;
	@SuppressWarnings("deprecation")
	@Test
	public void test1() throws InterruptedException {
		driver=new ChromeDriver();
		System.out.println("This is from parallel-1 google test1-Thread"+Thread.currentThread().getId());
		System.out.println("This is from parallel-1 google test1-"+System.currentTimeMillis());
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		driver.close();
	}
	@SuppressWarnings("deprecation")
	@Test
	public void test2() throws InterruptedException {
		driver=new ChromeDriver();
		System.out.println("This is from parallel-1 facebook test2-Thread"+Thread.currentThread().getId());
		System.out.println("This is from parallel-1 facebook test2-"+System.currentTimeMillis());
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		driver.close();
	}
	@AfterMethod
	public void close() {
		driver.quit();
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();		
	}
}