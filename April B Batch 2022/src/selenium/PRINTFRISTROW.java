package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PRINTFRISTROW {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

     FileInputStream file=new FileInputStream("E:\\sandeep.xlsx");
    Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
       short cellsize = sh.getRow(0).getLastCellNum();// perticlar no
       for(int i=0;i<cellsize;i++) {
    	   String data = sh.getRow(0).getCell(i).getStringCellValue();
    	   System.out.print(data+" ");
       }
       
	}

}
