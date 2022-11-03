package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



/**
 * FetchDataFromExcelSheet
 */
public class FetchDataFromExcelSheet {

    public static void main(String[] args) throws EncryptedDocumentException, IOException {
        FileInputStream fis= new FileInputStream("./TestData/URL.xlsx");
        Workbook workbook  = WorkbookFactory.create(fis);

        Sheet sheet = workbook.getSheet("sheet1");
        Row row = sheet.getRow(1);
        Cell cell = row.getCell(0);
        String url = cell.getStringCellValue();
        System.out.println("the URL is : "+ url);

        String username = row.getCell(1).toString();
        System.out.println("the URl is: "+ username);

        String password = row.getCell(2).toString();
        System.out.println("the URl is : "+ password);

        double num = row.getCell(3).getNumericCellValue();
        boolean bool = row.getCell(4).getBooleanCellValue();
        
        System.out.println(num);
        System.out.println(bool);
        


    }
}