package stepDefinition;

import io.cucumber.java.en.And;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class First {

	public WebDriver driver;

@Given("open the browser")
public void open_the_browser() {
    WebDriverManager.chromedriver().setup();
     driver = new ChromeDriver();
    driver.get("https://www.google.com/");
}

@And("user on the web page")
public void user_on_the_web_page() {
	driver.findElement(By.name("q")).sendKeys("Selenium");
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
}

@When("Enter text in the search box")
public void enter_text_in_the_search_box() {
    driver.findElement(By.xpath("//*[text()='Selenium']")).click();
}

@Then("Navigate to search result")
public void navigate_to_search_result() {
	System.out.println("closing the browser");
	System.out.println("closing the browser2");
	System.out.println("closing the browser");
	System.out.println("closing the browser");
	driver.close();
	
}

	
	
	
	
	
	
	
	
	
	
	
}
