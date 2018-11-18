package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Assert;
public class SeleniumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isCorrect = false;
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		String title = driver.getTitle();
		if ("google".equalsIgnoreCase(title)) {
			isCorrect = true;
			System.out.println("title is displayed");
		}
		Assert.assertTrue("Test failed", isCorrect);
		driver.close();
	}

}
