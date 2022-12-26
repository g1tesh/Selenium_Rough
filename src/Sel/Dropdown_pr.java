package Sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_pr {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		driver.manage().window().maximize();
		
		Select select = new Select(driver.findElement(By.cssSelector("select#first")));
		
		List<WebElement> list1 = driver.findElements(By.cssSelector("select#first"));
		
		for(WebElement e1: list1)
		{
			System.out.println(e1.getText());
		}
		
		select.selectByVisibleText("Iphone");
		
		List<WebElement> list = driver.findElements(By.cssSelector("ul.dropdown-menu li"));
		
		for(WebElement e : list)
		{
			System.out.println("list"+e.getText());;
		}
		
		driver.findElement(By.xpath("//select[@id = 'second']//option[@value = 'donut']")).click();
		
		System.out.println("Done");

		
		
		
		

	}

}
