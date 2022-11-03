package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataToExcel {
    public static void main(String[] args) throws EncryptedDocumentException, IOException {
        
        //convert physical representation of excel to java representation
        FileInputStream fis =  new FileInputStream("./TestData/excelData.xlsx");

        //loading the file 
        Workbook workbook = WorkbookFactory.create(fis);

        //Writing the value of java representation to excel file
        workbook.getSheet("sheet1").getRow(1).createCell(5).setCellValue("Qspider");

        //converting the java representation to excel representation
        FileOutputStream fos = new FileOutputStream("./TestData/excel.xlsx");
        workbook.write(fos);

        //printing a message
        System.out.println("the Data has been written");

        //Closing the excel Sheet
        workbook.close();
    }
    
}
