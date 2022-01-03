package Meineke.SeleniumTraining;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGofAnnotations {
  @Test
  public void f() {
 System.out.println("this test annotation");//5
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("this before method annotation");//4
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("this after method annotation");//6
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("this before class annotation");//3
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("this after class annotation");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("this before test annotation");//2
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("this after test annotation");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("this before suite annotation");//1
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("this after suite annotation");
  }

}
