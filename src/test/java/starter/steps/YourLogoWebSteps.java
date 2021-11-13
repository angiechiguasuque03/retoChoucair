package starter.steps;

import starter.pageobjects.YourLogoWebPageObjects;
import net.thucydides.core.annotations.Step;

public class YourLogoWebSteps {

 YourLogoWebPageObjects YourLogoWebPageObjects;

 	//Consulto Menu
	@Step
	public void SeleccionarOpcion(String opcion) {
		// TODO Auto-generated method stub
		YourLogoWebPageObjects.SeleccionarOpcion(opcion);
	}
	//Comparo menu
	@Step
	public void ComparaRuta(String ruta) {
		// TODO Auto-generated method stub
		YourLogoWebPageObjects.CompararRuta(ruta);
		
	}
}