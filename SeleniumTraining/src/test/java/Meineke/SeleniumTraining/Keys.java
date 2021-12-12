package Meineke.SeleniumTraining;

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
		WebElement searchbar=driver.findElement(By.id("twotabsearchtextbox"));
		searchbar.sendKeys("computers");
		Actions action=new Actions(driver);
		action.keyDown(org.openqa.selenium.Keys.CONTROL).sendKeys("a").keyUp(org.openqa.selenium.Keys.CONTROL).build().perform();
		action.keyDown(org.openqa.selenium.Keys.CONTROL).sendKeys("c").build().perform();
		Thread.sleep(3000);
		
		searchbar.clear();
		Thread.sleep(3000);
		searchbar.click();
		Thread.sleep(3000);
		action.keyDown(org.openqa.selenium.Keys.CONTROL).sendKeys("v").build().perform();
	    WebElement search=driver.findElement(By.id("nav-search-submit-button"));
	    search.click();
		Thread.sleep(15000);
		
		driver.quit();
	 
	
	}

}
