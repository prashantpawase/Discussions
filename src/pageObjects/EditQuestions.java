package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import highlight.highlightElement;

public class EditQuestions 
{

	public static WebElement peditquestions(WebDriver driver)
	{
		
		
		
		    WebElement EdtQ = driver.findElement(By.xpath("//i[@class='glyphicon glyphicon-edit']"));
		    highlightElement.highLightElement(driver, EdtQ);
		    EdtQ.click();
		    
		    
		    WebElement Utitle = driver.findElement(By.xpath("//input[@id='question-title']"));
			highlightElement.highLightElement(driver, Utitle);
		    Utitle.click();
			Utitle.clear();
			Utitle.sendKeys("How to start studying?");
		    
	      
			WebElement Udesc = driver.findElement(By.xpath("//iframe[@id='question-description_ifr']"));
			highlightElement.highLightElement(driver, Udesc);
			Udesc.click();
			Udesc.sendKeys(Keys.CONTROL + "a");
			Udesc.sendKeys(Keys.DELETE);
			Udesc.sendKeys("Studying discussions Questions");
			
			
			WebElement RTopic = driver.findElement(By.xpath("//span[@data-role='remove']"));
			highlightElement.highLightElement(driver, RTopic);
			RTopic.click();
			
			
			WebElement Utopics = driver.findElement(By.xpath("//input[@placeholder='Topics (example: DU, learning, philosophy)']"));
			highlightElement.highLightElement(driver, Utopics);
			Utopics.click();
			Utopics.sendKeys("management");
			
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
	   //     driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[1]/div/div/div/form/div[2]/div/ul/li[4]/a")).click();
			driver.findElement(By.xpath("html/body/div[2]/div[2]/div/div[1]/div/div/div/form/div[2]/div/ul/li[1]/a")).click();
			
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);	
		
			WebElement update = driver.findElement(By.xpath("//button[@type='submit']"));
			highlightElement.highLightElement(driver, update);
			update.click();
			
			
			driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		
			WebElement Verify = driver.findElement(By.xpath("//h4[@class='question-title']"));
		    System.out.println(Verify.getText());
			
			
		return null;
		
	}
	
	
}
