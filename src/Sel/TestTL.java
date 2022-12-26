package Sel;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestTL {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.google.com");	
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@class = 'gLFyf']")).sendKeys("hello");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class = 'mkHrUc']"))));
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@jsname = 'bw4e9b']//li"));
		
		System.out.println(list.size());
		
		
		System.out.println("asda");
		for(WebElement e : list)
		{
			System.out.println(e.getText());
			if(e.getText().equals("hello google"))
			{
				System.out.println("h");
				e.click();
				break;
			}
		}
		
	
		
		
		
		
		
		
		
		

	}

}
