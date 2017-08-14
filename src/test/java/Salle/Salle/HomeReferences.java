package Salle.Salle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeReferences {
	private WebDriver driver;
	private String url = "http://www.salleurl.edu/es";
	private String xpath_principal_header_NuevosAlumnos = "//li[@class[contains(.,'first collapsed')]]";
	private String id_principal_logoSalle = "logo";
	private String xpath_principal_header_Alumnos = ".//*[@id='block-menu-features']/div/ul/li[2]/a";
	private String cs_Alumni_header = "#block-menu-features > div > ul > li:nth-child(3) > a";
	private String cs_Empresas_header = "#block-menu-features > div > ul > li:nth-child(4) > a";
	
	public HomeReferences(WebDriver driver){
		this.driver = driver;
	}
	
	public void getSalleUrl(WebDriver driver){
		driver.get(url);
	}
	
	public void EsperaCargaPrincipal(WebDriver driver) throws Exception{
		try{
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id(id_principal_logoSalle)));
			System.out.println("Carga principal: TEST OK");
		}catch(Exception e){
			System.out.println(e);
			System.out.println("Carga principal: TEST KO");
		}
	}
	
	public void EntraNuevosAlumnos(WebDriver driver) throws Exception{
		try{
			driver.findElement(By.xpath(xpath_principal_header_NuevosAlumnos))
			.click();
			System.out.println("Header Nuevos Alumnos click: TEST OK");
		}catch(Exception e){
			System.out.println(e);
			System.out.println("Header Nuevos Alumnos click: TEST KO");
		}
	}
	
	public void EntraAlumnos (WebDriver driver) throws Exception{
		try{
			driver.findElement(By.xpath(xpath_principal_header_Alumnos))
			.click();
			System.out.println("Header Alumnos click: TEST OK");
		}catch(Exception e){
			System.out.println(e);
			System.out.println("Header Alumnos click: TEST KO");
		}
	}
	
	public void EntraAlumni (WebDriver driver) throws Exception{
		try{
			driver.findElement(By.cssSelector(cs_Alumni_header))
			.click();
			System.out.println("Header Alumni click: TEST OK");
		}catch(Exception e){
			System.out.println(e);
			System.out.println("Header Alumni click: TEST KO");
		}
	}
	
	public void EntraEmpresa (WebDriver driver) throws Exception{
		try{
			driver.findElement(By.cssSelector(cs_Empresas_header))
			.click();
			System.out.println("Header Empresa click: TEST OK");
		}catch(Exception e){
			System.out.println(e);
			System.out.println("Header Empresa click: TEST KO");
		}
	}
	//("//span[@class[contains(.,'cambiarDatosEnvio')]]"))
	/* @FindBy(how = How.XPATH, using = "//li[@class[contains(.,'first collapsed')]]")
	 public static WebElement nuevos_alumnos;

	 @FindBy(how = How.ID, using = "logo")
	 public static WebElement logo_salle;

	 @FindBy(how = How.ID, using = "pwd")
	 public static WebElement txtbx_Password;

	 @FindBy(how = How.NAME, using = "submit")
	 public static WebElement btn_Login ;

	 @FindBy(how = How.XPATH, using = ".//*[@id='account_logout']/a")
	 public static WebElement lnk_LogOut;*/
}
