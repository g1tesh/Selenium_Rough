package Sel;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel {

	public static void main(String[] args) {
		


		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.id("fromCity")).click();
		
		List <WebElement> list = driver.findElements(By.cssSelector("div#react-autowhatever-1 li"));
		
		for(WebElement e : list)
		{
			System.out.println(e.getText());
		}

	}

}
