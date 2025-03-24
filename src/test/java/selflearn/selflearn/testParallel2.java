package selflearn.selflearn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class testParallel2{
	public WebDriver eDriver;	
	@SuppressWarnings("deprecation")
	@Test
	public void test3() throws InterruptedException {
		System.out.println("This is from parallel2 test3 demoqa -Thread"+Thread.currentThread().getId());
		System.out.println("This is from test3 demoqa - "+System.currentTimeMillis());
		eDriver=new EdgeDriver();
		eDriver.get("https://www.demoqa.com");
		eDriver.manage().timeouts().getPageLoadTimeout();
		eDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		eDriver.close();
		}
	@SuppressWarnings("deprecation")
	@Test
	public void test4() throws InterruptedException {
		eDriver=new EdgeDriver();
		System.out.println("This is from parallel2 test4 twitter -Thread"+Thread.currentThread().getId());
		System.out.println("This is from parallel2 test4 twitter -"+System.currentTimeMillis());
		eDriver.get("https://www.twitter.com");
		eDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		eDriver.close();
		
		}
//	@AfterMethod
//	public void close(){
//		edgeDriver.close();
//		
//	}
	@AfterMethod
	public void tearDown() {
		eDriver.quit();
		
	}
}