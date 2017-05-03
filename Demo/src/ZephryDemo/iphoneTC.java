package ZephryDemo;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class iphoneTC {
	public void iPhoneTC()
	{
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setCapability("browserName", "iPhone");
		caps.setCapability("device","iPhone 5");
		caps.setPlatform(Platform.MAC);
		//WebDriver driver=new RemoteWebDriver(new URL(URL),caps);
				
	}

}
