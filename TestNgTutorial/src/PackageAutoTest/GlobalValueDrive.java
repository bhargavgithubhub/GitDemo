package PackageAutoTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;


public class GlobalValueDrive {
	
		public static void main(String[] args) throws IOException {
				
				Properties prop=new Properties();
				 FileInputStream fis=new FileInputStream("C:\\Users\\BHARGAVK\\eclipse-workspace\\TestNgTutorial\\GlobalData.properties");
				 prop.load(fis);
				 String str=prop.getProperty("browser");
				 System.out.println(str);
				 System.out.println(prop.getProperty("url"));
				 
				 FileOutputStream fos=new FileOutputStream("C:\\Users\\BHARGAVK\\eclipse-workspace\\TestNgTutorial\\GlobalData.properties");
				 prop.setProperty("browser", "FireFox");
				 
				prop.store(fos, null);
				System.out.println(str);
			}
			
		}



		