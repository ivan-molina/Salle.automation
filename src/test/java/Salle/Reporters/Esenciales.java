package Salle.Reporters;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Esenciales {
	public void ValidaUrl (WebDriver driver, String url) {
		String urltocompare = driver.getCurrentUrl();
		Assert.assertEquals(url, urltocompare);
	}
	
	public void cambiaPestaña(WebDriver driver) {
		for (String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
			String url = driver.getCurrentUrl();
		}
	}
}
