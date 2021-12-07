package Meineke.SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ibrowsers {
public static WebDriver  drivers; //web driver is an interface
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\15408\\eclipse-workspace\\SeleniumTraining\\src\\Drivers\\chromedriver.exe");
drivers=new ChromeDriver();// To open the chrome driver
drivers.navigate().to("https://google.com"); // to open a web site in browser
drivers.manage().window().maximize(); // to maximize the browser window
drivers.navigate().refresh(); //to refresh the window
drivers.navigate().back(); //to go backward 
Thread.sleep(2000);
drivers.navigate().forward();// to go forward
Thread.sleep(6000);
drivers.navigate().to("https://facebook.com");
Thread.sleep(5000);
WebElement emailid=drivers.findElement(By.id("email"));// defining the web element
emailid.sendKeys("train2@gmail.com"); // adding the arguments in the element
WebElement password=drivers.findElement(By.id("pass"));// defining the web element 
password.sendKeys("abcd"); // adding the arguments in the element
Thread.sleep(4000);
WebElement forgot=drivers.findElement(By.linkText("Forgot password?"));// use linktext where there is another url link given
forgot.click(); // How to click on the element
WebElement id=drivers.findElement(By.xpath("html/body/div/div/div/div/div/div/div/form/div/div/div/table/tbody/tr/td/input"));
id.sendKeys("540540540");
//Thread.sleep(5000);
//WebElement pass=drivers.findElement(By.id("pass"));
//pass.sendKeys("1234");
Thread.sleep(4000);
//WebElement Cancel=drivers.findElement(By.xpath("html/body/div/div/div/div/div/div/div/form/div/div/div/div/a")); //absolute xpath
//Cancel.click(); //Absolute xpath
WebElement cancel=drivers.findElement(By.xpath("(//a[@role='button'])[1]"));//Relative xpath
cancel.click();
Thread.sleep(4000);
drivers.quit();// To close the browser window
String windowhandle=drivers.getWindowHandle();// Window handle is a unique id of the browser
System.out.println(windowhandle);
String URL=drivers.getCurrentUrl();// To get current url of the browser
System.out.println(URL);
System.out.println("Operation Sucessful");
	}

}
