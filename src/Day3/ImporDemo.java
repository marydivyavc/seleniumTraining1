package Day3;

import P1.Selenium_1;

public class ImporDemo {

	public static void main(String[] args) {

		Selenium_1 s = new Selenium_1();
		s.automate();
		s.automateAPI();
		Selenium_1.crossBrowser();
		Selenium_1.crossPlatform();
		System.out.println(Selenium_1.version);
	}

}
