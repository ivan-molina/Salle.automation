package Salle.Validations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Salle.Reporters.Esenciales;
import Salle.Salle.AlumnosReferences;
import Salle.Salle.EmpresasReferences;

public class EmpresasValidations {
	
	WebDriver driver;
	EmpresasReferences eR;
	
	public void EstudyTitle(WebDriver driver) throws Exception{
		try{
			eR = new EmpresasReferences(driver);
			driver.findElement((By) eR.getEmpresas_imagen());
			System.out.println("Encuentra Nuevo Title: TEST OK");
		}catch(Exception e){
			System.out.println(e);
			System.out.println("Encuentra Nuevo Title: TEST KO");
		}		
	}
}
