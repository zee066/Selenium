package Meineke.SeleniumTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Common.Utilities;

public class FacebookSign {
public 	WebDriver driver;

	@FindBy(name="email") WebElement address;
	@FindBy(id="pass") WebElement password;
	//@FindBy(name="login") WebElement login;
	@FindBy (linkText = "Create new account") WebElement create;
	@FindBy(xpath="//*[contains(text(),'Connect with friends')]") WebElement text;
	
	public FacebookSign(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
public void email(String id) {
	address.sendKeys(id);
}
public void passwrd(String d) {
	password.sendKeys(d);
}
//public void log() {
	//login.click();
//}
public void createnew() {
	create.click();
}

public String containstext() {
	String tx=text.getText();
	return tx;
}
	}


