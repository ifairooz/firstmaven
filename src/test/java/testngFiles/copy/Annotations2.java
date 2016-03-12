package testngFiles.copy;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Annotations2 {

	@BeforeSuite
	public void Opening(){
		System.out.println("WELCOME");
	}
	
	@AfterSuite
	public void Closing(){
		System.out.println("BYE");
	}
}
