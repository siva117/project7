package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;



public class Second {

	public WebDriver driver;
	@Given("enter url")
	public void enter_url() {
	   WebDriverManager.chromedriver().setup();
	   
	   driver = new ChromeDriver();
	   driver.get("https://www.google.com/");
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   
	}

	@And("user on the webpage")
	public void user_on_the_webpage() {
	   driver.findElement(By.name("q")).sendKeys("oracle");;
	   driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  
	
	}

	@When("click on element")
	public void click_on_element() {
		
		driver.findElement(By.xpath("//a[text()='India']")).click();
		driver.findElement(By.xpath("//button[@data-navtarget='events']")).click();
	}
	    
	

	@Then("Navigate to the element")
	public void navigate_to_the_element() {
	  driver.close();
	
	
	}
	
	
	
	
	
	
	
	
	
	
}
