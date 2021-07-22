package pagerepository;

import org.openqa.selenium.By;

import businessfunctions.BaseClass;

public class LoginPage1 extends BaseClass{
		
		
		// declaring elements
		static By username=By.id("txtUsername");
		static By password=By.id("txtPassword");
		static By loginbtn=By.id("btnLogin");
		
		static public void enterUserName() {
			driver.findElement(username).sendKeys("Admin");
		}
		
		static public void enterPassword() {
			driver.findElement(password).sendKeys("admin123");
		}
		static public void clickLoginButton() {
			driver.findElement(loginbtn).click();
		}
				
	}

