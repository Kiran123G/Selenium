package genericPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	public String readExcelData(String excelData, String sheetName, int rowCount, int cellCount)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelData);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowCount);
		Cell cell = row.getCell(cellCount);
		String data = cell.getStringCellValue();
		return data;
	}

	public void writeExcelData(String exceldata, String sheetName, int rowCount, int cellCount, String data)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(exceldata);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.createRow(rowCount);
		Cell cell = row.createCell(cellCount);
		cell.setCellValue(data);

		FileOutputStream fos = new FileOutputStream(exceldata);
		workbook.write(fos);

	}

	public String readPropertyData(String propData, String key) throws IOException {
		FileInputStream fis = new FileInputStream(propData);
		Properties prop = new Properties();
		prop.load(fis);
		String dataString = prop.getProperty(key);
		return dataString;
	}

	public int lastRowCount(String exceldata, String sheetName) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(exceldata);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetName);

		int rc = sheet.getLastRowNum();
		return rc;
	}
}
