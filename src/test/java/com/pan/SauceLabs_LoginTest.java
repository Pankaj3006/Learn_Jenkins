package com.pan;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//de41b041-2784-4c58-9557-46e7fde6f279

public class SauceLabs_LoginTest {
	
	@SuppressWarnings("deprecation")
	@Test
	public void test() throws MalformedURLException, InterruptedException {
		
//	    ChromeOptions browserOptions = new ChromeOptions();
//		EdgeOptions browserOptions = new EdgeOptions();
//		browserOptions.setPlatformName("Windows 10");
//		browserOptions.setBrowserVersion("latest");
//		browserOptions.setBrowserVersion("100");
//		browserOptions.addArguments("--start-maximized");
//		Map<String, Object> sauceOptions = new HashMap<>();
//		sauceOptions.put("username", "oauth-pankajkit-cfd0c");
//		sauceOptions.put("accessKey", "de41b041-2784-4c58-9557-46e7fde6f279");
//		sauceOptions.put("build", "selenium");
//		sauceOptions.put("name", "Test");
//		browserOptions.setCapability("sauce:options", sauceOptions);
//		
//		// start the session
//		URL url = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
//		RemoteWebDriver driver = new RemoteWebDriver(url, browserOptions);
		
		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.addArguments("--start-maximized");
		ChromeDriver driver = new ChromeDriver(browserOptions);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		Assert.assertEquals(title, "OrangeHRM");
		System.out.println("Third Test Case Executed");
		driver.quit();		
	}

}
