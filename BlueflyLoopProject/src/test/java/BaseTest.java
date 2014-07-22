import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseTest 
{
	FirefoxDriver dr=new FirefoxDriver();
	@Before
	public void start()
	{
		dr.get("http://www.bluefly.com");
	}
	@After
	public void end() throws Throwable
	{
		Thread.sleep(3000);
		dr.quit();
	}

}
