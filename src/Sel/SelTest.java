package Sel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelTest {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.findElement(By.xpath("//a[text() = 'Log in']")).click();
		
		driver.findElement(By.className("email")).sendKeys("Gitesh@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Gitesh_123");
		driver.findElement(By.xpath("//button[text() = 'Log in']")).click();
		
		
		

	}

}
