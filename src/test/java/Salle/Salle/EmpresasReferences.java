package Salle.Salle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmpresasReferences {
	private WebDriver driver;
	private String url;
	
	@FindBy(className = "img-container")
	private WebElement class_empresas_imagen;
	
	public EmpresasReferences(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void getEmpresasUrl(WebDriver driver){
		driver.get(url);
	}
	
	public WebElement getEmpresas_imagen() {
		return class_empresas_imagen;
	}
	
}
