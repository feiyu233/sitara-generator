package com.feiyu.codegenerator.util;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Description 分页工具类
 * @Author feiyu831143
 * @Date 2021/12/24 17:06
 */
@Data
public class Pagination implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 总记录数
     */
    private int totalCount;

    /**
     * 每页记录数
     */
    private int pageSize;

    /**
     * 总页数
     */
    private int totalPage;

    /**
     * 当前页数
     */
    private int currPage;

    /**
     * 列表数据
     */
    private List<?> list;

    /**
     * 分页
     * @param list        列表数据
     * @param totalCount  总记录数
     * @param pageSize    每页记录数
     * @param currPage    当前页数
     */
    public Pagination(List<?> list, int totalCount, int pageSize, int currPage) {
        this.list = list;
        this.totalCount = totalCount;
        this.pageSize = pageSize;
        this.currPage = currPage;
        this.totalPage = (int)Math.ceil((double)totalCount/pageSize);
    }
}
