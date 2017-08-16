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
		
	public HomeReferences(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void getSalleUrl(WebDriver driver){
		driver.get(url);
	}
	
	public void EsperaCargaPrincipal(WebDriver driver) throws Exception{
		try{
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(id_principal_logoSalle));
			System.out.println("Carga principal: TEST OK");
		}catch(Exception e){
			System.out.println(e);
			System.out.println("Carga principal: TEST KO");
		}
	}
	
	public void EntraNuevosAlumnos(WebDriver driver) throws Exception{
		try{
			xpath_principal_header_NuevosAlumnos.click();
			System.out.println("Header Nuevos Alumnos click: TEST OK");
		}catch(Exception e){
			System.out.println(e);
			System.out.println("Header Nuevos Alumnos click: TEST KO");
		}
	}
	
	public void EntraAlumnos (WebDriver driver) throws Exception{
		try{
			xpath_principal_header_Alumnos.click();
			System.out.println("Header Alumnos click: TEST OK");
		}catch(Exception e){
			System.out.println(e);
			System.out.println("Header Alumnos click: TEST KO");
		}
	}
	
	public void EntraAlumni (WebDriver driver) throws Exception{
		try{
			cs_Alumni_header.click();
			System.out.println("Header Alumni click: TEST OK");
		}catch(Exception e){
			System.out.println(e);
			System.out.println("Header Alumni click: TEST KO");
		}
	}
	
	public void EntraEmpresa (WebDriver driver) throws Exception{
		try{
			cs_Empresas_header.click();
			System.out.println("Header Empresa click: TEST OK");
		}catch(Exception e){
			System.out.println(e);
			System.out.println("Header Empresa click: TEST KO");
		}
	}
}
