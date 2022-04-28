package class4Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class ConfigureSeleniumForWebAutomation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Divya\\selenium_4.1.0_MO\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get(" https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		System.out.println("pagesource is as follows:");
		System.out.println(driver.getPageSource());
		System.out.println("Title of the page is :"+ driver.getTitle());
		if (driver.getTitle().contains(("HRM")))
			System.out.println("HRM is present in the title of the page");
		else 
			System.out.println("HRM is not present in the title of the page");
		System.out.println("URL of the page is :"+ driver.getCurrentUrl());
		if (driver.getCurrentUrl().contains("opensource"))
			System.out.println("opensource is present in the url of the page");	
		else 
			System.out.println("opensource is not present in the url of the page");	
		driver.quit();
	}

}
