package oopsconcept;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PS1 {
	
	public void doTHis() {
		System.out.println("I am here");
	}
	
	@AfterMethod
	public void after() {
		System.out.println("I am last");
	}
	
	@BeforeMethod
	public void before() {
		System.out.println("I am first");
	}

}
