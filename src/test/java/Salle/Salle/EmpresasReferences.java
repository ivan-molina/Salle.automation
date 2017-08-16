package Salle.Salle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmpresasReferences {
	private WebDriver driver;
	private String url;
	private String class_empresas_imagen = "img-container";
	
	public EmpresasReferences(WebDriver driver){
		this.driver = driver;
	}
	public void getEmpresasUrl(WebDriver driver){
		driver.get(url);
	}
	public void EstudyTitle(WebDriver driver) throws Exception{
		try{
			driver.findElement(By.className(class_empresas_imagen));
			System.out.println("Encuentra Nuevo Title: TEST OK");
		}catch(Exception e){
			System.out.println(e);
			System.out.println("Encuentra Nuevo Title: TEST KO");
		}		
	}
}
