package factorypatternclassroom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser implements Browser{
	
	
	@Override
	public WebDriver launchBrowser() {
		return new EdgeDriver();
	}

}
