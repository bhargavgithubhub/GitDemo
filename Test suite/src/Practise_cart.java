import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Practise_cart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String [] Items= {"Cucumber","Pista","Walnuts","Potato","Pumpkin"};
		List <String> Itemsneed=Arrays.asList(Items);
		
		
		System.out.println(Itemsneed);
		System.setProperty("webdriver.chrome.driver", "C:\\chrome_direct\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);

		List <WebElement> path=driver.findElements(By.xpath("//h4[@class='product-name']"));
		
		//driver.findElements(By.xpath("//button[contains(text(),'ADD TO CART')]")).get(0).click();
		//System.out.println(names.size());
		int j=0;	
	for(int i=0; i<=path.size();i++) {
		//System.out.println(Practise_section.getText());
		 String[] names=path.get(i).getText().split("-");
					//String[] name=products.get(i).getText().split("-");
		String formatted= names[0].trim();
		 
		
		
	
		
		if(Itemsneed.contains(formatted)) {
			System.out.println(formatted);
			//driver.findElements(By.xpath("//button[contains(text(),'ADD TO CART')]")).get(i).click();
			driver.findElements(By.xpath("//div[@class='product-action']//button[@type='button']")).get(i).click();
			j++;
		}

	}

	}

}
