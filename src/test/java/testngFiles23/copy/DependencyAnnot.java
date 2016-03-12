package testngFiles23.copy;

import org.testng.annotations.Test;

public class DependencyAnnot {

	@Test(dependsOnMethods = {"CloseBrowser"}, alwaysRun=true, timeOut=1000)
	public void AOpeningBrowser(){
	//This opens the Browser
	System.out.println("test");
	}
	
	@Test//(enabled=false)
	public void CloseBrowser(){
		System.out.println("fail");
	}
	
}
