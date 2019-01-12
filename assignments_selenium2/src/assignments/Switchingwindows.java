package assignments;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Switchingwindows {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Instagram")).click();
		
		// Shift  focus to new window
				
		ArrayList<String>tabs=new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		WebElement languages=(driver.findElement(By.cssSelector("#react-root > section > footer > div > nav > ul > li:nth-child(11) > span > select")));
		Select dropdown=new Select(languages);
		dropdown.selectByVisibleText("Italiano");
						
				
		
	}

}
