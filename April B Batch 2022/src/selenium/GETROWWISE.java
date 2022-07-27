package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GETROWWISE {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

     FileInputStream file=new FileInputStream("E:\\sandeep.xlsx");
   int data = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
   System.out.println(data+1);
	}

}
