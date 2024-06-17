package pageobj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
	
	public WebDriver driver;
	public RegisterPage(WebDriver rdriver) {
		driver = rdriver;

		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(linkText = "Register")
	WebElement regs;
	
	@FindBy(id="gender-male")
	WebElement gmale;
	
	@FindBy(id="gender-female")
	WebElement female;
	
	@FindBy(id="FirstName")
	WebElement fname;

	@FindBy(id="LastName")
	WebElement lname;
	
	@FindBy(name = "DateOfBirthDay")
	WebElement date;

	@FindBy(name = "DateOfBirthMonth")
	WebElement month;

	@FindBy(name = "DateOfBirthYear")
	WebElement year;

	@FindBy(name = "Email")
	WebElement email;
	
	@FindBy(id = "Company")
	WebElement Company;

	@FindBy(id = "Password")
	WebElement paswrd;

	@FindBy(id = "ConfirmPassword")
	WebElement cnfpaswrd;

	@FindBy(name = "register-button")
	WebElement regbtn;
	
	//public void Register() {
	//	regs.click();
	//}
	public void Regisbtn() {
		regs.click();
	}

	public void male() {
		gmale.click();
	}

	public void female() {
		female.click();
	}

	public void name(String ffname) {
		fname.sendKeys(ffname);
	}

	public void lastname(String llname) {
		lname.sendKeys(llname);
	}

	public void dob() {
		Select drpDay = new Select(date);
		drpDay.selectByValue("16");

		Select drpmonth = new Select(month);
		drpmonth.selectByValue("5");

		Select drpyear = new Select(year);
		drpyear.selectByValue("2000");
	}

	public void email(String emaill) {
		email.sendKeys("tusharsingh16052000@gmail.com");
	}
	
	public void company(String cname) {
		Company.sendKeys("Tushar interprise");
	
	}

	public void paswrd(String pass1) {
		paswrd.sendKeys("Tushar@43");
	}

	public void cnfpaswrd(String pass2) {
		cnfpaswrd.sendKeys("Tushar@43");
	}

	public void registerbutton() {
		regbtn.click();
	}

}


