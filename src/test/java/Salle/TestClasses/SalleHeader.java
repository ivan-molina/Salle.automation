package Salle.TestClasses;

import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Salle.Reporters.Esenciales;
import Salle.Reporters.Screenshot;
import Salle.Salle.HomeReferences;
import Salle.Salle.NuevosAlumnosReferences;
import Salle.Validations.AlumniValidations;
import Salle.Validations.AlumnosValidations;
import Salle.Validations.NuevosAlumnosValidations;

public class SalleHeader {
	private WebDriver driver = new ChromeDriver();
	
	private NuevosAlumnosValidations na =  new NuevosAlumnosValidations();
	public HomeReferences hr  = new HomeReferences(driver);;
	private AlumnosValidations a = new AlumnosValidations();
	private AlumniValidations ali = new AlumniValidations();
	private Esenciales esen = new Esenciales();
	private Screenshot sc = new Screenshot();
	
	@AfterClass
	public void DespuesHeader(){
		driver.quit();
	}
	
	@AfterMethod
	public void tearDown(ITestResult result){
		if(ITestResult.FAILURE==result.getStatus()){
			sc.captureScreenshot(driver, "Header");
		}
	}
	
	@BeforeClass
	public void AntesHeader(){
		hr.getSalleUrl(driver);
	}
	
	@Test(priority = 1)
	public void NuevosAlumnos() throws Exception{
		hr.EsperaCargaPrincipal(driver);
		hr.EntraNuevosAlumnos(driver);
		na.validationNuevoTitle(driver); 
	}
	
	@Test(priority = 2)
	public void Alumnos() throws Exception{
		hr.EntraAlumnos(driver);
		//Guardamos el handle del driver de la pantalla principal
		String originalWindowHandle = driver.getWindowHandle();
		//Verificamos el handle posicionado en la nueva pestaña
		esen.cambiaPestaña(driver);
		
		a.ValidaUrl(driver);
		//Volvemos a la Pestaña principal de la prueba (HOME)
		driver.switchTo().window(originalWindowHandle);
	}
	
	@Test(priority = 3)
	public void Alumni() throws Exception{
		hr.EntraAlumni(driver);
		//Guardamos el handle del driver de la pantalla principal
		String originalWindowHandle = driver.getWindowHandle();
		//Verificamos el handle posicionado en la nueva pestaña
		esen.cambiaPestaña(driver);
		
		ali.ValidaUrl(driver);
		//Volvemos a la Pestaña principal de la prueba (HOME)
		driver.switchTo().window(originalWindowHandle);
	}
	
	@Test(priority = 4)
	public void Empresas() throws Exception{
		hr.EntraEmpresa(driver);
		
	}

}
