package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GETFRISTCOLUMN {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

 FileInputStream file=new FileInputStream("E:\\sandeep.xlsx");
 Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
   int data = sh.getLastRowNum();
   for(int i=0;i<=data;i++) {
	   String b = sh.getRow(i).getCell(2).getStringCellValue();
   
	   System.out.println(b);
   }

	}

}
