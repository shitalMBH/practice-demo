package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Mbh {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shitalr\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.setBinary("C:\\Users\\shitalr\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.google.com");
//		driver.get("https://qa.mybloodhealth.com/login");
		
	}

}
 