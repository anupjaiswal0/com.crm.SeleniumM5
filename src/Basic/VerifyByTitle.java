package Basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyByTitle {
	public static void main(String[] args) throws InterruptedException {
		String expected_title = "Demo Web Shop";
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/cart");
		String actual_title = driver.getTitle();

		if (actual_title.equals(expected_title)) {
			System.out.println("We're at the right page.");
		} else {
			System.out.println("We're not at the right page.");
		}
		Thread.sleep(2000);
		driver.close();

	}
}
