package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GETNUMRICVALUE {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileInputStream file=new FileInputStream("E:\\sandeep.xlsx");
double data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(4).getCell(1).getNumericCellValue();
System.out.println(data);
	}

}
