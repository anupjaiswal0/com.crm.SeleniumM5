package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.name("q")).sendKeys("Iphone 16 Pro Max");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='Search']")).click();
	}
}