package Basic;

//import java.io.InterruptedIOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lunch {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.geeksforgeeks.org/");
		try {
			driver.get("https://www.selenium.dev/");
			String pageTitle = driver.getTitle();
			
			System.out.println("Page Title : "+pageTitle);
			Thread.sleep(3000);
		}catch(InterruptedException ie) {
			ie.getStackTrace();
		}finally {
			driver.close();
		}
	}

}
