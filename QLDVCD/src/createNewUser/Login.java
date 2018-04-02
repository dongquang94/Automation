package createNewUser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class Login {
	
	public void getLogin() throws IOException{
		
		WebDriver driver = new ChromeDriver();
		try {			
			
			GetProperties prop = new GetProperties();
			driver.get(prop.getPropValues("homepage"));
			Thread.sleep(5);
			
			//Login process
			WebElement loginButt = driver.findElement(By.xpath("/html/body/header/nav/div/ul/li/a"));
			loginButt.click();

			WebElement loginPanel = driver.findElement(By.xpath("//*[@id=\"loginModal\"]/div/div"));
			loginPanel.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(prop.getPropValues("username"));
			loginPanel.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(prop.getPropValues("password"));
			Thread.sleep(100);
			WebElement loginButt2 = driver.findElement(By.xpath("//*[@id=\"btn-login\"]"));
			loginButt2.click();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}


