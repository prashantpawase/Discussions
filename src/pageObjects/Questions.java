package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import ErrorMsg.Error;
import highlight.highlightElement;

public class Questions 
{

	public static WebElement pquestions(WebDriver driver) throws InterruptedException
	{
		/*
		    WebElement askQ = driver.findElement(By.xpath("//a[@data-target='#askQuestion']"));
		    askQ.click();
		 */   
		    WebElement askQ = driver.findElement(By.xpath("//a[@data-action='ask-question']"));
		    highlightElement.highLightElement(driver, askQ);
		    askQ.click();
		    
	    
		    Actions act = new Actions(driver);

			act.keyDown(Keys.LEFT_CONTROL).keyDown(Keys.LEFT_SHIFT).perform();
			
			WebElement title = driver.findElement(By.xpath("//input[@id='question-title']"));
			highlightElement.highLightElement(driver, title);
			title.click();
			title.sendKeys("What you think about Education in India ?");
			
			WebElement ds = driver.findElement(By.xpath("//input[@id='question-title']"));
			highlightElement.highLightElement(driver, ds);
			ds.click();
			ds.sendKeys(Keys.TAB);
			
		  
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			WebElement desc = driver.findElement(By.xpath("//iframe[@id='question-description_ifr']"));
			highlightElement.highLightElement(driver, desc);
			desc.click();
			desc.sendKeys("Education in India");
			
			
			WebElement topics = driver.findElement(By.xpath("//input[@placeholder='Topics (example: DU, learning, philosophy)']"));
			highlightElement.highLightElement(driver, topics);
			topics.click();
			topics.sendKeys("education");
			
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
	//		driver.findElement(By.xpath("html/body/div[2]/div/div/form/div[1]/div[2]/ul/li[3]/a/strong")).click();
			driver.findElement(By.xpath("html/body/div[3]/div/div/form/div[1]/div[2]/ul/li[1]/a")).click();
			
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			/*
			driver.findElement(By.xpath("html/body/div[2]/div/div/div/p")).click();
			
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			*/
		
			
			Error.Qerror(driver);
			
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
	/*		
			WebElement Submit = driver.findElement(By.xpath("//button[@type='submit']"));
			highlightElement.highLightElement(driver, Submit);
			Submit.click();
		
			
    		 WebElement erromsg =  driver.findElement(By.xpath("//span[@class='msg']"));
		     highlightElement.highLightElement(driver, erromsg);
    		 String txt = erromsg.getText();
		        
		     
		     
		      if(txt.equals("Question posted successfully"))
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
			Thread.sleep(1000);
			
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
		/*    
		       }
		       else
		       {
		        
		    	System.out.println("\033[31;1mfalse\033[0m");
		        System.out.println("\033[31;1mError Message\033[0m ---> " + erromsg.getText());
		        
		        driver.close();
		        
		        driver.navigate().to("http://www.edunuts.com/discussions");
		        
		       }
		    
	*/	    
		return null;
		
		       
		
	}
}
