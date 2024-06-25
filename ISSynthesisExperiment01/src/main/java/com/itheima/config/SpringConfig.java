package com.itheima.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
@ComponentScan(value = {"com.itheima.service","com.itheima.config","com.itheima.controller"})//注解扫描
@Import({MybatisConfig.class, jdbcConfig.class,MybatisConfig.class})//导入其他配置类 这样被导入的配置类就不需要添加@Configuration标签了
public class SpringConfig {

    //事务
    @Bean
    public DataSourceTransactionManager transactionManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }
}
