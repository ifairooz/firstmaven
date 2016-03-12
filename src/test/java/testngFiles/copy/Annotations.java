package testngFiles.copy;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
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
	
	@Test(dataProvider = "getData")
	public void AOpeningBrowser(String a, String b, String c){
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	}
	
	@Test//(groups={"Priority1"})
	@Parameters({"userid"})
	public void CloseBrowser(String x){
		System.out.println(x);
	}
	
	@DataProvider
	public Object[][] getData(){
		Object[][] data = new Object[3][3];
		data[0][0] = "1";
		data[0][1] = "2";		
		data[0][2] = "3";		
		
		data[1][0] = "11";
		data[1][1] = "22";
		data[1][2] = "33";
		
		data[2][0] = "111";
		data[2][1] = "222";
		data[2][2] = "333";
		
		return data;
	}
	
	
	
}
