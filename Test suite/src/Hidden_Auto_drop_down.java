import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Auto_drop_down {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chrome_direct\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ksrtc.in");
		

	}

}
