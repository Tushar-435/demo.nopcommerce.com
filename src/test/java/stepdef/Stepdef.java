package stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobj.RegisterPage;

public class Stepdef {
	
	WebDriver driver;
	
	RegisterPage r;
	
	@Given("user Launch Chrome Browser")
	public void user_launch_chrome_browser() {
		//WebDriverManager.edgedriver().setup();
		//WebDriver driver = new EdgeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		r =new RegisterPage(driver);
	    
	}

	@When("User opens url {string}")
	public void user_opens_url(String url) throws InterruptedException {
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	    
	}
 
	@When("User click on register")
	public void user_click_on_register() throws InterruptedException  {
		Thread.sleep(2000);
		r.Regisbtn();
	    
	}

	@When("User is select Gender Option")
	public void user_is_select_gender_option() throws InterruptedException {
		Thread.sleep(3000);
		r.male();
	    
	}

	@When("User is fill First Name")
	public void user_is_fill_first_name() throws InterruptedException {
		Thread.sleep(3000);
		r.name("Tushar");
	    
	}

	@When("User is fill Second Name")
	public void user_is_fill_second_name() throws InterruptedException {
		Thread.sleep(3000);
		r.lastname("Singh");
	    
	}

	@When("user is DOB")
	public void user_is_dob() throws InterruptedException {
		Thread.sleep(3000);
		r.dob();
		
	    
	}

	@When("user is fill email")
	public void user_is_fill_email() throws InterruptedException {
		Thread.sleep(3000);
		r.email("tusharsingh16052000@gmail.com");
	    
	}

	@When("user is fill Company name")
	public void user_is_fill_company_name() throws InterruptedException {
		Thread.sleep(4000);
		r.company("Tushar");
	    
	}

	@When("user is fill Pswrd")
	public void user_is_fill_pswrd() throws InterruptedException {
		Thread.sleep(3000);
		r.paswrd("Tushar@43");
	    
	}

	@When("user is fill ConfPswrd")
	public void user_is_fill_conf_pswrd() throws InterruptedException {
		Thread.sleep(3000);
		r.cnfpaswrd("Tushar@43");
	   
	}

	@When("user is click on Register button")
	public void user_is_click_on_register_button() throws InterruptedException {
		Thread.sleep(3000);
		r.registerbutton();
	    
	}

	@Then("User is sucessfully register")
	public void user_is_sucessfully_register() throws InterruptedException {
		Thread.sleep(000);
	    
	}

	@When("user is click on logout link")
	public void user_is_click_on_logout_link() throws InterruptedException {
		Thread.sleep(2000);
	    
	}

	@When("Close the Browser")
	public void close_the_browser() {
		driver.close();
	    
	}
}
