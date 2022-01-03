package Meineke.SeleniumTraining;

import org.testng.annotations.Test;

import Common.Utilities;

import org.testng.annotations.DataProvider;

public class Points extends Utilities {
  @Test(dataProvider = "dp")
  public void f(String n, String s) throws InterruptedException {
	  FacebookSign ob=new FacebookSign(driver);
		ob.email(n);
		Thread.sleep(3000);
		ob.passwrd(s);
		//ob.log();
		Thread.sleep(3000);
		ob.createnew();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "haider", "adsf" },
      new Object[] { "ali", "bsdf" },
    };
  }
}
