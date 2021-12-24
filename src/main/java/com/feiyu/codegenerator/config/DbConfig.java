package com.feiyu.codegenerator.config;

import com.feiyu.codegenerator.dao.GeneratorDao;
import com.feiyu.codegenerator.dao.MySQLGeneratorDao;
import com.feiyu.codegenerator.exception.GeneratorException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * 数据库配置
 * @author XuZhiJun
 * @date 2021/12/18
 */
@Configuration
public class DbConfig {

    @Value("${feiyu.database:mysql}")
    private String database;

    private MySQLGeneratorDao mySQLGeneratorDao;

    @Bean
    @Primary
    public GeneratorDao getGeneratorDao(){
        if ("mysql".equalsIgnoreCase(database)){
            return mySQLGeneratorDao;
        } else {
            throw new GeneratorException("不支持当前数据库：" + database);
        }
    }
}
