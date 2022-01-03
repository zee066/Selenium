package Meineke.SeleniumTraining;

import org.testng.annotations.Test;

import AmazonPage.Home;
import AmazonPage.Signin;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class SigninAmazon {
	public WebDriver driver;
  @Test
  public void f() {
	  Home obj=new Home(driver);
	  obj.Signclick();
	Signin ob=new Signin(driver);
	ob.emailaddress();
	ob.button();
			
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\15408\\git\\repository\\SeleniumTraining\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://amazon.com");
		driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
Thread.sleep(3000);	  
	  driver.close();
  }

}
