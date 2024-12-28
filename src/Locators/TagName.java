package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {
	public static void main(String[] args) throws InterruptedException {
		String expected_url = "https://demowebshop.tricentis.com/";

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		Thread.sleep(1000);

		driver.get("https://demowebshop.tricentis.com");

		String actual_url = driver.getCurrentUrl();
		if (expected_url.equals(actual_url)) {
			WebElement search_fields = driver.findElement(By.tagName("inputp"));

			search_fields.sendKeys("Iphone 16 Pro Max");
		} else {
			System.out.println("URL  Not Found");
		}
		Thread.sleep(3000);
		driver.close();
		System.out.println("Good Morning");
	}
}
