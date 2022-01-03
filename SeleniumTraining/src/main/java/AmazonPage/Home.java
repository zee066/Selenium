package AmazonPage;
		// In POM WE HAVE TO CREATE SEPARATE CLASS FOR EACH WEBPAGE AND CREATE A 
		//METHOD FOR EACH ELEMENT EXIST IN THAT WEBPAGE 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	public WebDriver driver;
	@FindBy(id ="nav-link-accountList-nav-line-1" ) WebElement sign;//"FindBy" Replaces WebElement sign=driver.findelement(By.id("nav-flyout-ya-signin"));
	
	public Home(WebDriver driver) { //when we need to make a new class we can just copy this constructor
	this.driver=driver;
	PageFactory.initElements(driver, this);
		
	}
	public void Signclick() { //Create a method to perform the action on specified element.
		sign.click();
	}
}
