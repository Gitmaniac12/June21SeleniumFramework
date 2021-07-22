package pagerepository;

import org.openqa.selenium.By;
import businessfunctions.BaseClass;
import configuration.Configuration;

public class LoginPage extends BaseClass{
	
	
	// declaring elements
	static By username=By.id("txtUsername");
	static By password=By.id("txtPassword");
	static By loginbtn=By.id("btnLogin");
	
	static public void enterUserName(String UserName) {
		driver.findElement(username).sendKeys(UserName);
	}
	
	static public void enterPassword(String Password) {
		driver.findElement(password).sendKeys(Password);
	}
		static public void clickLoginButton() {
		driver.findElement(loginbtn).click();
	}
			
}
