package Meineke.SeleniumTraining;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Common.Utilities;

public class Property extends Utilities {
  @Test
  public void f() throws IOException {
	  Properties obj=new Properties();
	  FileInputStream ob=new FileInputStream("C:\\Users\\15408\\git\\repository\\SeleniumTraining\\A.properties");
	  obj.load(ob);
	String name=  obj.getProperty("Username");
	System.out.println(name);
	List<WebElement> linked=driver.findElements(By.tagName("a"));
	System.out.println(linked.size());
  }  
  
  }
