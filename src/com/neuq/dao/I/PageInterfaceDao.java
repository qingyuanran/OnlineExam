package com.neuq.dao.I;

import com.neuq.bean.StudentGrade;

import java.util.List;

public interface PageInterfaceDao {
    //�����ܼ�¼��
    public int findTotalCount();
    //��ҳ������ÿһҳ������
    public List<StudentGrade> findByPage(int start, int rows);
}
