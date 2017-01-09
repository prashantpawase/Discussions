package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Answers
{

	public static WebElement panswers(WebDriver driver)
	{

	    WebElement dis = driver.findElement(By.xpath("h4[@class='question-title'"));
	    dis.click();
	    
	    WebElement Wans = driver.findElement(By.xpath("//a[@data-target='#answer-question']"));
	    Wans.click();
	    
	    
	    Actions actt = new Actions(driver);

		actt.keyDown(Keys.LEFT_CONTROL).keyDown(Keys.LEFT_SHIFT).perform();
	    
	    WebElement ans = driver.findElement(By.xpath("//iframe[@id='answer-description_ifr']"));
	    ans.click();
	    ans.sendKeys("Testing Testing Testing Testing");
		
	    WebElement submit = driver.findElement(By.xpath("//button[@type'submit']"));
	    submit.click();
		
		actt.keyUp(Keys.LEFT_CONTROL).keyDown(Keys.LEFT_SHIFT).perform();
	    
	    WebElement span = driver.findElement(By.xpath("html/body/header/div/div/div[2]/div/a/span"));
	    span.click();
	    
	    driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		return span;
	}
	
}
