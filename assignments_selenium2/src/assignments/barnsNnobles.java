package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class barnsNnobles {
	static WebDriver driver; 
	public static boolean Advpresent() {
		boolean advstatus;
			
		try {
			advstatus=driver.findElement(By.xpath("//body[contains(@class,'overlay')]")).isDisplayed();
					
		} catch (Exception e){
			advstatus=false;
			
		}
		return advstatus;
	}
	// Go to barnes and nobles and then click on advertisement by clicking I'll pass.
	
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.barnesandnoble.com/");
			if (Advpresent()) {
				driver.findElement(By.cssSelector("#bx-element-891353-txSrrII > button")).click();
							}
		
			// Now hoover on Games & collections and select best seller option
			
			WebElement games= driver.findElement(By.linkText("Games & Collectibles"));
			Actions action=new Actions(driver);
			action.moveToElement(games).perform();
			driver.findElement(By.linkText("Bestsellers")).click();		
			
						
		}
		
				
	}

	