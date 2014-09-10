package ANT;



import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo {

	
	@Test
	public void test1() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.yahoo.com");
		System.out.println(driver.getTitle());
		driver.close();

	}
}
