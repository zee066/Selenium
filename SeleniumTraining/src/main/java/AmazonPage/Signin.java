package AmazonPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin {
	public WebDriver driver;
	@FindBy(name ="email") WebElement mail;
	@FindBy(id="continue") WebElement contbutton;
	
	public Signin(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void emailaddress() {
		mail.sendKeys("train@gmail.com");
	}
	public void button() {
		contbutton.click();
	}

}
