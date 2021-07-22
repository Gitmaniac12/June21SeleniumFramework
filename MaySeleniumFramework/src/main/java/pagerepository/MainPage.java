package pagerepository;

import org.openqa.selenium.By;
import businessfunctions.BaseClass;

public class MainPage extends BaseClass {
	
	static By welcome=By.xpath("//*[@id=\"welcome\"]");
	static By logout=By.linkText("Logout");
	
	
	static public void clickWelcomeButton() {
		driver.findElement(By.xpath("//*[@id=\"welcome\"]")).click();
	}
	
	static public void clickLogoutButton() {
		driver.findElement(By.linkText("Logout")).click();
	}
	
}
