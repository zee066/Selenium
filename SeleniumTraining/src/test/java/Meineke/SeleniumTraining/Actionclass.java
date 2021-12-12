package Meineke.SeleniumTraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass {
public static WebDriver drivers;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\15408\\git\\repository\\SeleniumTraining\\src\\Drivers\\chromedriver.exe");
drivers=new ChromeDriver();
drivers.navigate().to("https://amazon.com");

drivers.manage().window().maximize();

WebElement sign=drivers.findElement(By.xpath("//*[@id='nav-link-accountList']"));
Actions action=new Actions(drivers);
action.moveToElement(sign).build().perform();
//drivers.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

WebElement Music=drivers.findElement(By.linkText("Music Library"));
action.moveToElement(Music).click().build().perform();
drivers.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
drivers.close();
	}

}
