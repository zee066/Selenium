package Meineke.SeleniumTraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitException {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\15408\\git\\repository\\SeleniumTraining\\src\\Drivers\\chromedriver.exe");
driver=new ChromeDriver();
driver.navigate().to("https://amazon.com");
driver.manage().window().maximize();
Thread.sleep(3000);
WebElement searchbx=driver.findElement(By.id("twotabsearchtextbox"));
searchbx.sendKeys("Christmas Tree");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

WebElement search=driver.findElement(By.id("nav-search-submit-button"));
WebDriverWait obj=new WebDriverWait(driver, 10);
obj.until(ExpectedConditions.elementToBeClickable(search));
search.click();

Thread.sleep(3000);
driver.close();
	}

}
