import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;





public class TableSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chrome_direct\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();


driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		List<WebElement> secCol = driver.findElements(By.xpath("//tr/td[2]"));
		ArrayList<String> names = new ArrayList<String>();
		
		
	
	for (WebElement secColList : secCol) {

			String abc = secColList.getText();

			names.add(abc);

		}
	
ArrayList<String> copiedList =new ArrayList<String>();


for(int i=0;i<names.size();i++)

{

	copiedList.add(names.get(i));
	
}
//System.out.println(copiedList);
Collections.sort(copiedList);
//System.out.println(copiedList);

for (String abc:copiedList ) {
	System.out.println(abc);
}
	

if(names==copiedList) {
	System.out.print(true);
}
else {
	System.out.print(false);
}

	}
	}
