package ZephryDemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class sample {
public void tc_01() throws MalformedURLException
{
	DesiredCapabilities cap=DesiredCapabilities.chrome();
		cap.setPlatform(Platform.WINDOWS);
	URL url=new URL("http://localhost:4444/wd/hub");
	WebDriver driver=new RemoteWebDriver(url,cap);
	driver.get("http://newtours.demouat.com");
	System.out.println("Page2"+ driver.getTitle());
}
}
