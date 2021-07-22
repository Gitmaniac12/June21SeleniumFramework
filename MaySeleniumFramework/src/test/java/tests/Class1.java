package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class1 {
	
	@Test(groups= {"sanity"})
	public void test1() {
		System.out.println("This is test1");
	}
	
	@Test(groups= {"regression"})
	public void test2() {
		System.out.println("This is test2");
	}
	@BeforeClass
	public void beforeclass() {
	System.out.println("This will be executed in class1");
}
	@BeforeMethod
	public void beforemethod() {
	System.out.println("*****before every test*******");
	}

}
