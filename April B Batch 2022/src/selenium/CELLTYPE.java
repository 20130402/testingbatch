package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CELLTYPE {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

      FileInputStream file=new FileInputStream("E:\\sandeep.xlsx");
     CellType data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(0).getCellType();
     
     System.out.println(data);
	}

}
