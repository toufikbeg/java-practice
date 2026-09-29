import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcelWithPoi {
    public static void main(String[] args) {
        try (XSSFWorkbook workbook = new XSSFWorkbook()) {
            XSSFSheet sheet = workbook.createSheet("Students");
            sheet.createRow(0).createCell(0).setCellValue("Name");
            sheet.getRow(0).createCell(1).setCellValue("Roll");
            sheet.createRow(1).createCell(0).setCellValue("Toufik");
            sheet.getRow(1).createCell(1).setCellValue(21);
            try (FileOutputStream out = new FileOutputStream("students.xlsx")) {
                workbook.write(out);
            }
            System.out.println("Excel file written");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
