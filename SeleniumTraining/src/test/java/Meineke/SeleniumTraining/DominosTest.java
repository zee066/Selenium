package Meineke.SeleniumTraining;

import org.testng.annotations.Test;

import Common.Utilities;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class DominosTest  {
	public WebDriver driver;
	@Test
  public void f() throws InterruptedException {
		Dominos obj=new Dominos(driver);
		Thread.sleep(3000);
		obj.cancelbutton();
		Thread.sleep(10000);
		obj.carryouttab();
		Thread.sleep(3000);
		Dominos2 obj2=new Dominos2(driver);
		obj2.searchbutton();
		Thread.sleep(3000);
		Dominos3 obj3=new Dominos3(driver);
		obj3.locationtab();
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\15408\\git\\repository\\SeleniumTraining\\src\\Drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.navigate().to("https://www.dominos.com/en/");
	  
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	 //  Thread.sleep(3000);
	//   driver.close();
  }

}
