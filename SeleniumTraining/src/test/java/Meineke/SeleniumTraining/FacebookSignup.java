package Meineke.SeleniumTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignup {
public WebDriver driver;

	@FindBy(name="firstname") WebElement first;
	@FindBy (name="lastname") WebElement last;
	@FindBy (name="reg_email__") WebElement mob;
	@FindBy (name="reg_passwd__") WebElement npass;
	@FindBy (name="birthday_month") WebElement bdaymonth;
	@FindBy (name="birthday_day") WebElement bday;
	@FindBy (name="birthday_year")WebElement byear;
	@FindBy (xpath="(//*[@name='sex'])[2]") WebElement sex;
	public FacebookSignup(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void firstname() {
		first.sendKeys("peter");
	}
	public void lastname() {
		last.sendKeys("johnson");
	}
	public void mobile() {
		mob.sendKeys("540548542");
	}
	public void newpassword() {
		npass.sendKeys("wizjiz");
	}
	//public void month() {
		//bdaymonth.click();
	//}
	public void mdrop() {
		Select mo=new Select(bdaymonth);
		mo.selectByVisibleText("Feb");
	}
	//public void bdate() {
	//bday.click();	
	//}
	public void datedrop() {
		Select dt=new Select(bday);
		dt.selectByValue("24");
	}
	//public void year() {
	//	byear.click();
	//}
	public void yeardrop() {
		Select yr=new Select(byear);
	    yr.selectByValue("1992");
	}
	public void gender() {
		sex.click();
	}
}


