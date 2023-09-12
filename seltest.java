import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selTest2 {

	public static void main(String[] args) {
		
		// Test Data Variables
		
		System.out.println("1. Starting Test.");
		
		System.out.println("2. Launch Chrome Browser.");
		WebDriver myD;

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");

		myD = new ChromeDriver(); // A new chrome session
		myD.manage().window().maximize(); // Maximize
		
		System.out.println("3. Go to AUT");	
		myD.navigate().to("https://www.itelearn.com/");
	
		System.out.println("3. Go to AUT");	
		myD.navigate().to("https://www.google.com/");

		System.out.println("8.Close Browser");
		myD.close();
		System.out.println("9. Done with the Test");	
	}

}
