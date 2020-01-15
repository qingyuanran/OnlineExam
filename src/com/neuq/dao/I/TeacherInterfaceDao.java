package com.neuq.dao.I;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.neuq.bean.Bct;
import com.neuq.bean.PaperString;
import com.neuq.bean.Student;
import com.neuq.bean.StudentGrade;
import com.neuq.bean.Teacher;
import com.neuq.bean.Tkt;
import com.neuq.bean.Xzt;

public interface TeacherInterfaceDao   {
	/**
	 * ��ѯ��ʦ������Ϣ
	 * @param t
	 * @param con
	 * @return
	 * @throws SQLException
	 */
	public Teacher select(Teacher t,Connection con)throws SQLException;
	/**
	 *���༶��ѯѧ��
	 * @param sc
	 * @param con
	 * @return
	 * @throws SQLException
	 */
	public List<Student> select(String sc,Connection con)throws SQLException;//sc--studentclass
	public List<Student> select(Connection con) throws SQLException;
	/**
	 * ����ѧ��
	 * @param s
	 * @param con
	 * @return
	 * @throws SQLException
	 */
	public boolean insert(Student s,Connection con)throws SQLException;
	/**
	 * �޸Ľ�ʦ������Ϣ
	 * @param t
	 * @param con
	 * @return
	 * @throws SQLException
	 */
	public boolean updata(Teacher t,Connection con)throws SQLException;
	/**
	 * ɾ��ѧ��
	 * @param s
	 * @param con
	 * @return
	 * @throws SQLException
	 */
	public boolean delete(String studentname,String studentclass,Connection con)throws SQLException;
	/**
	 * �����Ծ����ֺͰ༶��ѧ���ɼ�
	 * @param studentclass
	 * @param Papername
	 * @return
	 * @throws SQLException
	 */
	public List<StudentGrade> studentgrade(String studentclass,String Papername)throws SQLException;
	/**
	 * �鿴��ʦ������Ϣ
	 * @param parameter
	 * @return
	 * @throws SQLException
	 */
	public Teacher showTeacherInfo(String parameter) throws SQLException; 
	/**
	 * ��������
	 */
	public boolean batchquestion(int questiontype,String filename,String path) throws SQLException;
	/**
	 * ����
	 */
	public boolean setPaper(int[] questionxztid,int[] questiontktid, int[] questionbctid )throws SQLException;
	/**
	 * �鿴���
	 */
	public List<Xzt> showPaperbankxzt()throws SQLException;
	public List<Tkt> showPaperbanktkt()throws SQLException;
	public List<Bct> showPaperbankbct()throws SQLException;
	/**
	 * �ľ�
	 */
	public boolean correctPaper(int score)throws SQLException;
	/**
	 * ����ǰ̨���ص��Ծ����Ʋ鿴�Ծ�
	 */
//	public PaperString showPaper(String papername)throws SQLException;
	/**
	 * login
	 */
	public Teacher login(String username, String pwd) throws SQLException;
	public String[] selectclass()throws SQLException;
	public String[] selectpaper()throws SQLException;
	public List<StudentGrade> selectGrade(String papername)throws SQLException;
}
