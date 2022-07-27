package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FORCELLTYPEDATAPRINT {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("E:\\sandeep.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		for(int i=0;i<=sh.getLastRowNum();i++) {
			for(int j=0;j<=sh.getRow(i).getLastCellNum()-1;j++) {
				Cell cellinfo = sh.getRow(i).getCell(j);
				CellType ct = cellinfo.getCellType();
				if(ct==CellType.STRING) {
					System.out.print(cellinfo.getStringCellValue()+" ");
				}
				else if(ct==CellType.BOOLEAN) {
					System.out.print(cellinfo.getBooleanCellValue()+" ");
				}
				else if(ct==CellType.NUMERIC) {
					System.out.print(cellinfo.getNumericCellValue()+" ");
				}
			}
			System.out.println();
		}



	}

}
