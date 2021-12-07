package Meineke.SeleniumTraining;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ilocators {
static WebDriver drivers;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\15408\\eclipse-workspace\\SeleniumTraining\\src\\Drivers\\chromedriver.exe");
		
		drivers=new ChromeDriver();// To open the chrome driver
		
		//drivers.navigate().to("http://www.amazon.com");
		
		//WebElement txt=drivers.findElement(By.id("twotabsearchtextbox"));
		//txt.sendKeys("shoes for men");
		//WebElement sr=drivers.findElement(By.id("nav-search-submit-button"));
		//sr.click();
		
	    //drivers.navigate().refresh();
		Thread.sleep(5000);
		
	    drivers.navigate().to("https://facebook.com");
		
		WebElement email=drivers.findElement(By.name("email"));
		email.sendKeys("train@gmail.com");
		
		Thread.sleep(3000);
		
		WebElement clicks=drivers.findElement(By.xpath("//*[text()='Create new account']"));
		clicks.click();
		Thread.sleep(6000);
		
		WebElement fname=drivers.findElement(By.xpath("//*[@name='firstname']"));
		fname.sendKeys("zeeshan");
		
		Thread.sleep(6000);
		
		WebElement lname=drivers.findElement(By.name("lastname"));
		lname.sendKeys("ali");
		
		WebElement signup=drivers.findElement(By.name("websubmit"));
		signup.click();
		
		Thread.sleep(3000);
		
		WebElement mob=drivers.findElement(By.name("reg_email__"));
		mob.sendKeys("540540540");
		
		WebElement pass=drivers.findElement(By.xpath("//*[@name='reg_passwd__']"));
		pass.sendKeys("123123");
		/*WebElement text=drivers.findElement(By.id("twotabsearchtextbox"));
		text.sendKeys("purses");
		WebElement search=drivers.findElement(By.id("nav-search-submit-button"));
		search.click();
		Thread.sleep(4000);
		WebElement deals=drivers.findElement(By.partialLinkText("Cyber Monday"));// use partiallinktext where we can use only partial url link name
		deals.click();
		Thread.sleep(3000);
		String handle=drivers.getWindowHandle();
		System.out.println(handle);
	System.out.println("Operation Successful");
	drivers.close();*/
	}

}
