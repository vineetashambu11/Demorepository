package com.vinnu.automation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
public class AlertPractice {
	Teststart t1 ;
	public static WebDriver driver;
	 Alert alert;
	
	@Test
	public void  Alertaccept() throws IOException, Exception {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		ChromeDriverService service = new ChromeDriverService.Builder().usingDriverExecutable(new File("src/test/resources/chromedriver.exe"))
				.usingAnyFreePort().build();

		service.start();
		driver= new RemoteWebDriver(service.getUrl(), DesiredCapabilities.chrome());
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
	
		System.out.println("passed");
		
		WebElement element=driver.findElement(By.xpath("//button[contains(text(),'Click me!') and @class='btn btn-default btn-lg']"));
		element.click();
		Actions act = new Actions(driver);
		Action y=act.moveToElement(driver.findElement(By.xpath("//button[contains(text(),'Click me!') and @class='btn btn-default btn-lg']"))).build();
		element.click();
		y.perform();
//		t1.actionstoExecute("//button[contains(text(),'Click me!') and @class='btn btn-default btn-lg']");
//		WebElement element=driver.findElement(By.xpath("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,250)", element);
//		
		driver.switchTo().alert();
		//driver.switchTo().window(nameOrHandle);
    	  driver.switchTo().alert().accept();
    	   // if present consume the alert
    	  System.out.println(driver.switchTo().alert().getText());
    	
    	  Thread.sleep(2000);

    	 
    	 
	}
	
	

}
