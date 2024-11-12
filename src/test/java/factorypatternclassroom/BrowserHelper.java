package factorypatternclassroom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserHelper {
	
	public static void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	public static void navigateUrl(WebDriver driver,String url) {
		driver.get(url);
	}
	
	public static void lambda(WebDriver driver) {
		Actions actions = new Actions(driver);
		actions
		.moveToElement(driver.findElement(By.xpath("(//a[text()='iPod Touch']/preceding::img[@title='iPod Touch'])[1]")))
		.pause(Duration.ofSeconds(2))
		//.click(driver.findElement(By.xpath("//a[text()='iPod Touch']/preceding::span[text()='Add to Cart']")))
		.perform();
		driver.findElement(By.xpath("//a[text()='iPod Touch']/preceding::button[@title='Add to Cart']")).click();
	}
	
	public static void closeBrowser(WebDriver driver) {
		driver.quit();
	}

}
