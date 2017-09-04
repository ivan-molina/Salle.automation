package Salle.Validations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Salle.Salle.UniversidadesReferences;

public class UniversidadesValidations {
	private UniversidadesReferences ur = new UniversidadesReferences();
	
	public void EsperaCargaPrincipal(WebDriver driver) throws Exception{
		try{
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(ur.get_titol_universidades()));
			System.out.println("Carga principal: TEST OK");
		}catch(Exception e){
			System.out.println(e);
			System.out.println("Carga principal: TEST KO");
		}
	}
}
