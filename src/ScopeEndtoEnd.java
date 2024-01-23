import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ScopeEndtoEnd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Downloads\\Java Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// 1. How many links are present in a page
		System.out.println(driver.findElements(By.tagName("a")).size()); // (tag should be 'a')
		// 2. How many links are present in a footer section
		WebElement footerdriver = driver.findElement(By.id("gf-BIG")); // (limiting main driver to sub driver)
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		// 3. How many links are present in a first column of footer section
		WebElement columndriver = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul")); // (limiting main driver to
																								// sub driver)
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		// Click on each link and check link are opening
		//for loop used to open all links in new tab 
		for (int i = 1; i < columndriver.findElements(By.tagName("a")).size(); i++) {
			String clickonlink = Keys.chord(Keys.CONTROL, Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
			Thread.sleep(5000L);
		}
		//// switching between parent to child window
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();
		//while loop is used to move other tab and get title
		while (it.hasNext()) { //hasnext represents item(new window/tab) present or not
			driver.switchTo().window(it.next()); //next() represents to move next open tab
			System.out.println(driver.getTitle());
		}

	}

}
