package com.qa.testscripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import com.qa.pages.FlipcartPages;
public class TestBase {
	WebDriver driver;
	JavascriptExecutor js;
	Actions act;
	FlipcartPages Flip;
	
	@Parameters({"Browser","url"})
	@BeforeClass
	public void setUp(String Browser, String url) {
		if(Browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Virtusa\\chromedriver_win32\\chromedriver.exe" );
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	     js=(JavascriptExecutor) driver;
		}
	    Flip = new FlipcartPages(driver);
	    act = new Actions(driver);
		driver.get(url);
		
	}
	@AfterClass
	public void tearDown() {
		driver.close();
	}
	public void captureScreenshot(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File Source=  ts.getScreenshotAs(OutputType.FILE);
		File target= new File(System.getProperty("user.dir")+ "/Screenshots/"+tname+System.currentTimeMillis()+".png");
		FileUtils.copyFile(Source,target);
		System.out.println("Screenshot is captured");
	}

}
