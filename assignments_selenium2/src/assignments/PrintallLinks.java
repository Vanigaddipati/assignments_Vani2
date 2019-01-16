package assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintallLinks {
	

	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// To go to Amazon
		
		driver.get("https://www.amazon.com/");
		
        // To print all the links
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Links are:"+ links. size());
		for (int i=1; i<=links.size(); i=i+1) {
			System.out.println(links.get(i).getText());
		}		
		
	}
	}
