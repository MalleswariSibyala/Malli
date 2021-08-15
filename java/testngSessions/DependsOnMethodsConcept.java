package testngSessions;

import org.testng.annotations.Test;

public class DependsOnMethodsConcept {
	@Test
	public void loginTest() {
		System.out.println("login test");
		int i=9/0;
	}
	@Test(dependsOnMethods="logintest")
	public void homeTest() {
		System.out.println("home test");
	}
	
	@Test(dependsOnMethods="logintest")
	public void searchTest() {
		System.out.println("search test");
	}
	
	
	
	

}
