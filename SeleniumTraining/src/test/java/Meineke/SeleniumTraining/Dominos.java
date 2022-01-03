package Meineke.SeleniumTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dominos {
public WebDriver driver;

	@FindBy(xpath="(//*[@class='css-xkd0lx'])[2]") WebElement Carry;
	@FindBy(xpath="(//*[@aria-hidden='true'])[16]") WebElement cancel;

	public Dominos(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
   public void cancelbutton() {
	   cancel.click();
   }
	
	public void carryouttab() {
	Carry.click();
}
}