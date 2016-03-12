package testngFiles23.copy;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	
	@BeforeMethod
	public void Prev(){
		//This opens the Browser
		System.out.println("start again");
		}
	
	@BeforeTest 
	public void Second(){
		//This opens the Browser
		System.out.println("start test");
		}
	
	@AfterTest 
	public void DeleteCookies(){
		System.out.println("end test: delete all cookies");
		}

	@AfterMethod
	public void SecondDeleteCookies(){
		System.out.println("end test again");
		}
	@Test
	public void AOpeningBrowser(){
	//This opens the Browser
	System.out.println("test");
	}
	
	@Test
	public void CloseBrowser(){
		System.out.println("fail");
	}
}
