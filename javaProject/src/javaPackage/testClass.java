package javaPackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class testClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "http://demo.guru99.com/test/newtours/";
		driver.get("https://www.google.com/");
		driver.navigate().to(baseUrl);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Google")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
		try {
			driver.get("https://www.facebook.com/");
			driver.findElement(By.id("email")).sendKeys("abc");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement createAccount = driver.findElement(By.xpath("//a[@role='button' and @data-testid='open-registration-form-button']"));
		WebDriverWait explicitWait = new WebDriverWait(driver, 10);
		explicitWait.until(ExpectedConditions.elementToBeClickable(createAccount));
		
		createAccount.click();
		/*
		 * driver.findElement(By.name("birthday_day")).click(); List<WebElement> list =
		 * driver.findElements(By.name("birthday_day")); Iterator<WebElement> iterator =
		 * list.iterator(); for (Iterator iterator; iterator.hasNext();) {
		 * iterator.next( WebElement webElement = (WebElement) iterator.next();
		 * 
		 * }
		 */
		
		
		/*
		 * driver.switchTo().alert().getText(); 
		 * driver.switchTo().alert().accept();
		 */
		driver.close();
	}

}
