import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Downloads\\Java Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Thread.sleep(5000);
		driver.get("https://www.path2usa.com/travel-companions/");
		//WebElement calender = driver.findElement(By.cssSelector("div[class='elementor-column elementor-col-100 elementor-inner-column elementor-element elementor-element-7a51525 search-for-outer']"));
		System.out.println(driver.findElement(By.cssSelector("input[id='form-field-travel_comp_date']")).getText());
		driver.findElement(By.cssSelector("input[id='form-field-travel_comp_date']")).click();
		
		List<WebElement> dates = driver.findElements(By.cssSelector("span[class*='-day']"));
		int count = driver.findElements(By.cssSelector("span[class*='-day']")).size();
		for(int i=0;i<count;i++)
		{
			String text = driver.findElements(By.cssSelector("span[class*='-day']")).get(i).getText();
			if(text.equalsIgnoreCase("28"))
			{
				driver.findElements(By.cssSelector("span[class*='-day']")).get(i).click();
			}
		}
		

	}

}
