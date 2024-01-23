import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name = "Ajinkya";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\Java Selenium\\chromedriver-win64\\chromedriver.exe");		
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 String Finalpwd = getpassword(driver);
		 driver.get("https://rahulshettyacademy.com/locatorspractice/");
		 driver.findElement(By.id("inputUsername")).sendKeys(name);
		 driver.findElement(By.name("inputPassword")).sendKeys(Finalpwd);
		 driver.findElement(By.className("signInBtn")).click(); //p.error
		 Thread.sleep(2000);
		 System.out.println(driver.findElement(By.tagName("p")).getText());
		 Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		 Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+name+",");
		 driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		 driver.close();

	}
	
	public static String getpassword(WebDriver driver) throws InterruptedException {
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		 driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		 String pwd = driver.findElement(By.cssSelector("form p")).getText();
		 //Please use temporary password 'rahulshettyacademy' to Login.
		 String [] password = pwd.split("'");
		 //0th index = Please use temporary password 
		 //1st index = rahulshettyacademy' to Login.
		 String [] password2 = password[1].split("'");
		 String password3 = password2[0];
		 return password3;
		
	}

}
