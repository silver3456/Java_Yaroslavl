//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//
//public class ExcelReader {
//    private HSSFWorkbook hssfWorkbook;
//
// public ExcelReader(String excelPath) {
//        try (FileInputStream fileInputStream = new FileInputStream(excelPath)) {
//            this.hssfWorkbook = new HSSFWorkbook(fileInputStream);
//        } catch (IOException ex) {
//            System.out.printf("Failed to read excel, path: %s, exception: %s\n", excelPath, ex.getMessage());
//        }
//    }
//
//    public List<String> readExcelSheetByNumber(int sheetNumber) {
//        Sheet firstSheet = hssfWorkbook.getSheetAt(sheetNumber);
//
//        List<String> urls = new ArrayList<>();
//        for (Row nextRow : firstSheet) {
//            Iterator<Cell> cellIterator = nextRow.cellIterator();
//
//            while (cellIterator.hasNext()) {
//                Cell cell = cellIterator.next();
//                String url = cell.getStringCellValue();
//                urls.add(url);
//            }
//        }
//
//        return urls;
//    }
//
//    public List<String> readExcelSheetByName(String sheetName) {
//        Sheet firstSheet = hssfWorkbook.getSheet(sheetName);
//
//        List<String> urls = new ArrayList<>();
//        for (Row nextRow : firstSheet) {
//            Iterator<Cell> cellIterator = nextRow.cellIterator();
//
//            while (cellIterator.hasNext()) {
//                Cell cell = cellIterator.next();
//                String url = cell.getStringCellValue();
//                urls.add(url);
//            }
//        }
//
//        return urls;
//    }
//
//    public List<String> readAllExcelSheets() {
//
//        List<String> urls = new ArrayList<>();
//
//        Iterator<Sheet> sheetIterator;
//        sheetIterator = hssfWorkbook.sheetIterator();
//        Sheet sheet;
//
//        while (sheetIterator.hasNext()) {
//            sheet = sheetIterator.next();
//            String sheetName = sheet.getSheetName();
//
//            Sheet firstSheet = hssfWorkbook.getSheet(sheetName);
//
//            for (Row nextRow : firstSheet) {
//                Iterator<Cell> cellIterator = nextRow.cellIterator();
//
//                while (cellIterator.hasNext()) {
//                    Cell cell = cellIterator.next();
//                    String url = cell.getStringCellValue();
//                    urls.add(url);
//                }
//            }
//        }
//        return urls;
//    }
//}
