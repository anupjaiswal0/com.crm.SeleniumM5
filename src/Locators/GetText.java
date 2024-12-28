package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);

//	WebElement register = driver.findElement(By.className("ico-register"));
//	System.out.println(register.getText());

		WebElement element = driver.findElement(By.partialLinkText("Community poll"));
		System.out.println(element.getText());
		Thread.sleep(2000);
		driver.close();
	}
}
