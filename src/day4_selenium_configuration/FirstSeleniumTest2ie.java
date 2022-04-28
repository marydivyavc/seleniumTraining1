package day4_selenium_configuration;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class FirstSeleniumTest2ie {

	public static void main(String[] args) {
	
		
System.setProperty("webdriver.ie.driver","D:\\Divya\\selenium_4.1.0_MO\\IEDriverServer.exe");
InternetExplorerDriver driver=new InternetExplorerDriver();

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


