package com.feiyu.codegenerator.util;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Description 生成器配置
 * @Author feiyu831143
 * @Date 2021/12/24 17:10
 */
@Component
@Data
@PropertySource(value = "generator.properties")
public class GenPropModel {
    @Value("${commonModuleName}")
    private String commonModuleName;

    @Value("${basePackagePath}")
    private String basePackagePath;

    @Value("${moduleName}")
    private String moduleName;

    @Value("${author}")
    private String author;

}
