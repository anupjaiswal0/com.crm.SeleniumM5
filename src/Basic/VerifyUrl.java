package Basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrl {
	public static void main(String[] args) throws InterruptedException {
		
		String expected_url = "https://demowebshop.tricentis.com/";
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://demowebshop.tricentis.com/cart");
		String actual_url = driver.getCurrentUrl();
		
		if(expected_url.equals(actual_url)) {
			System.out.println("I'm in the dws page");
		}else {
			System.out.println("I'm not in the dws page");
		}
		
		Thread.sleep(2000);
		driver.close();
	}

}
