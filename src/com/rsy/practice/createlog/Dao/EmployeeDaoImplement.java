package com.rsy.practice.createlog.Dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.rsy.practice.createlog.Entity.Employee;

public class EmployeeDaoImplement implements EmployeeDao{

	@Override
	public List<Employee> list() throws Exception {
		System.out.println("开始获取Excel表格的内容");
		// 创建要返回的List
		List<Employee> employeesList = new ArrayList<>();
		// 创建File的对象
		File file = new File("C:\\Users\\30610\\Desktop\\Test\\Employee.xlsx");
		// 创建文件输入流的对象
		FileInputStream fi = new FileInputStream(file);
		// 从文件输入流中读取出Excel中的数据
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(fi);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		for( int i = 1; i <= sheet.getLastRowNum(); i ++){
			// 获取其中一行
			XSSFRow row = sheet.getRow(i);
			int id = 0;
			String name = null;
			String job = null;
			Date hiredate = null;
			double salary = 0;
			double bonus = 0;
			for( int j = row.getFirstCellNum(); j < row.getLastCellNum() - 1; j ++){
				// 获取每一行的其中的一个单元格
				XSSFCell cell = row.getCell(j);
				if ( j == 0) {
					id = (int) cell.getNumericCellValue();
				}
				if ( j == 1) {
					name = cell.getStringCellValue();
				}
				if ( j == 2) {
					job = cell.getStringCellValue();
				}
				if ( j == 3) {
					hiredate = cell.getDateCellValue();
				}
				if ( j == 4) {
					salary = cell.getNumericCellValue();
				}
				if ( j == 5) {
					bonus = cell.getNumericCellValue();
				}
			}
			// 将每个获取的Employee对象都添加进employeesList中
			Employee employee = new Employee(id, name, job, hiredate, salary, bonus);
			employeesList.add(employee);
		}
		return employeesList;
	}
	
	@Override
	public Employee find(int id) throws Exception {
		List<Employee> list = this.list();
		for( Employee e : list){
			if (e.getId() == id) {
				System.out.println("已经找到目标！");
				return e;
			}
		}
		return null;
	}
	
	@Override
	public boolean insert(Employee employee) throws Exception {
		Employee e = this.find(employee.getId());
		if (e != null) {
			return false;
		}
		// 如果表格中没有就要插入到表格的最后一行
		File file = new File("C:\\Users\\30610\\Desktop\\Test\\Employee.xlsx");
		FileInputStream fi = new FileInputStream(file);
		
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(fi);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int last_row = sheet.getLastRowNum();
//		System.out.println(last_row);
		XSSFRow new_row = sheet.createRow(last_row + 1);
		// 将ID 添加至指定行的第一个单元格
		XSSFCell cell1 = new_row.createCell(0);
		cell1.setCellValue(employee.getId());
		// 将name添加到第二个单元格
		XSSFCell cell2 = new_row.createCell(1);
		cell2.setCellValue(employee.getName());
		// job
		XSSFCell cell3 = new_row.createCell(2);
		cell3.setCellValue(employee.getJob());
		// hiredate
		XSSFCell cell4 = new_row.createCell(3);
		cell4.setCellValue(employee.getHiredate());
		// salary
		XSSFCell cell5 = new_row.createCell(4);
		cell5.setCellValue(employee.getSalary());
		// bonus
		XSSFCell cell6 = new_row.createCell(5);
		cell6.setCellValue(employee.getBonus());
		// 将添加后的表格写入到指定路径下
		workbook.write(new FileOutputStream(file));
		return true;
	}
	
	@Override
	public boolean update(Employee employee) throws Exception {
		Employee e = this.find(employee.getId());
		if (e == null) {
			System.out.println("怕是沒有這個人吧");
			return false;
		}
		File file = new File("C:\\Users\\30610\\Desktop\\Test\\Employee.xlsx");
		FileInputStream fi = new FileInputStream(file);
		
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(fi);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		for(int i = 1; i <= sheet.getLastRowNum(); i ++){
			XSSFRow row = sheet.getRow(i);
			if (row.getCell(0).getNumericCellValue() == employee.getId()) {
				row.getCell(1).setCellValue(employee.getName());
				row.getCell(2).setCellValue(employee.getJob());
				row.getCell(3).setCellValue(employee.getHiredate());
				row.getCell(4).setCellValue(employee.getSalary());
				row.getCell(5).setCellValue(employee.getBonus());
				workbook.write(new FileOutputStream(file));
				System.out.println("已经成功修改");
				return true;
			}
		}
		System.out.println("没有成功修改");
		return false;
	}

	@Override
	public boolean delete(int id) throws Exception {
		File file = new File("C:\\Users\\30610\\Desktop\\Test\\Employee.xlsx");
		FileInputStream fi = new FileInputStream(file);
		
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(fi);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		for( int i = 1;i <= sheet.getLastRowNum(); i ++){
			XSSFRow row = sheet.getRow(i);
			if (row.getCell(0).getNumericCellValue() == id) {
				sheet.removeRow(row);
				workbook.write(new FileOutputStream(file));
				System.out.println("已经删除成功！！");
				return true;
			}
		}
		System.out.println("未能成功删除！！");
		return false;
	}
	
}
