import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Parents sibling //
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\Java Selenium\\chromedriver-win64\\chromedriver.exe");		
		 WebDriver driver = new ChromeDriver();
		//header/div/button[1]/following-sibling::button[1]
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		//header/div/button[1]/parent::div/button[1]
		 System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[1]")).getText());
		 driver.close();

	}

}
