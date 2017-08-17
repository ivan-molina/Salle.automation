package Salle.Validations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Salle.Salle.HomeReferences;

public class HomeValidations {
	
	public WebDriver driver;
	public HomeReferences hr;
	
	public HomeValidations(WebDriver driver) {
		this.driver = driver;
		hr  = new HomeReferences(driver);
	}
	
	public void EsperaCargaPrincipal(WebDriver driver) throws Exception{
		try{
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(hr.getHeader_LogoSalle()));
			System.out.println("Carga principal: TEST OK");
		}catch(Exception e){
			System.out.println(e);
			System.out.println("Carga principal: TEST KO");
		}
	}
	
	public void EntraNuevosAlumnos(WebDriver driver) throws Exception{
		try{
			hr.getHeader_NuevosAlumnos().click();
			System.out.println("Header Nuevos Alumnos click: TEST OK");
		}catch(Exception e){
			System.out.println(e);
			System.out.println("Header Nuevos Alumnos click: TEST KO");
		}
	}
	
	public void EntraAlumnos (WebDriver driver) throws Exception{
		try{
			hr.getHeader_Alumnos().click();
			System.out.println("Header Alumnos click: TEST OK");
		}catch(Exception e){
			System.out.println(e);
			System.out.println("Header Alumnos click: TEST KO");
		}
	}
	
	public void EntraAlumni (WebDriver driver) throws Exception{
		try{
			hr.getHeader_Alumni().click();
			System.out.println("Header Alumni click: TEST OK");
		}catch(Exception e){
			System.out.println(e);
			System.out.println("Header Alumni click: TEST KO");
		}
	}
	
	public void EntraEmpresa (WebDriver driver) throws Exception{
		try{
			hr.getHeader_Empresas().click();
			System.out.println("Header Empresa click: TEST OK");
		}catch(Exception e){
			System.out.println(e);
			System.out.println("Header Empresa click: TEST KO");
		}
	}
}
