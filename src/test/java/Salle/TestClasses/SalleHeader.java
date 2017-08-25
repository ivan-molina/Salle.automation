package Salle.TestClasses;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
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
import Salle.Validations.HomeValidations;
import Salle.Validations.NuevosAlumnosValidations;

public class SalleHeader {
	private WebDriver driver = new ChromeDriver();
//	private WebDriver driver;
	
	private NuevosAlumnosValidations na =  new NuevosAlumnosValidations();
	private HomeReferences hr  = new HomeReferences(driver);
	private HomeValidations hv = new HomeValidations(driver);
	private AlumnosValidations a = new AlumnosValidations();
	private AlumniValidations ali = new AlumniValidations();
	private Esenciales esen = new Esenciales();
	private Screenshot sc = new Screenshot();
	
	@AfterClass
	public void DespuesHeader(){
		driver.quit();
	}
	
	//En caso de que el Test falle realizaremos un screenshot en el momento exacto del fallo
	@AfterMethod
	public void tearDown(ITestResult result){
		if(ITestResult.FAILURE==result.getStatus()){
			sc.captureScreenshot(driver, "Header "+ Test.class.getSimpleName());
		}
	}
	
	@BeforeClass
	public void AntesHeader(){
		hr.getSalleUrl(driver);
		driver.manage().window().maximize();
	}
	
	@Test(priority = 1)
	public void NuevosAlumnos() throws Exception{
		hv.EsperaCargaPrincipal(driver);
		hv.EntraNuevosAlumnos(driver);
		na.validationNuevoTitle(driver); 
	}
	
	@Test(priority = 2)
	public void Alumnos() throws Exception{
		hv.EntraAlumnos(driver);
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
		hv.EntraAlumni(driver);
		String originalWindowHandle = driver.getWindowHandle();
		esen.cambiaPestaña(driver);
		ali.ValidaUrl(driver);
		driver.switchTo().window(originalWindowHandle);
	}
	
	@Test(priority = 4)
	public void Empresas() throws Exception{
		hv.EntraEmpresa(driver);
		Assert.assertEquals(1, 2);	
	}

}
