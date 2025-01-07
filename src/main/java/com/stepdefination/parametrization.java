package com.stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class parametrization {

	int a, b, result;

	@Given("I have number {int} and {int}")
	public void acceptNumber(int a, int b) {
		this.a = a;
		this.b = b;

	}

	@When("I add them")
	public void Addition() {
		result = a + b;
	}

	@Then("check is the result is prime")
	
	public void CheckIfAdditionIsPrime() {
		int count = 1;
		for (int i = 1; i <= result / 2; i++) {
			if (result % i == 0) {
				count++;
			}

		}
		if (count > 2) {
			System.out.println("Number " + result + "is not prime");
		} else {
			System.out.println("number " + result + "is prime");
		}
	}

}
