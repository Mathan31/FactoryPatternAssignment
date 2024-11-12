package factorypatternclassroom;

import org.openqa.selenium.WebDriver;

public class BrowserFactory {
	
	static String url = "https://ecommerce-playground.lambdatest.io/index.php?route=product/manufacturer/info&manufacturer_id=8";
	
	public static void browserAction(BrowserType type) {
		WebDriver driver;
		switch (type) {
		case CHROME: 
			driver = new ChromeBrowser().launchBrowser();
			break;
		case EDGE: 
			driver = new EdgeBrowser().launchBrowser();
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + type);
		
	}
		
		BrowserHelper.maximize(driver);
		BrowserHelper.navigateUrl(driver, url);
		BrowserHelper.lambda(driver);
		//BrowserHelper.closeBrowser(driver);
}

}