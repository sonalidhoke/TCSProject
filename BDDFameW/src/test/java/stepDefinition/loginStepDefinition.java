package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class loginStepDefinition {
	WebDriver driver; 
	
	@Given("^User is allready on login page$")
	public void User_is_allready_on_login_page() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Documents\\sonaliD\\selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@When("^title of login page is facebook$")
	public void title_of_login_page_is_facebook() {
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("facebook", title);
	}
	
	
	@Then("user enters username and password")
	public void user_enters_username_and_password() {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sonali");
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("12345");
	}

	@Then("user click on login button")
	public void user_click_on_login_button() {
		WebElement loginbtn=driver.findElement(By.xpath("//button[@name='login']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("argument[0].click():", loginbtn);
	}
	@Then("^user is on home page$")
	public void user_is_on_home_page() {
		String title=driver.getTitle();
		System.out.println("Home page title::");
		Assert.assertEquals("Facebook", title);
	}

}
