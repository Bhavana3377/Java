package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class HooksConcept {
	@Before
	public void method1(){
		System.out.println("Before Scenario");
	}
	@BeforeStep
	public void methd2() {
		System.out.println("Before each step of Scenario");
	}
	@After
	public void method3() {
		System.out.println("After Scenario");
	}
	@AfterStep
	public void method4() {
		System.out.println("After each step of Scenario");
	}

}
