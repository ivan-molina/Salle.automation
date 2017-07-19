package Salle.Salle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class NuevosAlumnosReferences {
	private WebDriver driver;
	private String url = "http://www.salleurl.edu/es/nuevos-alumnos-0s";
	private String xpath_nuevo_title = ".//h1[@class[contains(.,'titol')]]";
	
	public NuevosAlumnosReferences(WebDriver driver){
		this.driver = driver;
	}
	
	public void getNuevosAlumnosUrl(WebDriver driver){
		driver.get(url);
	}
	
	public void NuevoTitle(WebDriver driver) throws Exception{
		try{
			driver.findElement(By.xpath(xpath_nuevo_title));
			System.out.println("Encuentra Nuevo Title: TEST OK");
		}catch(Exception e){
			System.out.println(e);
			System.out.println("Encuentra Nuevo Title: TEST KO");
		}		
	}
	
	public void EsperaNuevoTitle(WebDriver driver){
		try{
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath_nuevo_title)));
			System.out.println("Espera Nuevo Title: TEST OK");
		}catch(Exception e){
			System.out.println(e);
			System.out.println("Espera Nuevo Title: TEST KO");
		}
	}
}
