package Meineke.SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendershandling {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\15408\\eclipse-workspace\\SeleniumTraining\\src\\Drivers\\chromedriver.exe");
driver=new ChromeDriver();
driver.get("https://www.expedia.com");
Thread.sleep(3000);

driver.manage().window().maximize();
Thread.sleep(6000);

WebElement flights=driver.findElement(By.xpath("(//*[@class='uitk-tab-text'])[2]"));
flights.click();
Thread.sleep(3000);

WebElement calender=driver.findElement(By.xpath("//*[@data-name='d1']"));
calender.click();
Thread.sleep(3000);

WebElement date=driver.findElement(By.xpath("(//*[@data-day='28'])[1]"));
date.click();
Thread.sleep(3000);

WebElement done=driver.findElement(By.xpath("(//*[text()='Done'])[2]"));
done.click();
Thread.sleep(3000);

WebElement going=driver.findElement(By.xpath("//*[@aria-label='Going to']"));
going.click();
Thread.sleep(3000);

WebElement whereto=driver.findElement(By.id("location-field-leg1-destination"));
whereto.sendKeys("Orlando ");
Thread.sleep(6000);

WebElement click=driver.findElement(By.id("location-field-leg1-destination"));
click.click();
Thread.sleep(3000);

/*WebElement from=driver.findElement(By.xpath("//*[@data-stid='location-field-leg1-origin-menu-trigger']"));
from.click();
Thread.sleep(3000);

WebElement search=driver.findElement(By.xpath("(//*[@type='submit'])[1]"));
search.click();
Thread.sleep(3000);*/

driver.close();
	}

}
