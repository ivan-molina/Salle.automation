package Salle.Salle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeReferences {
	
	private String url = "http://www.salleurl.edu/es";
	public WebDriver driver; 
	
	//************************************************************************
	//Creamos nuestro Factory con todos los elementos que usaremos en la HOME*
	//************************************************************************
	
	@FindBy(xpath = "//li[@class[contains(.,'first collapsed')]]")
	private WebElement xpath_principal_header_NuevosAlumnos;
	
	@FindBy(id = "logo")
	private WebElement id_principal_logoSalle;
	
	@FindBy(xpath = ".//*[@id='block-menu-features']/div/ul/li[2]/a")
	private WebElement xpath_principal_header_Alumnos;
	
	@FindBy(css = "#block-menu-features > div > ul > li:nth-child(3) > a")
	private WebElement cs_Alumni_header;
	
	@FindBy(css = "#block-menu-features > div > ul > li:nth-child(4) > a")
	private WebElement cs_Empresas_header;
	
	@FindBy(xpath = "//*[@id=\"block-menu-features\"]/div/ul/li[5]/a")
	private WebElement xpath_principal_header_universidades;
	
	@FindBy(xpath = "")
	private WebElement xpath_principal_header_Escuela;
	
	@FindBy(xpath = "")
	private WebElement xpath_principal_header_prensa;
	
	//*****************************************************************************
	//Instanciamos el constructor de la clase junto con el constructor del Factory*
	//*****************************************************************************
	
	public HomeReferences(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//*******************************************
	//Implementamos los getters de los elementos*
	//*******************************************
	
	public void getSalleUrl(WebDriver driver){
		driver.get(url);
	}
	
	//*******************************************
	//Getters del header*
	//*******************************************
	
	public WebElement getHeader_NuevosAlumnos() {
		return xpath_principal_header_NuevosAlumnos;
	}
	
	public WebElement getHeader_LogoSalle() {
		return id_principal_logoSalle;
	}
	
	public WebElement getHeader_Alumnos() {
		return xpath_principal_header_Alumnos;
	}
	
	public WebElement getHeader_Alumni() {
		return cs_Alumni_header;
	}
	
	public WebElement getHeader_Empresas() {
		return cs_Empresas_header;
	}
	
	public WebElement getHeader_Universidades() {
		return xpath_principal_header_universidades;
	}
	
	public WebElement getHeader_Escuela() {
		return xpath_principal_header_Escuela;
	}
	
	public WebElement getHeader_Prensa() {
		return xpath_principal_header_prensa;
	}
}
