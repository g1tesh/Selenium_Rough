package Sel;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class settlerst {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demoqa.com/books");

		int totalCols = driver.findElements(By.xpath("//div[@class = 'rt-resizable-header-content']")).size();
		int totalRows = driver.findElements(By.xpath("//div[@class = 'rt-tr-group']")).size();

		for (int i = 1; i < totalRows; i++) {
			for (int j = 1; j <= totalCols; j++) {
				String data = driver
						.findElement(
								By.xpath("//div[@class = 'rt-tr-group'][" + i + "]//div[@class = 'rt-td'][" + j + "]"))
						.getText();
				System.out.print(data + "   ");
			}
			System.out.println();
		}

		driver.findElement(By.linkText("Git Pocket Guide")).click();

		String lable1 = driver.findElement(By.id("ISBN-label")).getText();

		List<WebElement> key = driver.findElements(By.xpath("//div[@class = 'col-md-3 col-sm-12']"));
		List<WebElement> value = driver.findElements(By.xpath("//div[@class = 'col-md-9 col-sm-12']"));
		HashMap<String, String> hm = new HashMap();

		for (int i = 0; i < key.size(); i++) {
			hm.put(key.get(i).getText(), value.get(i).getText());
		}
		System.out.println(hm);

		for (Map.Entry<String, String> me : hm.entrySet()) {
			System.out.println("Key =" + me.getKey());
			System.out.println("Value =" + me.getValue());
		}

		
		  if(hm.get("Author :").equals("Richard E. Silverman")) {
		 
		  System.out.println("Expected"); }
		 
		driver.quit();

	}

}
