package homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepage {

static String homepage = "http://101.99.14.65:8181/VTBWebProject/";	

static String username = "admin";
static String password = "123456";
	
	//@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		try {
			driver.get(homepage);
			System.out.println("Success Load");
			Thread.sleep(5);
			
			//Login process
			WebElement loginButt = driver.findElement(By.xpath("/html/body/header/nav/div/ul/li/a"));
			//WebElement loginButt = navBar.findElement(By.tagName("li"));
			loginButt.click();
			
			//Login process
			WebElement loginPanel = driver.findElement(By.xpath("//*[@id=\"loginModal\"]/div/div"));
			loginPanel.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(username);
			loginPanel.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
			
			WebElement loginButt2 = driver.findElement(By.xpath("//*[@id=\"btn-login\"]"));
			loginButt2.click();
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
