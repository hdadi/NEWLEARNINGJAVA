package selflearn.selflearn;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class FactoryAnnotationExample {
	@Factory
	public Object[] factoryMethod() {
		return new Object[] {new testExample("firefox")};
	}
}
class testExample extends FactoryAnnotationExample{	
    public static WebDriver driver;
	String browser;
	testExample(String browse) {
		this.browser=browse;
	}
    @Test
	public void test1() throws InterruptedException {
		if(browser.contains("chrome")) driver=new ChromeDriver();
		else driver=new FirefoxDriver();
		driver.manage().window().maximize();
//		driver.manage().window().setSize(new Dimension(1024,768)); // to set to specific size
		driver.get("https://www.google.com");
		Set<Cookie> cookies=driver.manage().getCookies();
		for(Cookie c: cookies) {
			System.out.println("Cookie name: "+c.getName());
			System.out.println("Cookie value: "+c.getValue());
		}		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}	
}
