package starter.pageobjects;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class YourLogoWebPageObjects extends PageObject {
	SoftAssertions softAssert = new SoftAssertions();
	String url = "";
	String current = "";
	String title = "";
	String parentWindowHandler = "";
	String aceptar = "ACEPTAR";
	String mensaje = ""; 
	String esperado = "";
	
	//Consulto menu
	public void SeleccionarOpcion(String opcion) {

		find(By.linkText(opcion)).click();

	}


	//Comparo menu
	public void CompararRuta(String ruta) {
		// TODO Auto-generated method stub
		WebDriver driver = getDriver();
		switch(ruta) {
		case "WOMEN":
			url = "http://automationpractice.com/index.php?id_category=3&controller=category";
		    current = driver.getCurrentUrl();
			assertThat(current).as(" comparar URL").isEqualTo(url);

			break;

		case "DRESSES":
			url = "http://automationpractice.com/index.php?id_category=8&controller=category";
		    current = driver.getCurrentUrl();
			assertThat(current).as("Comparación URL").isEqualTo(url);
			
			break;

		case "T-SHIRTS":
			url = "http://automationpractice.com/index.php?id_category=5&controller=category";
		    current = driver.getCurrentUrl();
			assertThat(current).as("Comparación URL").isEqualTo(url);
			
			break;
			case "CASUAL DRESSES":
				url = "http://automationpractice.com/index.php?id_category=9&controller=category";
				current = driver.getCurrentUrl();
				assertThat(current).as("Comparación URL").isEqualTo(url);

				break;
			case "EVENING DRESSES":
				url = "http://automationpractice.com/index.php?id_category=10&controller=category";
				current = driver.getCurrentUrl();
				assertThat(current).as("Comparación URL").isEqualTo(url);

				break;

			case "SUMMER DRESSES":
				url = "http://automationpractice.com/index.php?id_category=11&controller=category";
				current = driver.getCurrentUrl();
				assertThat(current).as("Comparación URL").isEqualTo(url);

				break;
			default:
				break;
		}
		Serenity.recordReportData().withTitle("RUTAS VALIDADAS").andContents("URL INICIAL --> " + url
				+"\n URL NAVEGADOR --> " + current
				);
		}
}