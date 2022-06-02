package ebay;

import base.CommonAPI;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;import java.io.IOException;

public class ReadExcelSheet extends CommonAPI {


    @Test
    public void dataReadTest() throws IOException {

        File src = new File("/Users/djafarouldslimane/IdeaProjects/OldTeam_April22_Practice/src/datas/Book1.xlsx");

        FileInputStream fis = new FileInputStream(src);

        XSSFWorkbook xsf = new XSSFWorkbook(fis);

        XSSFSheet sheet = xsf.getSheetAt(0);

        String entry1 = sheet.getRow(1).getCell(1).getStringCellValue();


        System.out.println("The Data in the Box is :"+entry1);


    }

}
