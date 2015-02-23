package loop;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
	static FirefoxDriver fD=new FirefoxDriver();

	public static void main(String[] args) {
		
Support A=new Support(fD);

fD.get("http://eshopper24.com");
A.menuCollection();
	}

}