package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openbrowser {
	public static void main(String[] args) {
		// To open browser. WebDriver is an interface,  driver is an object and new chrome driver is a class
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Navigate to face book . get is a method here and driver is an object.
		driver.get("https://facebook.com");
		// Compare expected and Actual value. actual value is the one that 's will get from facebook. we are not providing anything manually.
		String expectedTitle = "Facebook – log in or sign up";
		String actualTitle = driver.getTitle();
		// if they are equal, test case will pass otherwise it will fail
		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Test case passed");
		}
			
		else {
			System.out.println("Test case failed");
		}
			driver.close();				
	}

}
//Good