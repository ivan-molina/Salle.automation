package Salle.Salle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NuevosAlumnosReferences {
	private WebDriver driver;
	private String url = "http://www.salleurl.edu/es/nuevos-alumnos-0s";
	
	@FindBy(xpath = ".//h1[@class[contains(.,'titol')]]")
	private WebElement xpath_nuevo_title;
	
	public NuevosAlumnosReferences(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void getNuevosAlumnosUrl(WebDriver driver){
		driver.get(url);
	}
	
	public WebElement Nuevo_title() {
		return xpath_nuevo_title;
	}
	
}
