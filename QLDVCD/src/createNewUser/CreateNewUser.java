package createNewUser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class CreateNewUser {

	static WebDriver driver = new ChromeDriver();
	static GetProperties prop = new GetProperties();
	
	public void getLogin() throws IOException{
		System.out.println("--------------Step login start----------------");
		try {			
			
			driver.get(prop.getPropValues("homepage"));
			Thread.sleep(5);
			
			//Login process
			WebElement loginButt = driver.findElement(By.xpath("/html/body/header/nav/div/ul/li/a"));
			loginButt.click();
			Thread.sleep(200);
			
			WebElement loginPanel = driver.findElement(By.xpath("//*[@id=\"loginModal\"]/div/div"));
			loginPanel.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(prop.getPropValues("username"));
			loginPanel.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(prop.getPropValues("password"));
			Thread.sleep(100);
			
			WebElement loginButt2 = driver.findElement(By.xpath("//*[@id=\"btn-login\"]"));
			loginButt2.click();
			Thread.sleep(100);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("--------------Step login exeption----------------");
			e.printStackTrace();
		}
		System.out.println("--------------Step login end----------------");
	}
	
	public void CreateUser() {
		System.out.println("--------------Step create user start----------------");
		try {			
			
			//Click choose previllege
//			WebElement previllege = driver.findElement(By.xpath("//*[@id=\"roles\"]/option[2]"));
//			previllege.click();
//			Thread.sleep(20);
			
			//Click choose info manage -- Quang: Check cho anh cho nay voi. Dang khong dung
			WebElement inforManage = driver.findElement(
					By.xpath("//div[@id=\"menu\"]//div[@class=\"main-sidebar\"]//section[@class=\"sidebar\"]//ul[@class=\"sidebar-menu tree\"]//li[@class")
					);
																  
			inforManage.click();
			Thread.sleep(20);
			
			//Click manage unionists button
			WebElement unionistsManage = driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/section/ul/li[2]/ul/li[1]/a/span[1]"));
			unionistsManage.click();
			Thread.sleep(20);
			
			//Click uninonist
			WebElement uninonist = driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/section/ul/li[2]/ul/li[1]/ul/li[1]/a/span[1]"));
			uninonist.click();
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("--------------Step create user exeption----------------");
			e.printStackTrace();
		}
		System.out.println("--------------Step create user end----------------");
	}
}


