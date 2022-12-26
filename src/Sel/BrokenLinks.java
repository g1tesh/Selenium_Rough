package Sel;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("http://www.deadlinkcity.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(WebElement e : links)
		{
			String singlelink = e.getAttribute("href");
			
			URL url = new URL(singlelink);
			
			try {
				HttpURLConnection http = (HttpURLConnection)url.openConnection();
				if(http.getResponseCode() >=400  )
				{
					System.out.println(http.getResponseCode()+"----"+singlelink);
				}
				
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}

		}

	}

}
