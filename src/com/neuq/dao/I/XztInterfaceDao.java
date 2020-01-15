package com.neuq.dao.I;

import java.util.List;

import com.neuq.bean.Xzt;



/**
 * 选择题数据库接口类
 *
 */
public interface XztInterfaceDao {


	/**
	 * 增加一道选择题
	 * @param xzt
	 * @return
	 */
	public boolean insert(Xzt xzt);

	/**
	 * 删除一道选择题
	 * @param xzt
	 * @return
	 */
	public boolean delete(Xzt xzt);

	/**
	 * 更新修改一道选择题
	 * @param xzt
	 * @return
	 */
	public boolean update(Xzt xzt);

	/**
	 * 查询全部选择题
	 * @param 无
	 * @return 选择题集合
	 */
	public List<Xzt> select();

	/**
	 * 按知识点查询选择题
	 * @param questionpoint 知识点
	 * @return 选择题集合
	 */
	public List<Xzt> select(String questionpoint);
	/**
	 * 按题目查询id
	 * @param question 知识点
	 * @return 选择题集合
	 */
	public int selectId(String question);
}