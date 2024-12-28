package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.name("q")).sendKeys("Physics");
//	driver.findElement(By.)
	}
}
