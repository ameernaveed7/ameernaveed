package ANT;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	
	@Test
	public void test() {
		WebDriver driver1 = new ChromeDriver();
		driver1.get("http://www.google.com");
		System.out.println(driver1.getTitle());
		driver1.close();
		
	}

}
