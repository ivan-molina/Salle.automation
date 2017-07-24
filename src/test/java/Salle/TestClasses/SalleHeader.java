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
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Salle.Reporters.Esenciales;
import Salle.Salle.HomeReferences;
import Salle.Salle.NuevosAlumnosReferences;
import Salle.Validations.AlumnosValidations;
import Salle.Validations.NuevosAlumnosValidations;

public class SalleHeader {
	private WebDriver driver = new ChromeDriver();
	private HomeReferences hr = new HomeReferences(driver);
	private NuevosAlumnosValidations na =  new NuevosAlumnosValidations();
	private AlumnosValidations a = new AlumnosValidations();
	private Esenciales esen = new Esenciales();
	
	@AfterClass
	public void DespuesHeader(){
		driver.quit();
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
		
		String originalWindowHandle = driver.getWindowHandle();
		for (String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
			String url = driver.getCurrentUrl();
		}
		
		a.ValidaUrl(driver);
		
		driver.switchTo().window(originalWindowHandle);
		String url = driver.getCurrentUrl();
	}

}
