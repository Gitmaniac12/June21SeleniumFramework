package tests;

import java.util.concurrent.TimeUnit;

import businessfunctions.BaseClass;
import pagerepository.AddUserPage;
import pagerepository.LoginPage1;
import pagerepository.MainPage;

public class AddUserClass extends BaseClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		BaseClass.openBrowser();
		LoginPage1.enterUserName();
		LoginPage1.enterPassword();
		LoginPage1.clickLoginButton();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//MainPage.clickWelcomeButton();
		//driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		//MainPage.clickLogoutButton();
		
		//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			//	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
				//driver.findElement(By.id("btnLogin")).click();
					
				AddUserPage.clickAdminLink();
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
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("confirmpw");
				
				AddUserPage.clickSaveButton();
				System.out.println("saved");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				AddUserPage.delSavedUser();
				//BaseClass.closeBrowser();
				//}
				
			}
		
	}

