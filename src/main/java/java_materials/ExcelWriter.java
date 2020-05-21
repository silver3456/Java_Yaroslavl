//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.ComparisonOperator;
//import org.apache.poi.ss.usermodel.ConditionalFormattingRule;
//import org.apache.poi.ss.usermodel.IndexedColors;
//import org.apache.poi.ss.usermodel.PatternFormatting;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.SheetConditionalFormatting;
//import org.apache.poi.ss.util.CellRangeAddress;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//public class ExcelWriter {
//    private HSSFSheet hssfSheet;
//    private HSSFWorkbook hssfWorkbook;
//
//    public ExcelWriter() {
//        this.hssfWorkbook = new HSSFWorkbook();
//        this.hssfSheet = hssfWorkbook.createSheet(getCurrentDate());
//        createHeader();
//    }
//
//    public ExcelWriter(String outputExcelPath, String sheetName) {
//        try (FileInputStream fileInputStream = new FileInputStream(outputExcelPath)) {
//            this.hssfWorkbook = new HSSFWorkbook(fileInputStream);
//            this.hssfSheet = hssfWorkbook.createSheet(sheetName);
//            createHeader();
//        } catch (IOException ex) {
//            System.out.printf("Failed to read excel, path: %s, exception: %s\n", outputExcelPath, ex.getMessage());
//        }
//    }
//
//    private String getCurrentDate() {
//        String pattern = "MM-dd-yyyy 'at' HH.mm a";
//        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
//        return dateFormat.format(new Date());
//    }
//
//    private void createHeader() {
//        String[] arrHeader = {"URL", "Page Load Time", "Time 1", "Time 2", "Time 3", "Time 4", "Time 5",
//                "Average Time", "Font Load Time", "Time 1", "Time 2", "Time 3", "Time 4", "Time 5", "Average Time"};
//
//        Row row = hssfSheet.createRow(0);
//        for (int i = 0; i < arrHeader.length; i++) {
//            Cell cell = row.createCell(i);
//            cell.setCellValue(arrHeader[i]);
//        }
//    }
//
//    public void writeExcelFile(String fileName) {
//        FileOutputStream fileOut;
//        try {
//            fileOut = new FileOutputStream(fileName);
//            hssfWorkbook.write(fileOut);
//            fileOut.flush();
//            fileOut.close();
//        } catch (Exception e) {
//            System.out.printf("Failed to create file %s, exception: %s\n", fileName, e.getMessage());
//        }
//    }
//
//    public void setCellData(String value, int rowNum, int colNum) {
//        try {
//            Row hssfRow = hssfSheet.getRow(rowNum);
//            if (hssfRow == null) {
//                hssfRow = hssfSheet.createRow(rowNum);
//            }
//            Cell cell = hssfRow.getCell(colNum);
//            if (cell != null) {
//                cell.setCellValue(value);
//            } else {
//                cell = hssfRow.createCell(colNum);
//                cell.setCellValue(value);
//            }
//
//        } catch (Exception e) {
//            System.out.printf("Failed to write data into the cell %s\n", e.getMessage());
//        }
//    }
//
//    public void setCellData(int value, int rowNum, int colNum) {
//        try {
//            Row hssfRow = hssfSheet.getRow(rowNum);
//            if (hssfRow == null) {
//                hssfRow = hssfSheet.createRow(rowNum);
//            }
//            Cell cell = hssfRow.getCell(colNum);
//            if (cell != null) {
//                cell.setCellValue(value);
//            } else {
//                cell = hssfRow.createCell(colNum);
//                cell.setCellValue(value);
//            }
//
//        } catch (Exception e) {
//            System.out.printf("Failed to write data into the cell %s\n", e.getMessage());
//        }
//    }
//
//    public void useConditionalFormatting(String maxValue, String columnName) {
//
//        //Create conditional formats
//        SheetConditionalFormatting conditionalFormatting = hssfSheet.getSheetConditionalFormatting();
//
//        //Create rules
//        ConditionalFormattingRule rule = conditionalFormatting.createConditionalFormattingRule(ComparisonOperator.GT, maxValue);
//
//        //Change background color
//        PatternFormatting background = rule.createPatternFormatting();
//        background.setFillBackgroundColor(IndexedColors.RED.getIndex());
//
//        CellRangeAddress[] range = {CellRangeAddress.valueOf(columnName)};
//        conditionalFormatting.addConditionalFormatting(range, rule);
//    }
//}
