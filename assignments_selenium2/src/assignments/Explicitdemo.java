package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Explicitdemo {
	public static void main(String[] args) {
		// open browser
		WebDriver driver=new ChromeDriver();
		
		// To maximize window
		driver. manage().window().maximize();
		
		// Navigate to http://whitecircleschool.com/explicit-wait-demo2/
		driver.get("http://whitecircleschool.com/explicit-wait-demo2/");
		
		// To select from drop down
		
		WebElement mySelectElement = driver.findElement(By.id("arrival-time-list")); 
		Select arrival-time-list=new Select(driver.findElement(By.id("arrival-time-list")));
		arrival-time-list.selectvisibletext("8:30");
		
	}

}
//When you create the variables, don't put a hyphen. If you need to connect multiple words, use camel
//casing. So you can name your variables as arrivalTimeList instead of arrival-time-list