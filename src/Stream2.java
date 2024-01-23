import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Stream2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Downloads\\Java Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		// click on column
		Thread.sleep(3000);
		driver.findElement(By.xpath("//th[@role='columnheader'][1]")).click();
		// collect webelements
		List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
		// collect text from webelements
		List<String> originalList = rows.stream().map(s -> s.getText()).collect(Collectors.toList());
		// sort original list in ascending order
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		Assert.assertTrue(sortedList.equals(originalList));
		System.out.println(originalList);
		System.out.println(sortedList);
		List<String> price;
		// print price of vegetable
        do 
        {
        	
        List<WebElement> list = driver.findElements(By.xpath("//tr/td[1]"));
		price = list.stream().filter(s -> s.getText().contains("Strawberry")).map(s -> getPriceveggie(s))
				.collect(Collectors.toList());
		price.forEach(a -> System.out.println(a));
		if(price.size()<1)
		{
			driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
		}}while(price.size()<1);

	}

	private static String getPriceveggie(WebElement s) {
		// TODO Auto-generated method stub
		String Pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return Pricevalue;
	}

}
