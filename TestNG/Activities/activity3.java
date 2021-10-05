package Testng_project;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.ConcurrentModificationException;
import java.util.List;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

@Test
public class activity3 {

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
	        WebElement heading = driver.findElement(By.className("entry-title"));
	        System.out.println(heading.getText());	
	    	List<WebElement> links=driver.findElements(By.tagName("img"));
	    	    // this will display list of all images exist on page
	    	        for(WebElement ele:links){
	    	            System.out.println(ele.getAttribute("src"));
	    	        }
	   
	            
	   
	    }    
	         

	    @AfterMethod
	    public void afterMethod() {
	        //Close the browser
	        driver.quit();
	    }

	}