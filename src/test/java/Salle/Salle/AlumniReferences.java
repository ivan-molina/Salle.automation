package Salle.Salle;

import org.openqa.selenium.WebDriver;

public class AlumniReferences {
	
	private WebDriver driver;
	private static String url = new String("http://alumni.salleurl.edu/");
	
	public AlumniReferences(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getNuevoAlumnosUrl () {
		return url;
	}
}
