import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Downloads\\Java Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert a =new SoftAssert();
		for(WebElement link:links)
		{
			String URL = link.getAttribute("href");
			HttpURLConnection conn =(HttpURLConnection)new URL(URL).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int responsecode = conn.getResponseCode();
			System.out.println(responsecode);
			a.assertTrue(responsecode<400, "The link is broken with text "+link.getText()+" with access code "+responsecode);
			/*if(responsecode>400) 
			{
				System.out.println("The link is broken with text "+link.getText()+" with access code "+responsecode);
				Assert.assertTrue(false);
			}*/
		}
		a.assertAll();
		
		
		
		
		
		
		//String URL = driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href"); 200 status code


	}

}
