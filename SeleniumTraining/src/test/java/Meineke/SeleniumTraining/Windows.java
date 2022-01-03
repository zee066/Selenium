package Meineke.SeleniumTraining;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\15408\\git\\repository\\SeleniumTraining\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement window=driver.findElement(By.id("openwindow"));
		window.click();
	
		Set <String> windowhandles=driver.getWindowHandles(); 
		Iterator<String> iterators=windowhandles.iterator();
		String firsthandle= iterators.next();
		String secondhandle= iterators.next();
		System.out.println(firsthandle);
		System.out.println(secondhandle);
		driver.switchTo().window(secondhandle);
		WebElement register=driver.findElement(By.xpath("//*[text()='Register']"));
		register.click();
	}

}
