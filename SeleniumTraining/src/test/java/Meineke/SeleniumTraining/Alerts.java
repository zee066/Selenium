package Meineke.SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
static WebDriver drivers;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\15408\\eclipse-workspace\\SeleniumTraining\\src\\Drivers\\chromedriver.exe");
drivers=new ChromeDriver();
drivers.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver"); //how to open browser window using .get instead of .navigate
Thread.sleep(3000);	

WebElement al=drivers.findElement(By.name("alert"));
al.click();
Thread.sleep(3000);	

drivers.switchTo().alert().accept(); //function to handle alert popup window
Thread.sleep(3000);	

WebElement conbox=drivers.findElement(By.name("confirmation")); // function to handle alert popup with ok or cancel option
conbox.click();
Thread.sleep(3000);	

drivers.switchTo().alert().dismiss();
Thread.sleep(3000);	

WebElement promp=drivers.findElement(By.name("prompt"));
promp.click();
Thread.sleep(3000);	

drivers.switchTo().alert().sendKeys("i am ready to prompt");
Thread.sleep(3000);	

drivers.switchTo().alert().accept();
Thread.sleep(3000);	
drivers.close();

	
	}

}
