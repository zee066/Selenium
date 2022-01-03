package Meineke.SeleniumTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dominos3 {
public WebDriver driver;

	@FindBy(xpath = "(//*[@data-type='Carryout'])[6]") WebElement location;
	
	public Dominos3(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void locationtab() {
		location.click();
	}
}

