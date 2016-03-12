package Framework;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AppTest {

	@Test(dependsOnMethods = {"CloseBrowser"}, alwaysRun=true, timeOut=1000)
	public void AOpeningBrowser(){
	//This opens the Browser
	System.out.println("test");
	}
	
	@Test//(enabled=false)
	public void CloseBrowser(){
		System.out.println("why tho bro");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.chase.com/");
		System.out.println(driver.getTitle());
	/*	driver.manage().window().maximize();
		driver.findElement(By.linkText("ATM & branch")).click();
		driver.findElement(By.xpath(".//*[@class='icon-down-expansion']")).click();
		driver.findElement(By.xpath(".//*[@class='header__section--dropdown__tile--icon icon-checking-medium']")).click();
		*/
	}
	
}
