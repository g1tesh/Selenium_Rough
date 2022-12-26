package Sel;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://testautomationpractice.blogspot.com/?");
		//driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("welcome");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].value = 'welcome'", driver.findElement(By.id("Wikipedia1_wikipedia-search-input")));
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		
		driver.findElement(By.xpath("//a[text() = 'Welcome']")).click();
		
		driver.findElement(By.xpath("//a[text() = 'Welcome Back, Kotter']")).click();
		
		driver.findElement(By.xpath("//a[contains(text() ,'Welcome to Chippendales')]")).click();
		
		Set<String> set = driver.getWindowHandles();
		
		List<String> list = new ArrayList(set);
		
		for(String s : list)
		{	
			driver.switchTo().window(s);
			driver.getTitle();
			if(driver.getTitle().equals("Welcome - Wikipedia"))
			{
				System.out.println("home window");
			}
			else
			{
				driver.close();
			}
		}

	}

}
