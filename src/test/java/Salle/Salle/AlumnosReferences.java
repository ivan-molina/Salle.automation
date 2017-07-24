package Salle.Salle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlumnosReferences {
	private WebDriver driver;
	private String url = "https://estudy.salle.url.edu/?lang=es";
	private String xpath_estudy_title = "yui_3_17_2_1_1500116845433_145";
	
	public AlumnosReferences(WebDriver driver){
		this.driver = driver;
	}
	
	public void getNuevosAlumnosUrl(WebDriver driver){
		driver.get(url);
	}
	
	public void EstudyTitle(WebDriver driver) throws Exception{
		try{
			driver.findElement(By.id(xpath_estudy_title));
			System.out.println("Encuentra Nuevo Title: TEST OK");
		}catch(Exception e){
			System.out.println(e);
			System.out.println("Encuentra Nuevo Title: TEST KO");
		}		
	}
	
	public void EsperaEstudyTitle(WebDriver driver){
		try{
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id(xpath_estudy_title)));
			System.out.println("Espera Nuevo Title: TEST OK");
		}catch(Exception e){
			System.out.println(e);
			System.out.println("Espera Nuevo Title: TEST KO");
		}
	}
	
	public String getNuevoAlumnosUrl () {
		return url;
	}
}
