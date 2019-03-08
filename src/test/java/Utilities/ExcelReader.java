package Utilities;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class ExcelReader {

    static XSSFSheet Sheet1;
    static {
        try {
            FileInputStream file1 = new FileInputStream("src/test/java/Utilities/MyExcel.xlsx");
            XSSFWorkbook YahooCredential = new XSSFWorkbook(file1);
            Sheet1 = YahooCredential.getSheet("Sheet1");

        } catch (Exception e) {
        }
    }

    public static String getData(int rowNum, int cellNum){
        return Sheet1.getRow(rowNum).getCell(cellNum).getStringCellValue();
    }

}
