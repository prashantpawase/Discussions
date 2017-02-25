package ErrorMsg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import highlight.highlightElement;

public class Error 

{
	public static WebElement error(WebDriver driver)
	{
		
		WebElement update = driver.findElement(By.xpath("//button[@type='submit']"));
		highlightElement.highLightElement(driver, update);
		update.click();
		
		
		 WebElement erromsg =  driver.findElement(By.xpath("//span[@class='msg']"));
	     highlightElement.highLightElement(driver, erromsg);
		 String txt = erromsg.getText();
	        
	     
	     
	      if(txt.equals("Question has been updated"))
	       {
	         System.out.println("\033[32;1;2mtrue");
	         System.out.println("\033[32;1;2mSuccess Message\033[0m ---> " + erromsg.getText());
/*
	       }
	       else
	       {
	        
	    	System.out.println("false");
	        System.out.println("\033[31;1mError Message\033[0m ---> " + erromsg.getText());
	        }
		
*/			
		
		Actions act = new Actions(driver);
	    act.keyUp(Keys.LEFT_CONTROL).keyDown(Keys.LEFT_SHIFT).perform();
/*
	    String WindowHandl = driver.getWindowHandle();
	    driver.switchTo().window(WindowHandl);
*/
	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    
	    WebElement Verify = driver.findElement(By.xpath("//h4[@class='question-title']"));
	    System.out.println(Verify.getText());
	    
	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
/*	    
	    String WindowHandl = driver.getWindowHandle();
	    driver.switchTo().window(WindowHandl);
*/	    
	    
	  
	    
	    
	       }
	       else
	       {
	        
	    	System.out.println("\033[31;1mfalse\033[0m");
	        System.out.println("\033[31;1mError Message\033[0m ---> " + erromsg.getText());
	        
	        driver.close();
	        
	        driver.navigate().to("http://www.edunuts.com/discussions");
	      
	        
	       }
		
	
	
	return null;
	}
}
