package Meineke.SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2papajones {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\15408\\eclipse-workspace\\SeleniumTraining\\src\\Drivers\\chromedriver.exe");
driver=new ChromeDriver();
driver.get("https://www.papajohns.com/");
Thread.sleep(3000);

driver.manage().window().maximize();
Thread.sleep(3000);

WebElement mn=driver.findElement(By.xpath("(//a[@class='nav-main-link '])[1]"));
mn.click();
Thread.sleep(3000);

WebElement pizza=driver.findElement(By.xpath("//*[@aria-label='Extra Cheesy Alfredo Pizza Order Now ']"));
pizza.click();
Thread.sleep(3000);

WebElement addtype=driver.findElement(By.name("locationType"));
Select obj=new Select(addtype);
obj.selectByVisibleText("Business");
Thread.sleep(3000);

WebElement address=driver.findElement(By.id("autocomplete"));
address.sendKeys("6678 Hot spring lane");
Thread.sleep(3000);

WebElement zcode=driver.findElement(By.name("zipcode"));
zcode.sendKeys("22407");
Thread.sleep(3000);

WebElement submit=driver.findElement(By.xpath("(//*[@value='Submit'])[1]"));
submit.click();
Thread.sleep(3000);
//driver.close();
 }

}
