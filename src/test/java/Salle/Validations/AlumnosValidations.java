package Salle.Validations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Salle.Reporters.Esenciales;
import Salle.Salle.AlumnosReferences;

public class AlumnosValidations {
	
	private WebDriver driver;
	private AlumnosReferences aR;
	
	public void validationNuevoTitle(WebDriver driver) throws Exception{
		try{
			AlumnosReferences na = new AlumnosReferences(driver);
			EsperaEstudyTitle(driver);
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public void ValidaUrl (WebDriver driver) throws Exception{
		Esenciales esen = new Esenciales();
		AlumnosReferences aR = new AlumnosReferences(driver);
		esen.ValidaUrl(driver, aR.getNuevoAlumnosUrl());
	}
	
	public void EsperaEstudyTitle(WebDriver driver){
		try{
			aR = new AlumnosReferences(driver);
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated((By) aR.getEstudy_title()));
			System.out.println("Espera Nuevo Title: TEST OK");
		}catch(Exception e){
			System.out.println(e);
			System.out.println("Espera Nuevo Title: TEST KO");
		}
	}
}
