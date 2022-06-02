package ebay;

import base.CommonAPI;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils extends CommonAPI {


    static String projectPath;
    static XSSFWorkbook workbook;
    static XSSFSheet sheet;

    public ExcelUtils(String excelPath, String sheetName ){
        try {
            workbook = new XSSFWorkbook(projectPath + excelPath);
            sheet = workbook.getSheet(sheetName);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        //getRow();
        //getCellDataString(0, 0);
        //getCellDataNumber(1,1);
    }

    public void getRow(){
        try {
            int rowCount = sheet.getPhysicalNumberOfRows();
            System.out.println("No of rows "+rowCount);

        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public void getCellDataString(int rowNum, int colNum){
        try {
            String cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
            System.out.println(cellData);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public void getCellDataNumber(int rowNum, int colNum){
        try {
            Double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
            System.out.println(cellData);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
