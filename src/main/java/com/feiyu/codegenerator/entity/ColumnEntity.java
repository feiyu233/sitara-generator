package com.feiyu.codegenerator.entity;

import lombok.Data;

/**
 * @Description 列的属性
 * @Author feiyu831143
 * @Date 2021/12/24 16:50
 */
@Data
public class ColumnEntity {

    /**
     * 列名
     */
    private String columnName;

    /**
     * 列名类型
     */
    private String dataType;

    /**
     * 列名备注
     */
    private String comments;

    /**
     * 属性名称(第一个字母大写)，如：user_name => UserName
     */
    private String attrName;

    /**
     * 属性名称(第一个字母小写)，如：user_name => userName
     */
    private String attrname;

    /**
     * 属性类型
     */
    private String attrType;

    /**
     * 自增
     */
    private String extra;
}

