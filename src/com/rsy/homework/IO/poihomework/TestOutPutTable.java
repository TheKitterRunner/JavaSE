package com.rsy.homework.IO.poihomework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *  http://tool.oschina.net/apidocs/apidoc?api=apache-POI
 * 输出一个Excel文件
 * 不少于50个Person对象
 * 将List输出为一个Excel表格
 * 
 * @author Nico
 * @CreateDate 2018年8月16日 下午8:30:25
 */
public class TestOutPutTable {
	// 格式化日期，转换成想要的模式
	static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd") ;
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException  { 
		// 新建一个List，将要写入的数据存储在List中，便于操作
		List<Person> listPerson = new ArrayList<>();
		listPerson.add(new Person(3121, "Nico1", 19, sdf.parse("1996-02-03"), "男", "深圳市宝安区", 
				12345678963L, "Java Engineer", 13000, false, "张三", "SoftWare"));
		listPerson.add(new Person(3122, "Nico2", 19, sdf.parse("1996-02-03"), "男", "深圳市南山区", 
				12345678963L, "Java Engineer", 16500, true, "张三", "SoftWare"));
		listPerson.add(new Person(3123, "Nico3", 19, sdf.parse("1996-02-03"), "男", "深圳市宝安区", 
				12345678963L, "Java Engineer", 15550, false, "张三", "SoftWare"));
		listPerson.add(new Person(3124, "Nico4", 18, sdf.parse("1996-02-03"), "男", "深圳市南山区", 
				12345678963L, "Java Engineer", 8000, true, "张三", "SoftWare"));
		listPerson.add(new Person(3125, "Nico5", 18, sdf.parse("1996-02-03"), "男", "深圳市宝安区", 
				12345678963L, "Java Engineer", 9000, false, "张三", "SoftWare"));
		listPerson.add(new Person(3126, "Nico6", 18, sdf.parse("1996-02-03"), "男", "深圳市南山区", 
				12345678963L, "Java Engineer", 10000, true, "张三", "SoftWare"));
		listPerson.add(new Person(3127, "Nico7", 18, sdf.parse("1996-02-03"), "男", "深圳市宝安区", 
				12345678963L, "Java Engineer", 12000, false, "张三", "SoftWare"));
		listPerson.add(new Person(3128, "Nico8", 18, sdf.parse("1996-02-03"), "男", "深圳市南山区", 
				12345678963L, "Java Engineer", 1300, true, "张三", "SoftWare"));
		listPerson.add(new Person(3120, "Nico9", 18, sdf.parse("1996-02-03"), "男", "深圳市宝安区", 
				12345678963L, "Java Engineer", 13000, false, "张三", "SoftWare"));
		listPerson.add(new Person(3130, "Nico10", 18, sdf.parse("1996-02-03"),"男", "深圳市南山区", 
				12345678963L, "Java Engineer", 13000, true, "张三", "SoftWare"));
		listPerson.add(new Person(3131, "Nico11", 18,sdf.parse("1996-02-03"), "男", "深圳市宝安区", 
				12345678963L, "Java Engineer", 13000, false, "张三", "SoftWare"));
		listPerson.add(new Person(3132, "Nico12", 18,sdf.parse("1996-02-03"), "男", "深圳市南山区", 
				12345678963L, "Java Engineer", 13000, true, "张三", "SoftWare"));
		listPerson.add(new Person(3133, "Nico13", 18, sdf.parse("1996-02-03"), "男", "深圳市宝安区", 
				12345678963L, "Java Engineer", 13000, true, "张三", "SoftWare"));
		listPerson.add(new Person(3134, "Nico14", 18, sdf.parse("1996-02-03"), "男", "深圳市南山区", 
				12345678963L, "Java Engineer", 13000, false, "张三", "SoftWare"));
		listPerson.add(new Person(3135, "Nico15", 18, sdf.parse("1996-02-03"), "男", "深圳市宝安区", 
				12345678963L, "Java Engineer", 13000, true, "张三", "SoftWare"));
		listPerson.add(new Person(3136, "Nico16", 18, sdf.parse("1996-02-03"), "男", "深圳市南山区", 
				12345678963L, "Java Engineer", 13000, false, "张三", "SoftWare"));
		listPerson.add(new Person(3137, "Nico17", 18, sdf.parse("1996-02-03"), "男", "深圳市宝安区", 
				12345678963L, "Java Engineer", 13000, true, "张三", "SoftWare"));
		listPerson.add(new Person(3138, "Nico18", 18, sdf.parse("1996-02-03"), "男", "深圳市南山区", 
				12345678963L, "Java Engineer", 13000, false, "张三", "SoftWare"));
		listPerson.add(new Person(3139, "Nico19", 18, sdf.parse("1996-02-03"), "男", "深圳市宝安区", 
				12345678963L, "Java Engineer", 13330, true, "张三", "SoftWare"));
		listPerson.add(new Person(3140, "Nico20", 43, sdf.parse("1996-02-03"), "男", "深圳市南山区", 
				12345678963L, "Java Engineer", 13600, false, "张三", "SoftWare"));
		listPerson.add(new Person(3141, "Nico21", 19,new Date(), "男", "深圳市宝安区", 
				12345678963L, "Java Engineer", 13500, false, "张三", "SoftWare"));
		listPerson.add(new Person(3142, "Nico22", 21, sdf.parse("1996-02-03"), "男", "深圳市南山区", 
				12345678963L, "Java Engineer", 13400, true, "张三", "SoftWare"));
		listPerson.add(new Person(3143, "Nico23", 23, sdf.parse("1996-02-03"), "男", "深圳市宝安区", 
				12345678963L, "Java Engineer", 13000, false, "张三", "SoftWare"));
		listPerson.add(new Person(3144, "Nico24", 23, sdf.parse("1996-02-03"), "男", "深圳市南山区", 
				12345678963L, "Java Engineer", 13000, true, "张三", "SoftWare"));
		listPerson.add(new Person(3145, "Nico25", 45, sdf.parse("1996-02-03"), "男", "深圳市宝安区", 
				12345678963L, "Java Engineer", 13000, false, "张三", "SoftWare"));
		listPerson.add(new Person(3146, "Nico26", 34, sdf.parse("1996-02-03"), "男", "深圳市南山区", 
				12345678963L, "Java Engineer", 13000, true, "张三", "SoftWare"));
		listPerson.add(new Person(3147, "Nico27", 18, sdf.parse("1996-02-03"), "男", "深圳市宝安区", 
				12345678963L, "Java Engineer", 13000, false, "张三", "SoftWare"));
		listPerson.add(new Person(3148, "Nico28", 18, sdf.parse("1996-02-03"), "男", "深圳市南山区", 
				12345678963L, "Java Engineer", 13000, true, "张三", "SoftWare"));
		listPerson.add(new Person(3149, "Nico29", 18, sdf.parse("1996-02-03"), "男", "深圳市宝安区", 
				12345678963L, "Java Engineer", 13000, false, "张三", "SoftWare"));
		listPerson.add(new Person(3150, "Nico30", 18, sdf.parse("1996-02-03"), "男", "深圳市南山区", 
				12345678963L, "Java Engineer", 13000, false, "张三", "SoftWare"));
		listPerson.add(new Person(3151, "Nico31", 18, sdf.parse("1996-02-03"), "男", "深圳市宝安区", 
				12345678963L, "Java Engineer", 13000, true, "张三", "SoftWare"));
		listPerson.add(new Person(3152, "Nico32", 18, sdf.parse("1996-02-03"), "男", "深圳市南山区", 
				12345678963L, "Java Engineer", 13000, false, "张三", "SoftWare"));
		listPerson.add(new Person(3153, "Nico33", 18, sdf.parse("1996-02-03"), "男", "深圳市宝安区", 
				12345678963L, "Java Engineer", 13000, false, "张三", "SoftWare"));
		listPerson.add(new Person(3154, "Nico34", 25, sdf.parse("1996-02-03"), "男", "深圳市南山区", 
				12345678963L, "Java Engineer", 9000, true, "张三", "SoftWare"));
		listPerson.add(new Person(3155, "Nico35", 35, sdf.parse("1996-02-03"), "男", "深圳市宝安区", 
				12345678963L, "Java Engineer", 15600, false, "张三", "SoftWare"));
		listPerson.add(new Person(3156, "Nico36", 36, sdf.parse("1996-02-03"), "男", "深圳市南山区", 
				12345678963L, "Java Engineer", 13400, false, "张三", "SoftWare"));
		listPerson.add(new Person(3157, "Nico37", 28, sdf.parse("1996-02-03"), "男", "深圳市宝安区", 
				12345678963L, "Java Engineer", 13000, true, "张三", "SoftWare"));
		listPerson.add(new Person(3158, "Nico38", 18, sdf.parse("1996-02-03"), "男", "深圳市南山区", 
				12345678963L, "Java Engineer", 13000, false, "张三", "SoftWare"));
		listPerson.add(new Person(3159, "Nico39", 18, sdf.parse("1996-02-03"), "男", "深圳市宝安区", 
				12345678963L, "Java Engineer", 13000, true, "张三", "SoftWare"));
		listPerson.add(new Person(3160, "Nico40", 18, sdf.parse("1996-02-03"), "男", "深圳市南山区", 
				12345678963L, "Java Engineer", 13000, false, "张三", "SoftWare"));
		listPerson.add(new Person(3161, "Nico41", 18, sdf.parse("1996-02-03"), "男", "深圳市宝安区", 
				12345678963L, "Java Engineer", 13000, false, "张三", "SoftWare"));
		listPerson.add(new Person(3162, "Nico42", 18, sdf.parse("1996-02-03"), "男", "深圳市南山区", 
				12345678963L, "Java Engineer", 13000, false, "张三", "SoftWare"));
		listPerson.add(new Person(3163, "Nico43", 18, sdf.parse("1996-02-03"), "男", "深圳市宝安区", 
				12345678963L, "Java Engineer", 13000, false, "张三", "SoftWare"));
		listPerson.add(new Person(3164, "Nico44", 18, sdf.parse("1996-02-03"), "男", "深圳市南山区", 
				12345678963L, "Java Engineer", 13000, false, "张三", "SoftWare"));
		listPerson.add(new Person(3165, "Nico45", 18, sdf.parse("1996-02-03"), "男", "深圳市宝安区", 
				12345678963L, "Java Engineer", 13000, false, "张三", "SoftWare"));
		listPerson.add(new Person(3166, "Nico46", 18, sdf.parse("1996-02-03"), "男", "深圳市南山区", 
				12345678963L, "Java Engineer", 13000, false, "张三", "SoftWare"));
		listPerson.add(new Person(3167, "Nico47", 18, sdf.parse("1996-02-03"), "男", "深圳市宝安区", 
				12345678963L, "Java Engineer", 13000, false, "张三", "SoftWare"));
		listPerson.add(new Person(3168, "Nico48", 18, sdf.parse("1996-02-03"), "男", "深圳市南山区", 
				12345678963L, "Java Engineer", 13000, false, "张三", "SoftWare"));
		listPerson.add(new Person(3169, "Nico49", 18, sdf.parse("1996-02-03"), "男", "深圳市宝安区", 
				12345678963L, "Java Engineer", 13000, false, "张三", "SoftWare"));
		listPerson.add(new Person(3170, "Nico50", 18,sdf.parse("1996-02-03"), "男", "深圳市南山区", 
				12345678963L, "Java Engineer", 13000, false, "张三", "SoftWare"));
		// 控制台打印输出每个Person的信息
		for( Person p : listPerson){
			System.out.println(p);
		}
		
		// 程序开始，将表头 的信息存储在一个字符串数组中
		String[] titleName = {"Id","Name","Age","Birthday","Gender","Address","Mobile","Job","Salary","IsMarried","Contact","Major"};
			// 创建一个工作簿
			@SuppressWarnings("resource")
			XSSFWorkbook workbook = new XSSFWorkbook();
			// 在工作簿里面创建一个数据页
			XSSFSheet sheet = workbook.createSheet();
			// 创建一行
			XSSFRow firstRow = sheet.createRow(0); // 第一行为表格 的第一行
			// 添加表头元素
			for( int i = 0; i < titleName.length; i ++){
				firstRow.createCell(i).setCellValue(titleName[i]);
			}
			// 每次新建一行，将List中对应检索处 的数据分别添加进去
			for (int i = 0; i < listPerson.size(); i++) {
				// 每次对应新建对应的行
				Row row = sheet.createRow(i);
				row.createCell(0).setCellValue(listPerson.get(i).getId());
				row.createCell(1).setCellValue(listPerson.get(i).getName());
				row.createCell(2).setCellValue(listPerson.get(i).getAge());
				row.createCell(3).setCellValue(new SimpleDateFormat("yyyy-MM-dd").format(listPerson.get(i).getBirthday()));
				row.createCell(4).setCellValue(listPerson.get(i).getGender());
				row.createCell(5).setCellValue(listPerson.get(i).getAddress());
				row.createCell(6).setCellValue(listPerson.get(i).getMobile());
				row.createCell(7).setCellValue(listPerson.get(i ).getJob());
				row.createCell(8).setCellValue(listPerson.get(i).getSalary());
				row.createCell(9).setCellValue(listPerson.get(i).isMarried()==true ? "是" : "否");
				row.createCell(10).setCellValue(listPerson.get(i).getContact());;
				row.createCell(11).setCellValue(listPerson.get(i).getMajor());
				}
				// 将数据写入工作簿的程序开始
				// 新建一个File对象，将要存储的路径传进去
				File file = new File("C:\\Users\\30610\\Desktop\\HomeWork\\person.xlsx");
				// 如果路径不存在，就新建
				if (!file.exists()) {
					try {
						file.createNewFile();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				try(
						// 文件对象传给一个文件输出流对象
						FileOutputStream fos = new FileOutputStream(file);
						) 
					{	// 将输出流对象写入到指定的路径下（指定的工作簿）
						workbook.write(fos);
					}
		}
}

