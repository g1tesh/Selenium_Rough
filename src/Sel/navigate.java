package Sel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class navigate {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.moneycontrol.com/");
		
		//driver.findElement(By.xpath("moneycontrol.com")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		Actions action = new Actions(driver);
		
		driver.findElement(By.linkText("moneycontrol.com")).click();
		
		driver.findElement(By.className("No thanks")).click();
		
		
		
		
		action.moveToElement(driver.findElement(By.xpath("//li[@class = 'menu_l1']//a[@title = 'News']")));
		
		driver.findElement(By.xpath("//li[@class = ' bold']//a[@title = 'Homepage']")).click();
		
		
	
		
		
	}

}
