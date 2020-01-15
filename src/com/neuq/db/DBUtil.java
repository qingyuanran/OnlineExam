package com.neuq.db;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

/**
 * ���ݿ������࣬�����ļ�Ϊ��db.properties��
 *
 */
public class DBUtil {
	private static Properties prt = null;
	private static String driver = null;
	private static String url = null;
	private static String user = null;
	private static String pwd = null;
	
	static Connection con = null;// ����һ�����ݿ�����
    static PreparedStatement pr = null;// ����Ԥ����������һ�㶼�������������Statement
	static ResultSet rs = null;// ����һ�����������
	
	static {
	
		try {
			prt = new Properties();
			//InputStream in = DBUtil.class.getClassLoader().getResourceAsStream("com/neuq/db/db.properties");
            //prt.load(in);
			driver = "com.mysql.cj.jdbc.Driver";
			url = "jdbc:mysql://127.0.0.1:3306/examonline?useSSL=false&serverTimezone=UTC";
			user = "root";
			pwd = "sijianren";
			Class.forName(driver);

		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {

	
		try {
			con = DriverManager.getConnection(url, user, pwd);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return con;
	}

	public static void CloseConnection(ResultSet rs, PreparedStatement pr, Connection con) {
		try {
			// ��һ������ļ�������رգ���Ϊ���رյĻ���Ӱ�����ܡ�����ռ����Դ
			// ע��رյ�˳�����ʹ�õ����ȹر�
			if (rs!= null)
				rs.close();
			if (pr != null)
				pr.close();
			if (con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//System.out.println("�Ѿ��ر����ݿ�����");
		}
		
	}
	
	

}
