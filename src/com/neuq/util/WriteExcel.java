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
//		// 1.����һ��workbook����Ӧһ��Excel�ļ���
//		HSSFWorkbook wb = new HSSFWorkbook();
////		wb.setSheetName(n, "����",HSSFCell.ENCODING_UTF_16);
//		// 2.��workbook�����һ��sheet����ӦExcel�е�һ��sheet
//
//		HSSFSheet sheet = wb.createSheet("ѧ���ɼ���");
//		// 3.��sheet����ӱ�ͷ��0�У��ϰ汾poi��excel��������������short
//		HSSFRow row = sheet.createRow((int) 0);
//		// 4.������Ԫ������ֵ��ͷ�����ñ�ͷ����
//		HSSFCellStyle style = wb.createCellStyle();
//		// ���и�ʽ
//		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
//		// ���ñ�ͷ
//		String username="�û���";
//		String xz = "ѡ����÷�";
//		String tk = new String("�����÷�");
//		String bc = new String("�����÷�");
//		String zf = new String("�ܷ�");
//		String name = new String("�Ծ�����");
//		row = sheet.createRow((int) 0 + 1);
//		row.createCell(0).setCellValue(new String("�û���"));
//		row.createCell(1).setCellValue(xz);
//		row.createCell(2).setCellValue(tk);
//		row.createCell(3).setCellValue(bc);
//		row.createCell(4).setCellValue(zf);
//		//row.createCell(5).setCellValue(name);
//		// ѭ��������д��Excel
//		for (int i = 1; i < list.size(); i++) {
//			row = sheet.createRow((int) i + 1);
//			StudentGrade sg= list.get(i);
//			// ������Ԫ������ֵ
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
