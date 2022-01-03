package Meineke.SeleniumTraining;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Practice {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\15408\\git\\repository\\SeleniumTraining\\src\\Drivers\\chromedriver.exe");
driver=new ChromeDriver();
driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
driver.manage().window().maximize();

WebElement open=driver.findElement(By.id("openwindow"));
open.click();
Thread.sleep(3000);

Set<String> handles=driver.getWindowHandles();
Iterator<String> obj=handles.iterator();
String first=obj.next();
String second= obj.next();
System.out.println(first);
System.out.println(second);

driver.switchTo().window(second);
driver.manage().window().maximize();
Thread.sleep(3000);
WebElement regis=driver.findElement(By.xpath("//*[text()='Register']"));
regis.click();
Thread.sleep(3000);
driver.quit();
	}

}
