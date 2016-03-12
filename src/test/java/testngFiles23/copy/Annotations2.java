package testngFiles23.copy;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotations2 {

	@BeforeSuite
	public void Opening(){
		System.out.println("WELCOME");
	}
	
	@AfterSuite
	public void Closing(){
		System.out.println("BYE");
	}
	
	@Test//(groups={"Priority2"})
	public void Second(){
		System.out.println("fail");
		}
	
}
