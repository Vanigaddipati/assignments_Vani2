package assignments;
// ctrl+shift+o- to import all required classes and interfaces.
// id-- driver.findElement(By.id("email").sendkeys("abc.com");
//name--driver.findelement(By.name("username").sendkeys("abc@g,aol.com")
//css selector-- 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Incorrectpwderrormsg {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://facebook.com");
	driver.findElement(By.id("email")).sendKeys("xyz@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("password");
	driver.findElement(By.id("loginbutton")).click();
	//verify actual messsage and expected message
	String expectedMessage="The password you’ve entered is incorrect. Forgot Password?";
	String actualMessage=driver.findElement(By.cssSelector("#globalContainer > div.uiContextualLayerPositioner._572t.uiLayer > div > div > div")).getText();
	if (expectedMessage.equals(actualMessage))	{
		System.out.println("Test case passed");
	}
	
		else {
			System.out.println("Test case failed");
		}
	driver.close();
	}
			
}

