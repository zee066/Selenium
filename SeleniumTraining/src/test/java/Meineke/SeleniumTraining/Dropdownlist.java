package Meineke.SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownlist {
public static WebDriver drivers;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\15408\\eclipse-workspace\\SeleniumTraining\\src\\Drivers\\chromedriver.exe");
drivers=new ChromeDriver();
drivers.navigate().to("https://facebook.com");
Thread.sleep(3000);

WebElement ca=drivers.findElement(By.linkText("Create new account"));
ca.click();
Thread.sleep(3000);

WebElement mo=drivers.findElement(By.name("birthday_month"));
Select ob=new Select(mo);
ob.selectByVisibleText("Jan");

WebElement day=drivers.findElement(By.name("birthday_day"));
Select dy=new Select(day);
dy.selectByValue("24");

WebElement year=drivers.findElement(By.name("birthday_year"));
Select yr=new Select(year);
yr.selectByValue("1987");
Thread.sleep(3000);

WebElement sex=drivers.findElement(By.xpath("//input[@value='2']"));
sex.click();


}
	

}
