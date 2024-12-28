package Basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class StartUpProgram {
	public static void main(String[] args) {
//		Open the Browser
		ChromeDriver driver = new ChromeDriver();
		try {
//			Maximize the browser
//			driver.manage().window().fullscreen();
			driver.manage().window().maximize();
//			Enter URL
			driver.get("https://demowebshop.tricentis.com/");
			Thread.sleep(3000);
			
		}catch(InterruptedException e) {
			e.getMessage();
		} finally {
			// TODO: handle finally clause
//			Close the Browser
			driver.close();
		}
	}
}
