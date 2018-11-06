package com.rsy.IO.practice.poi;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestPerson {
	public static void main(String[] args) {
		File file  = new File("C:\\Users\\30610\\Desktop\\Test\\Employee.xlsx");
		if (file.exists()) {
			FileInputStream fi = null;
			XSSFWorkbook workBook = null;
			try{
				fi = new FileInputStream(file);
				workBook = new XSSFWorkbook(fi);
				XSSFSheet sheet = workBook.getSheetAt(0);
				XSSFRow firstRow = sheet.getRow(0);
				int firstCellNum = firstRow.getFirstCellNum();
				System.out.println(firstCellNum);
				int lastCellNum = firstRow.getLastCellNum();
				System.out.println(lastCellNum);
				
				List<String> headList = new ArrayList<>();
				for (int i = firstCellNum ;i < lastCellNum;i++) {
					//获取每一个单元格
					XSSFCell cell = firstRow.getCell(i);
					String s = cell.getStringCellValue();
					//将表头属性添加到list中去
					headList.add(s);
				}
				
				System.out.println(headList);
				int firstRowNum = sheet.getFirstRowNum();
				System.out.println(firstRowNum);
				int lastRowNum = sheet.getLastRowNum();
				System.out.println(lastRowNum);
				List<Person> personsList = new ArrayList<>();
				for (int i = firstRowNum + 2;i <= lastRowNum;i++) {
					XSSFRow row = sheet.getRow(i);
					//获取ID
					int id = (int)row.getCell(0).getNumericCellValue();
					//获取name
					String name = row.getCell(1).getStringCellValue();
					//获取job
					String job = row.getCell(2).getStringCellValue();
					//获取hireDate
					Date hireDate = row.getCell(3).getDateCellValue();
					//获取salary
					double salary = row.getCell(4).getNumericCellValue();
					//获取bonus
					double bonus = row.getCell(5).getNumericCellValue();
					
					Person person = new Person(id, name, job, hireDate, salary, bonus);
					personsList.add(person);
				}
				
				for (Person e : personsList) {
					System.out.println(e );
				}
			}catch(Exception e){
				e.printStackTrace();
			}finally {
					try {
						fi.close();
						workBook.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
			}
		}
		
	}
}
