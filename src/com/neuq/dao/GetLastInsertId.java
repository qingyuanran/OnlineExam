package com.neuq.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.neuq.db.DBUtil;

/**
 * ȡ��MySQL�������ݺ���������IDֵ,��ʱ�ò������Ժ���˵
 * @author chaizhi
 *
 */
public class GetLastInsertId {
	
	
public static int getLastInsertId(String tablename) {
	   
	int id=0;
	//ȡ�����һ�β����IDֵ���߲���״̬�²�����
	String sql="select max(id) from ?";
	Connection con=DBUtil.getConnection();
	PreparedStatement ps=null;
	ResultSet rs=null;
	try {
		ps = con.prepareStatement(sql);
		ps.setString(1, tablename);
	    rs=ps.executeQuery();
		
		while (rs.next()) {
			id=rs.getInt("id");
		}
		
	} catch (SQLException e) {
		e.printStackTrace();
	}finally {
		DBUtil.CloseConnection(rs, ps, con);
	}
	return id;
	
}


}
