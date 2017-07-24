package Salle.Validations;

import org.openqa.selenium.WebDriver;

import Salle.Reporters.Esenciales;
import Salle.Salle.AlumnosReferences;

public class AlumnosValidations {
	public void validationNuevoTitle(WebDriver driver) throws Exception{
		try{
			AlumnosReferences na = new AlumnosReferences(driver);
			na.EsperaEstudyTitle(driver);
			na.EstudyTitle(driver);
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public void ValidaUrl (WebDriver driver) throws Exception{
		Esenciales esen = new Esenciales();
		AlumnosReferences aR = new AlumnosReferences(driver);
		esen.ValidaUrl(driver, aR.getNuevoAlumnosUrl());
	}
}
