package com.feiyu.codegenerator.dao;

import java.util.List;
import java.util.Map;

/**
 * 数据库接口
 * @Author XuZhiJun
 * @Date 2021/12/18
 */
public interface GeneratorDao {

    List<Map<String,Object>> queryList(Map<String, Object> map);

    /**
     * 查询表信息
     * @param tableName
     * @return Map<String,String>
     */
    Map<String, String> queryTable(String tableName);

    /**
     * 查询列信息
     * @param tableName
     * @return List<Map<String,String>>
     */
    List<Map<String,String>> queryColumns(String tableName);
 }
