package Salle.TestClasses;

import java.io.File;
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

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.ReporterType;

import Salle.Salle.HomeReferences;
import Salle.Validations.AlumnosValidations;
import Salle.Validations.NuevosAlumnosValidations;

public class SalleHeader {
	private WebDriver driver = new ChromeDriver();
	private HomeReferences hr = new HomeReferences(driver);
	private NuevosAlumnosValidations na =  new NuevosAlumnosValidations();
	private AlumnosValidations a = new AlumnosValidations();
	
	@AfterClass
	public void DespuesHeader(){
		driver.quit();
	}
	@BeforeClass
	public void AntesHeader(){
		hr.getSalleUrl(driver);
	}
	@Test
	public void NuevosAlumnos() throws Exception{
		hr.EsperaCargaPrincipal(driver);
		hr.EntraNuevosAlumnos(driver);
		na.validationNuevoTitle(driver); 
	}
	@Test
	public void Alumnos() throws Exception{
		hr.EntraAlumnos(driver);
		a.validationNuevoTitle(driver);		
	}

}
