package tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import businessfunctions.BaseClass;
import pagerepository.AddUserPage;
import pagerepository.LoginPage;
import pagerepository.MainPage;
import utilityfunctions.ExcelUtil;

public class LoginLogoutTest extends BaseClass {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	@Test	
		public void LoginLogout() {
		
		BaseClass.openBrowser();
		
		int rCount=ExcelUtil.getRowCount();
				
		for (int i=1;i<rCount;i++)

		{
				
				String username=ExcelUtil.getStringCellValue(i, 0);
				System.out.println(username);
				String password=ExcelUtil.getStringCellValue(i, 1);
				System.out.println(password);
				LoginPage.enterUserName(username);
				LoginPage.enterPassword(password);
				LoginPage.clickLoginButton();
				
				MainPage.clickWelcomeButton();
				driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
				MainPage.clickLogoutButton();
				
				
		}
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\gayat\\eclipse-workspace\\MaySeleniumFramework\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");*/
		
		//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		//driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		//driver.findElement(By.id("btnLogin")).click();
			
		/*AddUserPage.clickAdminLink();
		System.out.println("clicked admin");
		
		AddUserPage.clickAddButton();
		System.out.println("clickedadd");
		
		AddUserPage.selUserRole();
		System.out.println("selrole");
		
		AddUserPage.addEmpName();
		System.out.println("addedempl");
		
		AddUserPage.addEmpUserName();
		System.out.println("addedemplUsername");
		
		AddUserPage.userStatus();
		System.out.println("seluserstatus");
		
		AddUserPage.addPassword();
		System.out.println("addedpw");
		
		AddUserPage.confPassword();
		System.out.println("confirmpw");
		
		AddUserPage.clickSaveButton();
		System.out.println("saved");*/
		
		
		BaseClass.closeBrowser();
		//}
		
	}
}


