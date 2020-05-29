package com.generics.MavenIRCTC;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLibrary implements AutoConstant
{
	public static String getcellvalue(String path, String sheet,int row,int cell) throws IOException {
		
		String cellvalue;
		FileInputStream file=new FileInputStream(excel_path);
		XSSFWorkbook wb=new XSSFWorkbook(file);
		cellvalue=wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return cellvalue;
		
		
	}

}
