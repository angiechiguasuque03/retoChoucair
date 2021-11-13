package starter.definition;

import io.cucumber.java.en.When;
import starter.steps.YourLogoWebSteps;
import net.thucydides.core.annotations.Steps;

public class YourLogoWebDefinition {

	@Steps
	YourLogoWebSteps YourLogoWebSteps;

	//Consulto menu
	@When("^Consulto opcion ([^\"]*)$")
	public void consultoInformacionCorrespondiente(String opcion) {

		YourLogoWebSteps.SeleccionarOpcion(opcion);
	}
	// Comparo menu
	@When("^Comparar ruta: ([^\"]*)$")
	public void compararRutaEmpleos(String ruta) {

		YourLogoWebSteps.ComparaRuta(ruta);
	}
}