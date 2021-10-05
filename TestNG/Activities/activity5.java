package Testng_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class activity5 {
	
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
		  WebElement element = driver.findElement(By.linkText("Jobs"));
		  element.click();
		       String title = driver.getTitle();
		        System.out.println("Page title is: " + title);
		        AssertJUnit.assertEquals("Jobs – Alchemy Jobs", title);
		                    
		      	    }
		  
	  
	  

	  @AfterMethod
	  public void afterMethod() {
	      //Close the browser
	      driver.quit();
	  }

	}
  
