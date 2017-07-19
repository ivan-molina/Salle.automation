package Salle.Validations;

import org.openqa.selenium.WebDriver;

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
}
