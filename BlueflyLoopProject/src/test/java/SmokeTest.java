import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class SmokeTest extends BaseTest
{
	/*@Test
	public void test1() throws Throwable
	
	{
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.findElement(By.xpath("//a[text()='Women']")).click();
		List<WebElement> ele=dr.findElements(By.xpath(".//*[@id='departmentCrossSellContainer']/div[2]/div[1]/a/img"));
		int s=ele.size();
		System.out.println(s);
		for(int i=1;i<=s;i++)
		{
		
			dr.findElement(By.xpath("//div[@id='departmentRightNaviContainer']/a/img["+i+"]")).click();
			dr.navigate().back();
			Thread.sleep(2000);
		}
	}*/
	@Test
	public void findElementsPresent() throws Exception
	{dr.manage().window().maximize();
	dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	dr.findElement(By.xpath("//a[text()='Women']")).click();
		 List<WebElement> elements =dr.findElements(By.xpath(".//*[@id='departmentCrossSellContainer']/div"));
		 int a = elements.size();
		// System.out.println("size is:"+ a);
		 for (int i = 2; i<=a; i++)
		 {
			 dr.findElement(By.xpath(".//*[@id='departmentCrossSellContainer']/div["+i+"]/div[1]/a/img")).click();
			 Thread.sleep(3000);
			 dr.navigate().back();
			 Thread.sleep(3000);
		 }
	}
}
	/*@Test
	public void findElementsPresent() throws Exception
	{
	dr.findElement(By.xpath("//li[@id='main-nav-new']/a")).click();
	List<WebElement> elements =dr.findElements(By.xpath("//div[@id='productsContainer']//a"));
	int a = elements.size();
	// System.out.println("size is:"+ a);
	for (int i = 1; i<=a; i++)
	{
	dr.findElement(By.xpath("div[@id='productsContainer']//a["+ i +"]")).click();
	dr.navigate().back();
	Thread.sleep(5000);
	}
	
	//div[@id='departmentRightNaviContainer']//a
	}*/

