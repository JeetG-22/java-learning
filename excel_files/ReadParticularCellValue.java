package excel_files;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadParticularCellValue {

	public static void main(String[] args) {
		readCellData(2, 3);
	}

	public static void readCellData(int rowNum, int columnNum) {

		try {
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\4pupp\\OneDrive\\Documents\\Excel Documents\\testfile.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(0);
			/*
			 * Object used to turn the data in the cell into a String value
			 * (don't need to check if it's a NUMERIC or not)
			 */
			DataFormatter d = new DataFormatter();
			Row row = sheet.getRow(--rowNum);
			Cell cell = row.getCell(--columnNum);
			System.out.println(d.formatCellValue(cell));
//			cell.setCellType(arg0);
//			String cellValue = "" + (cell.getCellType().toString().equals("STRING") ? cell.getStringCellValue()
//					: cell.getNumericCellValue());
//			System.out.println(cellValue);
			wb.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
