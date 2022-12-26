package Sel;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drop_Down_WOselelct {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\drivers\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		

		List<WebElement> list = driver.findElements(By.xpath("//select[@id = 'input-country']//option"));
		
		for(WebElement e : list)
		{
			if(e.getText().equals("India"))
			{
				e.click();
			}
			
		}
		
	}

}
