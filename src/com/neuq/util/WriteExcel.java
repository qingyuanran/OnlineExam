//package com.neuq.util;
//
//import java.io.IOException;
//import java.util.List;
//
//
//import org.apache.poi.hssf.usermodel.HSSFCell;
//import org.apache.poi.hssf.usermodel.HSSFCellStyle;
//import org.apache.poi.hssf.usermodel.HSSFRow;
//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//
//import com.neuq.bean.StudentGrade;
//
//public class WriteExcel {
//	public HSSFWorkbook writeExcel(List<StudentGrade> list) throws IOException {
//
//		// 1.创建一个workbook，对应一个Excel文件恳
//		HSSFWorkbook wb = new HSSFWorkbook();
////		wb.setSheetName(n, "中文",HSSFCell.ENCODING_UTF_16);
//		// 2.在workbook中添加一个sheet，对应Excel中的一个sheet
//
//		HSSFSheet sheet = wb.createSheet("学生成绩表");
//		// 3.在sheet中添加表头第0行，老版本poi对excel行数列数有限制short
//		HSSFRow row = sheet.createRow((int) 0);
//		// 4.创建单元格，设置值表头，设置表头居中
//		HSSFCellStyle style = wb.createCellStyle();
//		// 居中格式
//		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
//		// 设置表头
//		String username="用户名";
//		String xz = "选择题得分";
//		String tk = new String("填空题得分");
//		String bc = new String("编程题得分");
//		String zf = new String("总分");
//		String name = new String("试卷名称");
//		row = sheet.createRow((int) 0 + 1);
//		row.createCell(0).setCellValue(new String("用户名"));
//		row.createCell(1).setCellValue(xz);
//		row.createCell(2).setCellValue(tk);
//		row.createCell(3).setCellValue(bc);
//		row.createCell(4).setCellValue(zf);
//		//row.createCell(5).setCellValue(name);
//		// 循环将数据写入Excel
//		for (int i = 1; i < list.size(); i++) {
//			row = sheet.createRow((int) i + 1);
//			StudentGrade sg= list.get(i);
//			// 创建单元格，设置值
//			row.createCell(0).setCellValue(sg.getUsername());
//			row.createCell(1).setCellValue(sg.getXztscore());
//			row.createCell(2).setCellValue(sg.getTktscore());
//			row.createCell(3).setCellValue(sg.getBctscore());
//			row.createCell(4).setCellValue(sg.getXztscore()+sg.getTktscore()+sg.getBctscore());
//			String name =sg.getPapername();
//			row.createCell(5).setCellValue(name);
//		}
//		return wb;
//
//	}
//}
