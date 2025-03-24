package selflearn.selflearn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestParallel3 {
	public WebDriver eDriver;
	public int value=10;
	@Test
	public void chrome1() {		
		eDriver=new ChromeDriver();
		eDriver.get("http://www.google.com");
		System.out.println("Value is :"+(value*3));
		eDriver.quit();
	}
	@SuppressWarnings("deprecation")
	@Test
	public void edge1() throws InterruptedException {
		eDriver=new EdgeDriver();
		eDriver.get("https://www.facebook.com");
		eDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("This is from parallel2 test3 demoqa -Thread"+Thread.currentThread().getId());
		System.out.println("This is from test3 demoqa - "+System.currentTimeMillis());
		System.out.println("Value is :"+(value*6));
		eDriver.quit();
		}
	@SuppressWarnings("deprecation")
	@Test
	public void edge2() throws InterruptedException {
		eDriver=new EdgeDriver();
		eDriver.get("https://www.twitter.com");
		eDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("This is from parallel2 test4 twitter -Thread"+Thread.currentThread().getId());
		System.out.println("This is from parallel2 test4 twitter -"+System.currentTimeMillis());
		System.out.println("Value is :"+(value*9));
		eDriver.quit();
		}
	@AfterMethod
	public void close() {
		if(eDriver!=null) {
			eDriver.quit();	
			System.out.println("quit from close successful");
		}
				
	}

}
