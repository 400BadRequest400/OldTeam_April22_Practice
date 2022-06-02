package ebay;

import base.CommonAPI;

public class ExcelUtilsTest extends CommonAPI {



    public static void main(String[] args) {

        String projectPath = System.getProperty("user.dir");
        ExcelUtils excel = new ExcelUtils(projectPath+"/src/datas/Book1.xlsx", "Sheet1");

        excel.getRow();
        excel.getCellDataString(0, 0);
        excel.getCellDataNumber(1, 1);
    }
}
