import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Streams3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Downloads\\Java Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//Thread.sleep(3000);
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		List<WebElement> FirstList = driver.findElements(By.xpath("//tr/td[1]")); //After enter rice in search box, we get list of items which contains rice.
		//In below step, we are filtering again the above got list with rice. 
		//Here we are getting same output as we g
		//Reason to do below filter is that, suppose in 'FirstList'list we get option other than rice for eg (rice, brown rice, wheat) 3 items
		//Below step will filter more deep to get items which only contain rice (rice, brown rice) 2 items which are not equal. So search filed is not working properly.
		List<WebElement> FilteredList = FirstList.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());
		Assert.assertEquals(FirstList, FilteredList);

	}

}
