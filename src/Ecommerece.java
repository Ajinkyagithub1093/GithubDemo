import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ecommerece {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Downloads\\Java Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot", "Carrot" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		getItemsAdded(driver, itemsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		// driver.findElement(By.xpath("//button[text()='PROCEED TO
		// CHECKOUT']")).click();
		driver.findElement(By.xpath("//div[@class='cart-preview active']/div[@class='action-block']/button")).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("input.promocode")));
		driver.findElement(By.cssSelector("input.promocode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

	}

	public static void getItemsAdded(WebDriver driver, String[] itemsNeeded) {
		int j = 0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
			// Brocolli - 1 Kg
			String formatedName = name[0].trim();
			// convert barray into array list for easy search
			// check whether name you extracted is present in array or not
			List itemsNeededList = Arrays.asList(itemsNeeded);
			if (itemsNeededList.contains(formatedName)) {
				j++;
				// driver.findElements(By.xpath("//button[text()='ADD TO
				// CART']")).get(i).click(); can not rely on ADD to cart text as text will
				// change
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				// break; can not use break if use then it will break if positive
				// if (j == 3) Static condition what if more items are added in array
				// so we use size of array
				// we use size() to get length of arraylist
				// we use lenght() to get length of array
				if (j == itemsNeededList.size()) {
					break;
				}
			}
		}
	}
}
