package StepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;

public class Hooks {

//	@BeforeAll
//	public static void before_all() {
//
//		System.out.println("@BeforeAll - Connect to DB");
//
//	}
//	@AfterAll
//	public static void after_all() {
//
//		System.out.println("@AfterAll - Disconnect from  DB");
//
//	}
	@Before("@Staging")
	public void setUp() {

		System.out.println("@Before  Hook - Launching Browser");

	}
//	@Before(order =1)
//	public void setUp1() {
//
//		System.out.println("@Before  Hook - Launching Browser 1");
//
//	}

	@After("@Staging")
	public void tearDown() {

		System.out.println("@After  Hook - Quitting Browser");
	}
	
//
//	@After(order =0)
//	public void tearDown1() {
//
//		System.out.println("@After  Hook - Quitting Browser 1");
//	}
//	
//	@BeforeStep
//	public static void before_step() {
//
//		System.out.println("@BeforeStep - Adding a log ");
//
//	}
//	@AfterStep
//	public static void after_step() {
//
//		System.out.println("@AfterStep - Deleting a log");
//
//	}
}
