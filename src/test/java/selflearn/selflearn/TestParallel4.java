package selflearn.selflearn;

import org.openqa.selenium.By;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParallel4 extends BaseTest {
	
	@Test
	@Parameters("browser")
	public void openGoogle(@Optional String browser)
	{
		getDriver().findElement(By.xpath("//input[@name='email']"));
		System.out.println("Successfully validated Email from the browser: "+ browser);
	}

}
