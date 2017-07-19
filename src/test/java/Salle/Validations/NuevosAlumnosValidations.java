package Salle.Validations;

import org.openqa.selenium.WebDriver;

import Salle.Salle.NuevosAlumnosReferences;

public class NuevosAlumnosValidations {
	
	public void validationNuevoTitle(WebDriver driver) throws Exception{
		try{
			NuevosAlumnosReferences naR = new NuevosAlumnosReferences(driver);
			naR.EsperaNuevoTitle(driver);
			naR.NuevoTitle(driver);
		}catch(Exception e){
			
			System.out.println(e);
		}
	}
}
