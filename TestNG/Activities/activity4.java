package Testng_project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class activity4 {
	WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://alchemy.hguy.co/jobs/");
    }

  @Test
   public void testCase1() {
	  WebElement pElement = driver.findElement(By.tagName("h2"));
	  System.out.println(pElement.getText());	
  }

  @AfterMethod
  public void afterMethod() {
      //Close the browser
      driver.quit();
  }

}
