package org.testdependency;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	public static void main(String[] args) throws IOException {
		File f = new File("D:\\Java Class\\Java Progaram Save Location\\new\\FrameWorkMaven\\Excel\\SCHOOL.xlsx");
		
		FileInputStream file = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(file);
		
		Sheet sh = w.getSheet("Sheet1");
		
		Row r = sh.getRow(1);
		
		Cell c = r.getCell(1);
		
		System.out.println(c);
		
		
	}

}
