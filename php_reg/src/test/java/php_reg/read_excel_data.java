package php_reg;

import java.io.File;
//import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class read_excel_data {

	public String[][]read_sheet() throws InvalidFormatException, IOException{
	File myfile =new File(".\\Test_data\\Book11.xlsx");
	//FileInputStream inputStream = new FileInputStream(myfile);
	//InputStream myfile = new FileInputStream(inputStream);
	XSSFWorkbook wb = new XSSFWorkbook(myfile);
	//File file = new File("T:\\SeleniuminputFiles\\input.xlsx");
	//XSSFWorkbook wb = new XSSFWorkbook(file);
	XSSFSheet mysheet=wb.getSheet("Sheet1");
	int number_of_rows=mysheet.getPhysicalNumberOfRows();
	int number_of_columns=mysheet.getRow(0).getLastCellNum();
	String[][]myarray=new String[ number_of_rows-1][number_of_columns];
	for(int i=1;i<number_of_rows;i++)
	{
		for(int a=0; a<number_of_columns;a++)
		{
			XSSFRow row=mysheet.getRow(i);
			myarray[i-1][a]=row.getCell(a).getStringCellValue();
		}
	}
		return myarray;

	}

}

