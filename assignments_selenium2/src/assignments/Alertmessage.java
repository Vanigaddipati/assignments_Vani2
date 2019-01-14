package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertmessage {
	static WebDriver driver;
	
	public static boolean alertBoxPresent() {
		boolean alertpresent =true;
		try {
			
			driver.switchTo().alert();
			
		}
		catch(Exception e) {
			alertpresent=false;
			
		}
		return alertpresent;
	}
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://whitecircleschool.com/alertboxdemo/");
		driver.findElement(By.cssSelector("body > div.elementor.elementor-599 > div > div > section.elementor-element.elementor-element-9860042.elementor-section-boxed.elementor-section-height-default.elementor-section-height-default.elementor-section.elementor-top-section > div > div > div > div > div > div > div > button")).click();
		if (alertBoxPresent()) {
			driver.switchTo().alert().accept();
			
		}	
		
	}

	}
	

