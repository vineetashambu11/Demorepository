package com.vinnu.automation;
import org.testng.annotations.Test;
import java.io.File;
//import org.apache.commons.io.FileUtils;
import org.testng.annotations.Test;
import org.testng.reporters.Files;

import automation.config.ExcelReadConfig;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Teststart {
	
	public static WebDriver driver;
	@Test(priority=1)
public void loginUrl() throws IOException {
	
	System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
	ChromeDriverService service = new ChromeDriverService.Builder().usingDriverExecutable(new File("src/test/resources/chromedriver.exe"))
			.usingAnyFreePort().build();

	service.start();

	ChromeOptions options = new ChromeOptions();
	options.addArguments("start-maximized");

	 driver= new RemoteWebDriver(service.getUrl(), DesiredCapabilities.chrome());
	String locator1 ="https://www.toolsqa.com/automation-practice-form/";
	
	driver.get(locator1);
	
	
}

public void actionstoExecute(String locator ){
	Actions builder =new Actions(driver);
	Action d=  builder.moveToElement(driver.findElement(By.xpath(locator))).build();
	d.perform();
driver.findElement(By.xpath(locator)).click();

 
}






@Test(priority=2)

public void radioSelection() {
	
	WebElement radiobutton1 =  driver.findElement(By.id("sex-0"));
	WebElement radiobutton2=  driver.findElement(By.id("sex-1"));
	Actions builder = new Actions(driver);
    Action mouseOverHome = builder
            .moveToElement(radiobutton1)
            .build();
	
	//JavascriptExecutor js = (JavascriptExecutor) driver;
	//js.executeScript("arguments[0].scrollIntoView();", radiobutton1);
	
	radiobutton1.click();
	mouseOverHome.perform();
	
	if(radiobutton1.isSelected()) {
		System.out.println("selected Male Gender");
	}

	if(radiobutton2.isSelected()) {
		System.out.println("selected Female Gender");
	}
}
	

@Test(priority=3)
	
public void checkSelection() {
	WebElement checkbutton1=driver.findElement(By.id("profession-0"));
	Actions builder = new Actions(driver);
    Action mouseOverHome = builder
            .moveToElement(checkbutton1)
            .build();
   checkbutton1.click();
	mouseOverHome.perform();
	
	if (checkbutton1.isSelected()) {
		System.out.println("checkbutton1 pressed ");
	}
	else {
	System.out.println("checkbutton1  pressed ");
	
	}
	
	for(int i = 0;i<2;i++) {
		WebElement checkbutton=driver.findElement(By.id("profession-0"));
		checkbutton.click();
		System.out.println("statusof checkbuttom1 "+ checkbutton.isSelected());
	}

	
	
		
}


@Test(priority=5,enabled=true)

public void uploadfile()  {
	driver.findElement(By.id(("photo"))).sendKeys("C:\\Users\\shambu.vineeta\\Downloads\\xp-1644\\OPS.CATEGORIZATION_CUS_SUP.csv");
	System.out.println("file uploaded");
	
	
}




@Test(priority=6,enabled=true)

public void dropdownSelection() throws Exception {
	
	Thread.sleep(2000);
	String xpath	="//select[@id='continents' and @name='continents']";
	Thread.sleep(2000);
	Actions builder =new Actions(driver);
	Action d=  builder.moveToElement(driver.findElement(By.xpath(xpath))).build();

	Select select =new Select(driver.findElement(By.xpath(xpath)));
	select.selectByVisibleText("Europe");
	
}

@Test(priority=7)
public void listSelection(){
	
	WebElement options1 = (WebElement) driver.findElement(By.id("selenium_commands"));
List<WebElement> op =options1.findElements(By.tagName("option"));
	
	for(WebElement element: op ) {
		
		System.out.println(element.getText());
		if (element.getText().equals("Browser Commands")) {
			element.click();
			break;
		}
		
	}

}





@Test (priority=8) 

public void submit(){

	driver.findElement(By.id("submit"));
	System.out.println("submitted the demo form");
}

}

