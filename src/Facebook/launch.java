package Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prabhu\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
				driver.get("https://www.facebook.com/");
	}

}
