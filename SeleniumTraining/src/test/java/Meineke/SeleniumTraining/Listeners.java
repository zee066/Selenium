package Meineke.SeleniumTraining;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Common.Utilities;

public class Listeners extends Utilities implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		this.driver=((Utilities)result.getInstance()).driver;
		Date is=new Date();
    	String d=is.toString().replace(" ", "_").replace(":", "_");
    	System.out.println(d);
    	File sc=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	try {
			org.openqa.selenium.io.FileHandler.copy(sc, new File("C:\\Users\\15408\\git\\repository\\SeleniumTraining\\src\\Screenshots\\Pass\\"+d+"Testsnaps.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		this.driver=((Utilities)result.getInstance()).driver;
		Date is=new Date();
    	String d=is.toString().replace(" ", "_").replace(":", "_");
    	System.out.println(d);
    	File sc=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	try {
			org.openqa.selenium.io.FileHandler.copy(sc, new File("C:\\Users\\15408\\git\\repository\\SeleniumTraining\\src\\Screenshots\\Fail\\"+d+"Testsnaps.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
	}
	

}
