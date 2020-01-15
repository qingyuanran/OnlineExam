
package com.neuq.bean;

import org.apache.poi.hssf.record.formula.functions.T;

import java.util.List;

/**
 * 分页类，先放着，以后再实现
 */
public class Page {
    private int totalCount;  //总的记录数
    private int totalPage;   //总的页码
    private List<StudentGrade> list;    //每页的数据
    private int currentPage; //当前页
    private int rows;        //每页显示的条数

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List<StudentGrade> getList() {
        return list;
    }

    public void setList(List<StudentGrade> list) {
        this.list = list;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "PageBean{" +
                "totalCount=" + totalCount +
                ", totalPage=" + totalPage +
                ", list=" + list +
                ", currentPage=" + currentPage +
                ", rows=" + rows +
                '}';
    }

}
