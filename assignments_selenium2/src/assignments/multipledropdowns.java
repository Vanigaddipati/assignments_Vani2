package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class multipledropdowns {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// Go to http://whitecircleschool.com/explicit-wait-demo2/ . Select first dropdown & second dropdown.
		
		driver.get("http://whitecircleschool.com/explicit-wait-demo2/");
		Select firstdropDown=new Select (driver.findElement(By.id("arrival-time-list")));
		firstdropDown.selectByValue("8:15am");
		
		//Explicit wait--WebDriverWait wait = new WebDriverWait(driver,20);
		Select seconddropDown=new Select(driver.findElement(By.id("dynamic-list")));
		seconddropDown.selectByValue("9:00am");		
	}

}
