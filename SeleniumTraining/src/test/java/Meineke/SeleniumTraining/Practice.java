package Meineke.SeleniumTraining;

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
driver.navigate().to("https://www.amazon.com/");
driver.manage().window().maximize();
Thread.sleep(3000);
//driver.navigate().refresh();
String obj=driver.getWindowHandle();
System.out.println(obj);
String title=driver.getTitle();
System.out.println(title);
Thread.sleep(3000);
WebElement list=driver.findElement(By.xpath("//*[@id='nav-link-accountList-nav-line-1']"));
Actions sign=new Actions(driver);
sign.moveToElement(list).build().perform();
Thread.sleep(3000);

WebElement music=driver.findElement(By.linkText("Music Library"));
sign.moveToElement(music).build().perform();


//WebElement cal=driver.findElement(By.id("d1-btn"));
//cal.click();
Thread.sleep(3000);
driver.close();
	}

}
