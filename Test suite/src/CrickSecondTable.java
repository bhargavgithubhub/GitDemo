import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CrickSecondTable {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		System.setProperty("webdriver.chrome.driver", "C:\\chrome_direct\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22781/nz-vs-ind-1st-test-india-tour-of-new-zealand-2020");
		List<WebElement>rowsCSS=driver.findElements(By.cssSelector("div[id='innings_2'] div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)"));
		

		//List<WebElement>rows=driver.findElements(By.xpath("//div[@id='innings_2']/div[1]/div[@class='cb-col cb-col-100 cb-scrd-itms']/div[3]"));
		

		/*for(WebElement runs:rowsCSS) {
		System.out.println(runs.getText());	
		
		}*/
		
		for( int i=0;i<rowsCSS.size()-2; i++) {
			
		String colText=	rowsCSS.get(i).getText();
int rowTextInt=Integer.parseInt(colText);
 sum+=rowTextInt;//sum=sum+rowTextInt;
 
		}
		///driver.findElement(By.xpath("//div[@id='innings_2']/div[1]/div[14]/div[1]/following-sibling::div[1]")).getText();
		String extras=driver.findElement(By.xpath("//div[@id='innings_2']//div[text()='Extras']/following-sibling::div[1]")).getText();
		int extrasInt=Integer.parseInt(extras);
		sum+=extrasInt;
		String total=driver.findElement(By.xpath("//div[@id='innings_2']//div[text()='Total']/following-sibling::div[1]")).getText();
		int totalInt=Integer.parseInt(total);
		
if(totalInt==sum){
	System.out.print("Passed Validation");
		}
else
{System.out.print("Failed Validationb");
	}

		//div[@id='innings_2']/div[1]/div[14]/div[1]/following-sibling::div[1]
	
	}
}