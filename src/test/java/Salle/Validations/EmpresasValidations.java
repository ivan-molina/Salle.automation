package Salle.Validations;

import org.openqa.selenium.WebDriver;

import Salle.Reporters.Esenciales;
import Salle.Salle.AlumnosReferences;
import Salle.Salle.EmpresasReferences;

public class EmpresasValidations {
	public void validationEmpresasTitle(WebDriver driver) throws Exception{
		try{
			AlumnosReferences na = new AlumnosReferences(driver);
			na.EsperaEstudyTitle(driver);
			na.EstudyTitle(driver);
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
