package com.vinnu.automation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
@Test
public class Screenshot {
WebDriver driver;
Teststart t1;

public void takeScreenshot() throws IOException {
	System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
	ChromeDriverService service = new ChromeDriverService.Builder().usingDriverExecutable(new File("src/test/resources/chromedriver.exe"))
			.usingAnyFreePort().build();

	service.start();

	ChromeOptions options = new ChromeOptions();
	options.addArguments("start-maximized");
	driver= new RemoteWebDriver(service.getUrl(), DesiredCapabilities.chrome());
	driver.get("https://www.toolsqa.com/automation-practice-form/");

	File Src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(Src,new File("C:\\Users\\shambu.vineeta\\Downloads\\error.png"));
}
}
