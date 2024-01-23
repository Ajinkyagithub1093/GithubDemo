import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Downloads\\Java Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		// driver.manage().window().maximize(); document.querySelector('.tableFixHead').scrollTop=500
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(5000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");
		List<WebElement> values =  driver.findElements(By.xpath("//div[@class='tableFixHead']/table[@id='product']/tbody/tr/td[4]"));
		int sum = 0;
		for(int i=0;i<values.size();i++)
		{
			System.out.println(Integer.parseInt(values.get(i).getText()));
			sum = sum + Integer.parseInt(values.get(i).getText());
			
		}
		System.out.println(sum);
		int finalsum = Integer.parseInt(driver.findElement(By.cssSelector("div[class='totalAmount']")).getText().split(":")[1].trim());
		Assert.assertEquals(sum, finalsum);

	}

}
