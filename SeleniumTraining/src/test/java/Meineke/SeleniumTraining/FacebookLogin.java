package Meineke.SeleniumTraining;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Common.Utilities;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;

public class FacebookLogin extends Utilities {
  
  
	@Test(priority = 1)
  public void f() throws InterruptedException, IOException {
		FacebookSign ob=new FacebookSign(driver);
		ob.email();
		Thread.sleep(3000);
		ob.passwrd();
		//ob.log();
		Thread.sleep(3000);
		ob.createnew();
		String expectedtext =ob.containstext();
		//assertEquals(expectedtext, "Connect with friends and the world around you on Facebook.");
		System.out.println("THIS AFTER ASSERT");
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(expectedtext, "Connect with friends and the world around you on Facebook.");
		sa.assertAll();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//shots();
	}
	
 
@Test(priority = 2,dependsOnMethods = "f")
public void d() throws InterruptedException, IOException {
	FacebookSign ob=new FacebookSign(driver);
	ob.createnew();
	Thread.sleep(3000);
	FacebookSignup obj=new FacebookSignup(driver);
	obj.firstname();
	obj.lastname();
	obj.mobile();
	obj.newpassword();
	obj.mdrop();
	obj.datedrop();
	obj.yeardrop();
	obj.gender();
	shots();
	
}



}

