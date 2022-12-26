package Sel;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multi_Window {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		String mainwind ="";
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://testautomationpractice.blogspot.com/?");
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("welcome");
		System.out.println(driver.getWindowHandle());
		
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		
		driver.findElement(By.xpath("//a[text() ='Welcome']")).click();
		
		driver.findElement(By.linkText("Welcome Back, Kotter")).click();
		
		driver.findElement(By.linkText("Welcome to Flatch")).click();
		
		Set<String> handle = driver.getWindowHandles();
		
		List<String> listhandle = new ArrayList(handle);
		
		for(String s : listhandle)
		{
			driver.switchTo().window(s);
			
			if(driver.getTitle().equals("Automation Testing Practice"))
			{
				mainwind = driver.getWindowHandle();
			}
			else if( driver.getTitle().equals("Welcome - Wikipedia"))
			{	System.out.println(driver.findElement(By.xpath("//span[@class = 'mw-page-title-main']")).isDisplayed());
			driver.close();
				
			}
			else
			{
				driver.close();
			}
		}
		
		driver.switchTo().window(mainwind);
		
		System.out.println("Last "+driver.getWindowHandle());
		driver.findElement(By.xpath("//button[text() = 'Click Me']")).click();
		
		

	}

}
