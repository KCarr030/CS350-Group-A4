package edu.odu.cs.cs350.pne;

import java.io.File;
import java.io.FileNotFoundException;

//The import of apache is not quite functioning fully as of yet.
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;

public class SSBuilder {
    private XSSFWorkbook workbook;
    // private Map<String, Object[]> data = new TreeMap<String, Object[]>(); Unused
    // in final version
    private XSSFSheet sheet;
    private int rowToWrite;

    /**
     * 
     * @param sheetName The name of the first sheet
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

        System.out.println("Built SSBuilder");
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
    public void replaceRow(int replace, Object[] data) {
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
     * @param docName     The name of the document being made
     */
    public void outputFile(String destination, String docName) {
        FileOutputStream out;
        System.out.println("Enter outputFile");
        try {
            File dest = new File(destination);
            dest.mkdirs();
            File f = new File(destination + "/" + docName);
            out = new FileOutputStream(f);
            workbook.write(out);
            out.close();
            System.out.println("Wrote to " + f.getAbsolutePath());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
