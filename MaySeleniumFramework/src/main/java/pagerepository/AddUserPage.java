package pagerepository;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import businessfunctions.BaseClass;

public class AddUserPage extends BaseClass{
	
	//static By selUserLink=By.linkText("Admin");
	static By addBtn=By.id("btnAdd");
	//static By userRole=(By.name("systemUser[userType]"));
	static By empName=By.id("systemUser_employeeName_empName");
	static By empUserName=By.id("systemUser_userName");
	static By password=By.id("systemUser_password");
	static By confpw= By.id("systemUser_confirmPassword");
	static By saveBtn=By.id("btnSave");
	static By deluser=By.id("ohrmList_chkSelectRecord_29");
			//.xpath("//*[@id=\"btnSave\"]");
	
	
	static public void clickAdminLink() {
		driver.findElement(By.linkText("Admin")).click();
	}
	
	static public void clickAddButton() {
		driver.findElement(addBtn).click();;
	}
	
	static public void selUserRole() {
		//driver.findElement(userRole).equals(systemUser[2]);
		Select userRole=new Select(driver.findElement(By.name("systemUser[userType]")));
		userRole.selectByVisibleText("Admin");
	
	}
	
	static public void addEmpName() {
	
		driver.findElement(empName).sendKeys("J");
		WebElement e = driver.findElement(By.xpath("/html/body/div[4]/ul/li[2]"));
		System.out.println(e.getText());
		e.click();
		System.out.println("after");
		
	}
	
	static public void addEmpUserName() {
		driver.findElement(empUserName).sendKeys("addinguser1");
	}
	
	static public void userStatus() {
		//driver.findElement(userRole).equals(systemUser[2]);
		Select userStatus=new Select(driver.findElement(By.name("systemUser[status]")));
		userStatus.selectByVisibleText("Enabled");
	}
	static public void addPassword() {
		driver.findElement(password).sendKeys("yakbeku123@");
	}
	
	static public void confPassword() {
		driver.findElement(confpw).sendKeys("yakbeku123@");
	}

	static public void clickSaveButton() {
		//driver.findElement(saveBtn).isSelected();
		driver.findElement(By.id("btnSave")).click();	
		System.out.println("Done");
	}
	
	static public void delSavedUser() {
		//driver.findElement(saveBtn).isSelected();
		//driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[4]/table/tbody/tr[49]/td[2]/a")).click();	
		//driver.findElement(By.id("ohrmList_chkSelectRecord_52"));
		driver.findElement(deluser).click();
		System.out.println("chkbox clck");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("btnDelete")).click();
		System.out.println("delsel");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("dialogDeleteBtn")).click();
		System.out.println("delseldialg");
		
		/*List<WebElement> row=driver.findElements(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[4]/table/tbody/tr/td[1]"));
		System.out.println(row.size());
		
		for(int i=1; i<row.size(); i++) {
			//String data = driver.findElement(By.xpath("//*[@id=\"mc_content\"]/section/section/div[1]/div[2]/div/div/div[2]/table/tbody/tr"+i+"/td[1]")).getText();			
			//System.out.println(data);
			String data=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[4]/table/tbody/tr["+i+"]/td[2]")).getText();
			System.out.println(data);
			System.out.println("data");*/
			}
		///html/body/div[1]/div[3]/div[2]/div/div/form/div[4]/table/thead/tr
		//System.out.println("seluser tobe deld");
	}

	

