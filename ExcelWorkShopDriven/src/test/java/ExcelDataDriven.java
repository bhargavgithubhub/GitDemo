import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataDriven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ArrayList<String> FirstColData=new ArrayList<String>();
		FileInputStream fis = new FileInputStream("C://Users//BHARGAVK//Desktop//ExcelDriven.xlsx");
		

		XSSFWorkbook wSheet = new XSSFWorkbook(fis);
		int sNum = wSheet.getNumberOfSheets();
		for (int i = 0; i < sNum; i++)
		{
			//System.out.println(wSheet.getSheetName(i));
			if (wSheet.getSheetName(i).equalsIgnoreCase("TestData"))
			{
				XSSFSheet reqSheet = wSheet.getSheetAt(i);
				//Iterator<Row> rows = reqSheet.Iterator();
				
				Iterator<Row> rows = reqSheet.rowIterator();
				
			Row firstRow = rows.next();

				Iterator<Cell> cells = firstRow.cellIterator();
				
				int k = 0;
int column=0;
				while (cells.hasNext()) 
				{
					String values = cells.next().getStringCellValue();
					
					//System.out.println(values);
					if (values.equalsIgnoreCase("TestCases1")) 
					{
						column = k;
					
						
						//String cellValues =rows.next().getCell(column).getStringCellValue();
						//System.out.println(cellValues);
						
					}
					k++;
				}
				//System.out.println(column);
				//Again traverse through all rows with column index u got it above
				//Arraylist to store cell datas
				System.out.println("Requires Column No ::>>"+ column);
				while(rows.hasNext()) {
				
					
					Row r=rows.next();
					
					//String cellValues =rows.next().getCell(column).getStringCellValue();
					
				//	r.getCell(column).getStringCellValue();
					
					
					if(r.getCell(column).getStringCellValue().equalsIgnoreCase("Purchase 11")) {
					
					Iterator<Cell>  cv=r.cellIterator();
						
					while(cv.hasNext()) {
						
						
						FirstColData.add(cv.next().getStringCellValue());
						
						
					}
					}
					
				
					//FirstColData.add(cellValues);
					
				}
				
				System.out.println(FirstColData);

			}

		}
	}

}
