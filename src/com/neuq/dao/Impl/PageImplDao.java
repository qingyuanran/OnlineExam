package com.neuq.dao.Impl;

import com.neuq.bean.StudentGrade;
import com.neuq.dao.I.PageInterfaceDao;

import java.util.List;

public class PageImplDao implements PageInterfaceDao {

    @Override
    public int findTotalCount() {
        String sql = "select count(*) from ";
        return 0;
    }

    @Override
    public List<StudentGrade> findByPage(int start, int rows) {
        return null;
    }
}
