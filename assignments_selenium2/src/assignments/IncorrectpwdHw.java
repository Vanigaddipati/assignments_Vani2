package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IncorrectpwdHw {
	public static void main(String[] args) {
		//open browser
		WebDriver driver=new ChromeDriver();
		// go to facebook.com
		driver.get("https://facebook.com");
		// Enter correct username, wrong pwd and click on Log in
		driver.findElement(By.cssSelector("#email")).sendKeys("Vanigaddipati@gmail.com");
		driver.findElement(By.cssSelector("#pass")).sendKeys("password");
		driver.findElement(By.cssSelector("#loginbutton")).click();
		
		//Verify expected and actual message.
		
		String expectedMessage="The password you’ve entered is incorrect. Forgot Password?";
		String actualMessage=driver.findElement(By.cssSelector("#globalContainer > div.uiContextualLayerPositioner._572t.uiLayer > div > div > div")).getText();
		if (expectedMessage.equals(actualMessage)) {
			System.out.println("Testcase passed");
		}
		else {
			System.out.println("Testcase failed");
		}
		driver.close();
	}

}
//Good