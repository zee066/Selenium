package Meineke.SeleniumTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dominos2 {
public WebDriver driver;
	
	@FindBy(xpath="//*[@type='submit']") WebElement search;
	
	public Dominos2(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void searchbutton() {
		search.click();	
	}
	
}
