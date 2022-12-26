package Sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Search_Suggestions {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@name = 'q']")).sendKeys("Tech Mahindra");
		
		Thread.sleep(1000);

		List <WebElement> list = driver.findElements(By.xpath("//ul[@jsname = 'bw4e9b']//li"));
		
		
		System.out.println(list.size());
		
		list.get(1).click();
		
		

	}

}
