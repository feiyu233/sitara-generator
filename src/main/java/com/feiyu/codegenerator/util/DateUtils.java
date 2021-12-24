package com.feiyu.codegenerator.util;

import cn.hutool.core.util.StrUtil;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description 日期处理
 * @Author feiyu831143
 * @Date 2021/12/24 16:57
 */
public class DateUtils {

    public final static String DATE_PATTERN = "yyyy-MM-dd";

    public final static String DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";

    public static String format(Date date){
        return format(date,DATE_PATTERN);
    }

    public static String format(Date date, String pattern) {
        if(date != null){
            SimpleDateFormat df = new SimpleDateFormat(pattern);
            return df.format(date);
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(StrUtil.toCamelCase("CreateUserId"));
    }
}
