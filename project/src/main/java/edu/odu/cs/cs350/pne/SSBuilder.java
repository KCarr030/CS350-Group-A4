package edu.odu.cs.cs350.pne;

import java.io.File;

//The import of apache is not quite functioning fully as of yet.
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SSBuilder {
    private XSSFWorkbook workbook;
    private Map<String, Object[]> data = new TreeMap<String, Object[]>();
    private XSSFSheet sheet;
    private int rowToWrite;

    /**
     * 
     * @param sheetName The name of the spreadsheet document
     * @param headers   Array of all headers for data recorded
     */
    public SSBuilder(String sheetName, String[] headers) {
        workbook = new XSSFWorkbook();
        sheet = workbook.createSheet(sheetName);

        Row row = sheet.createRow(0);
        int cellnum = 0;
        for (String str : headers) {
            Cell cell = row.createCell(cellnum);
            cellnum++;
            cell.setCellValue(str);
        }

        rowToWrite = 1;
    }

    /**
     * This function will automatically add a row to the bottom of the list
     * 
     * @param data Data stored within a single row, in order matching the headers
     */
    public void addRow(Object[] data) {

        Row row = sheet.createRow(rowToWrite);
        int cellnum = 0;
        for (Object obj : data) {
            Cell cell = row.createCell(cellnum);
            cellnum++;
            if (obj instanceof String) {
                cell.setCellValue((String) obj);
            } else if (obj instanceof Integer) {
                cell.setCellValue((Integer) obj);
            } else if (obj instanceof Double) {
                cell.setCellValue((Double) obj);
            }
        }
        rowToWrite++;

    }

    /**
     * Replaces a row, assuming it already exists
     * 
     * @param replace Index of the row to be replaced
     */
    public void replaceRow(int replace) {
        Row row = sheet.getRow(replace);
        int cellnum = 0;
        for (Object obj : data) {
            Cell cell = row.createCell(cellnum);
            cellnum++;
            if (obj instanceof String) {
                cell.setCellValue((String) obj);
            } else if (obj instanceof Integer) {
                cell.setCellValue((Integer) obj);
            } else if (obj instanceof Double) {
                cell.setCellValue((Double) obj);
            }
        }
    }

    public void clearRow(int row) {

    }

    /**
     * Outputs the currently built spreadsheet to a designated destination
     * 
     * @param destination The File indicating the final location to output to
     */
    public void outputFile(File destination) {
        FileOutputStream out = new FileOutputStream(destination);
        workbook.write(out);
        out.close();
    }
}
