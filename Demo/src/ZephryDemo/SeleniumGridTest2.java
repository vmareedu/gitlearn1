package ZephryDemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
 
public class SeleniumGridTest2 
{
 
@Test
public void runChrome() throws MalformedURLException
{
 
// We have to mention browser which we want to use for test execution
DesiredCapabilities cap=DesiredCapabilities.chrome();
 
// Set the platform where we want to run our test- we can use MAC and Linux and other platforms as well
cap.setPlatform(Platform.WINDOWS);

 
// Here you can use hub address, hub will take the responsibility to execute the test on respective node
URL url=new URL("http://localhost:4444/wd/hub");
 
// Create driver with hub address and capability
WebDriver driver=new RemoteWebDriver(url, cap);
 
// start application
driver.get("http://newtours.demoaut.com/");
driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
driver.findElement(By.xpath("//input[@name='login']")).click();
driver.findElement(By.xpath("//input[@name='findFlights']")).click();
driver.findElement(By.xpath("//input[@name='reserveFlights']")).click();
driver.findElement(By.xpath("//input[@name='passFirst0']")).sendKeys("fname1");
driver.findElement(By.xpath("//input[@name='passLast0']")).sendKeys("lname1");
driver.findElement(By.xpath("//input[@name='creditnumber']")).sendKeys("11111111111");
driver.findElement(By.xpath("//input[@name='buyFlights']")).click();
driver.findElement(By.xpath("//a[contains(.,'SIGN-OFF')]")).click();
// get the title and print the same
if (driver.getPageSource().contains("Your itinerary has been booked!") == true) {
	System.out.println("Your itinerary has been booked! is displayed");
} else {
	System.out.println("Your itinerary has been booked! is not displayed");
}
 
driver.close();
 
}
 
}