import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class selfintroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\Java Selenium\\chromedriver-win64\\chromedriver.exe");		
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com");
		 System.out.println(driver.getTitle());
		 System.out.println(driver.getCurrentUrl());
		 driver.close(); //only current window/tab closed
		 //driver.quit(); //close all tabs assosciated
	}

}
