package day4_selenium_configuration;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest2Chrome {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","D:\\Divya\\selenium_4.1.0_MO\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.get("http://www.google.com");
System.out.println("Title of thepage is "+ driver.getTitle());
System.out.println("Current URL is"+ driver.getCurrentUrl());	
driver.get("http://www.yahoo.com");
System.out.println("Title of thepage is "+ driver.getTitle());
System.out.println("Current URL is"+ driver.getCurrentUrl());	
driver.quit();

	}
}


