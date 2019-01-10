package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Birthdateselection {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://facebook.com");
	// To select values from drop down
	// Day
			WebElement Day= driver.findElement(By.id("day"));
			Select select=new Select(Day);
			select. selectByValue("22");
			//month
			WebElement Month= driver.findElement(By.id("month"));
			Select name=new Select(Month);
			name. selectByValue("11");
			//Year
			WebElement Year= driver.findElement(By.id("year"));
			Select era=new Select(Year);
			era. selectByValue("1920");
					
			
}			
}
