package ZephryDemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class andriodTC {
	  public static final String USERNAME = "mareedu1";
	  public static final String AUTOMATE_KEY = "NugpWYPg9acfG7ohzcXq";
	  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	public void andriod_TC01() throws MalformedURLException
	{
		DesiredCapabilities caps= DesiredCapabilities.android();
		caps.setPlatform(Platform.ANDROID);
		WebDriver driver=new RemoteWebDriver(new URL(URL),caps);
		driver.get("http://newtours.demoaut.com");
		
		
	}
}
