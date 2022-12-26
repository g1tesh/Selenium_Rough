package Sel;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class asd {

	public static void main(String[] args) throws InterruptedException {


		
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\drivers\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			//driver.get("https://www.toolsqa.com/selenium-webdriver/selenium-testing/");
			driver.get("https://demo.nopcommerce.com/");
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//WebElement home = driver.findElement(By.xpath("//ul[@class = 'navbar__links d-none d-lg-flex']//a[text() = 'Home']"));
		WebElement home = driver.findElement(By.xpath("//a[@class = 'ico-register']"));
		
		Actions action = new Actions(driver);
		
	//	Thread.sleep(1000);
		
		//driver.findElement(By.id("accept-cookie-policy")).click();
		
		
		//action.contextClick(home).moveByOffset(10,20).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
		//action.contextClick(home).perform();
		 action.contextClick(home) .sendKeys(Keys.ARROW_DOWN) .sendKeys(Keys.ARROW_DOWN) .sendKeys(Keys.RETURN) .build().perform();
		//action.moveToElement(home).doubleClick().keyDown(Keys.LEFT_SHIFT).sendKeys(Keys.F10).keyUp(Keys.LEFT_SHIFT).build().perform();
		//Thread.sleep(1000);
		
		
				
				
				
				
				
		
		//action.sendKeys(Keys.ENTER).sendKeys(Keys.ENTER).perform();
		
		
		
		
		
		
		
		
		
		
	
		
		Set <String> handles = driver.getWindowHandles();
		
		List <String> handellist = new ArrayList(handles);
		
		for(String s : handellist)
		{
			driver.switchTo().window(s);
		
		}
		
		
		
		//action.contextClick(setup).build().perform();
		
		

	}

}
