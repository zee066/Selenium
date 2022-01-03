package Meineke.SeleniumTraining;

import java.security.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keys {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\15408\\git\\repository\\SeleniumTraining\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://amazon.com");
		driver.manage().window().maximize();
		
		WebElement searchbx=driver.findElement(By.id("twotabsearchtextbox"));
		searchbx.sendKeys("Computers");
		Thread.sleep(3000);
		
		Actions action=new Actions(driver);
		action.keyDown(org.openqa.selenium.Keys.CONTROL).sendKeys("a").keyUp(org.openqa.selenium.Keys.CONTROL).perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		action.keyDown(org.openqa.selenium.Keys.CONTROL).sendKeys("x").keyUp(org.openqa.selenium.Keys.CONTROL).perform();
		Thread.sleep(2000);
		
		action.keyDown(org.openqa.selenium.Keys.CONTROL).sendKeys("v").keyUp(org.openqa.selenium.Keys.CONTROL).perform();
		Thread.sleep(2000);
		
		WebElement search=driver.findElement(By.id("nav-search-submit-button"));
		action.moveToElement(search).click().build().perform();
		Thread.sleep(3000);
		driver.quit();
	 
	
	}

}
