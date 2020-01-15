package com.neuq.dao.I;

import com.neuq.bean.StudentGrade;

import java.util.List;

public interface PageInterfaceDao {
    //返回总记录数
    public int findTotalCount();
    //分页，返回每一页的数据
    public List<StudentGrade> findByPage(int start, int rows);
}
