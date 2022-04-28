package day4_selenium_configuration;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumTest2fFireFox {

	public static void main(String[] args) {
		
System.setProperty("webdriver.gecko.driver","D:\\Divya\\selenium_4.1.0_MO\\geckodriver.exe");
FirefoxDriver driver=new FirefoxDriver();

driver.get("http://www.google.com");

System.out.println("Title is "+driver.getTitle());

System.out.println("Title is "+driver.getCurrentUrl());

driver.get("http://www.yahoo.com");

System.out.println("Title is "+driver.getTitle());

System.out.println("Title is "+driver.getCurrentUrl());

driver.get("http://www.facebook.com");

System.out.println("Title is "+driver.getTitle());

System.out.println("Title is "+driver.getCurrentUrl());

driver.get("http://www.twitter.com");

System.out.println("Title is "+driver.getTitle());

System.out.println("Title is "+driver.getCurrentUrl());

driver.quit();

	}
}


