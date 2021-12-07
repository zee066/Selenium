package Meineke.SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1fbsignup {

	public static WebDriver drivers;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\15408\\eclipse-workspace\\SeleniumTraining\\src\\Drivers\\chromedriver.exe");

drivers=new ChromeDriver();

drivers.manage().window().maximize();

drivers.get("https://facebook.com");
Thread.sleep(3000);

WebElement email= drivers.findElement(By.id("email"));
email.sendKeys("train@aol.com");

WebElement pass= drivers.findElement(By.name("pass"));
pass.sendKeys("123123");

Thread.sleep(3000);

WebElement CA=drivers.findElement(By.xpath("//*[text()='Create new account']"));
CA.click();

Thread.sleep(3000);

WebElement fn=drivers.findElement(By.name("firstname"));
fn.sendKeys("john");

WebElement ln=drivers.findElement(By.name("lastname"));
ln.sendKeys("cina");

Thread.sleep(3000);

WebElement mob=drivers.findElement(By.name("reg_email__"));
mob.sendKeys("5401234567");

WebElement pw=drivers.findElement(By.xpath("//*[@name='reg_passwd__']")); // xpath is used for the practice only
pw.sendKeys("123789");

Thread.sleep(2000);

WebElement year=drivers.findElement(By.name("birthday_year"));
Select yr=new Select(year); //select is the class of selenium use for dropdown list
yr.selectByValue("1987");

WebElement month=drivers.findElement(By.name("birthday_month"));
Select mo=new Select(month);
mo.selectByValue("8");

WebElement day=drivers.findElement(By.name("birthday_day"));
Select dy=new Select(day);
dy.selectByValue("27");

WebElement male=drivers.findElement(By.xpath("//input[@value='2']"));
male.click();

Thread.sleep(2000);

WebElement sign=drivers.findElement(By.xpath("//*[@name='websubmit']"));
sign.click();
String winhandle=drivers.getWindowHandle();
System.out.println(winhandle);

String url=drivers.getCurrentUrl();
System.out.println(url);

drivers.quit();
	}

}
