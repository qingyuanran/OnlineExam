package com.neuq.dao.I;

import java.util.List;

import com.neuq.bean.Mistakes;

/**
 * ���⼯���ݿ�ӿ���
 *
 */
public interface MistakesInterfaceDao {

	/**
	 * ����һ������
	 * @param mistakes
	 * @return
	 */
	public boolean insert(Mistakes mistakes);
	
	/**
	 * ɾ��һ������
	 * @param mistakes
	 * @return
	 */
	public boolean delete(Mistakes mistakes);
	
	
	
	/**
	 * ��ѯĳ��ѧ����ȫ������  
	 * @param username ѧ������
	 * @return ���⼯��
	 */
	public List<Mistakes> selectxzt(String username);
	public List<Mistakes> selecttkt(String username);
	public List<Mistakes> selectbct(String username);
	
	/**
	 * ��֪ʶ���ѯĳ��ѧ����ȫ������
	 * @param username ѧ������
	 * @param  questionpoint ֪ʶ��
	 * @return ���⼯��
	 */
	public List<Mistakes> select(String username,String questionpoint);
}
