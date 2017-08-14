package Salle.Validations;

import org.openqa.selenium.WebDriver;

import Salle.Reporters.Esenciales;
import Salle.Salle.AlumniReferences;

public class AlumniValidations {
	
	public void ValidaUrl (WebDriver driver) throws Exception{
		Esenciales esen = new Esenciales();
		AlumniReferences ali = new AlumniReferences(driver);
		esen.ValidaUrl(driver, ali.getNuevoAlumnosUrl());
	}
	
}


