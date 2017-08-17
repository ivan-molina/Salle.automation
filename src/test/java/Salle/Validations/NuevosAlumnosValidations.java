package Salle.Validations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Salle.Reporters.Esenciales;
import Salle.Salle.AlumnosReferences;
import Salle.Salle.NuevosAlumnosReferences;

public class NuevosAlumnosValidations {
	NuevosAlumnosReferences naR; 
	
	public void NuevoTitle(WebDriver driver) throws Exception{
		try{
			naR = new NuevosAlumnosReferences(driver);
			driver.findElement((By) naR.Nuevo_title());
			System.out.println("Encuentra Nuevo Title: TEST OK");
		}catch(Exception e){
			System.out.println(e);
			System.out.println("Encuentra Nuevo Title: TEST KO");
		}		
	}
	
	public void EsperaNuevoTitle(WebDriver driver){
		try{
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated((By) naR.Nuevo_title()));
			System.out.println("Espera Nuevo Title: TEST OK");
		}catch(Exception e){
			System.out.println(e);
			System.out.println("Espera Nuevo Title: TEST KO");
		}
	}
	
	public void validationNuevoTitle(WebDriver driver) throws Exception{
		try{
			NuevosAlumnosReferences naR = new NuevosAlumnosReferences(driver);
			EsperaNuevoTitle(driver);
		}catch(Exception e){
			
			System.out.println(e);
		}
	}
	
	
}
