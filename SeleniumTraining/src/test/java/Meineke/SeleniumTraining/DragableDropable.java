package Meineke.SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragableDropable {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\15408\\git\\repository\\SeleniumTraining\\src\\Drivers\\chromedriver.exe");
driver=new ChromeDriver();
driver.navigate().to("https://jqueryui.com/droppable/");
driver.manage().window().maximize();
Thread.sleep(3000);

driver.switchTo().frame(0);
WebElement drag=driver.findElement(By.id("draggable"));
WebElement drop=driver.findElement(By.id("droppable"));
Actions action=new Actions(driver);
action.dragAndDrop(drag, drop).build().perform();
Thread.sleep(3000);

driver.switchTo().parentFrame();
WebElement dialog=driver.findElement(By.linkText("Dialog"));
dialog.click();
Thread.sleep(3000);

WebElement re=driver.findElement(By.linkText("Resizable"));
action.moveToElement(re).click().perform();
driver.switchTo().frame(0);
Thread.sleep(3000);

WebElement resize=driver.findElement(By.xpath("//*[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
action.dragAndDropBy(resize, 160, 60).build().perform();
driver.switchTo().parentFrame();
Thread.sleep(2000);

WebElement dragg=driver.findElement(By.linkText("Draggable"));
dragg.click();
Thread.sleep(2000);
driver.close();

	}

}
