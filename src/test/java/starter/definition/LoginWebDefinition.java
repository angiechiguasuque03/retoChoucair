package starter.definition;


import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;
import starter.steps.LoginWebSteps;

public class LoginWebDefinition {

	@Steps
	LoginWebSteps LoginWebSteps;
	
	@Given("^Ingreso al portal YourLogo$")
	public void ingresoAlPortalYourLogo() {
	    LoginWebSteps.Browser();
	}

}