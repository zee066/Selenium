package Common;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;

public class Utilities {
	public WebDriver driver;// DO NOT USE WEBDRIVER INTERFACE WHERE YOU EXTEND THE UTILITY CLASS OR COMMON CODE CLASS
	@Parameters({"browser","wbsite"})
	@BeforeMethod
 	  public void Browsers(String browser,String wbsite) throws InterruptedException {
			if (browser.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\15408\\git\\repository\\SeleniumTraining\\src\\Drivers\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.navigate().to(wbsite);
				driver.manage().window().maximize();
				Thread.sleep(3000);
			}
			   else if (browser.equalsIgnoreCase("Edge")) {
				System.setProperty("webdriver.edge.driver", "C:\\Users\\15408\\git\\repository\\SeleniumTraining\\src\\Drivers\\msedgedriver.exe");
				driver=new EdgeDriver();
				driver.navigate().to(wbsite);
				driver.manage().window().maximize();
				Thread.sleep(3000);
			}
			   else {
				System.out.println("CORRECT THE BROWSER NAME");
			}
		}
  
    @AfterMethod
  public void afterMethod() throws InterruptedException {
    	Thread.sleep(3000);
    	 driver.close();
    	
  }

    public void shots() throws IOException {
    	Date is=new Date();
    	String d=is.toString().replace(" ", "_").replace(":", "_");
    	System.out.println(d);
    	File sc=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	org.openqa.selenium.io.FileHandler.copy(sc, new File("C:\\Users\\15408\\git\\repository\\SeleniumTraining\\src\\Screenshots\\"+d+"Testsnaps.jpg"));
    	
    }

}
