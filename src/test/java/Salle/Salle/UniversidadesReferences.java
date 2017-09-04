package Salle.Salle;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UniversidadesReferences {
	
	@FindBy(className = "titol")
	private WebElement class_titol_alumnos;
	
	public WebElement get_titol_universidades() {
		return class_titol_alumnos;
	}
}
