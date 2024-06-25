package com.itheima.config;

import com.github.pagehelper.PageInterceptor;
import org.aopalliance.intercept.Interceptor;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.util.Properties;

@MapperScan("com.itheima.dao")
public class MybatisConfig {

    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(@Autowired DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);

        // 添加分页插件
        PageInterceptor pageInterceptor = new PageInterceptor();
        Properties properties = new Properties();
        // 设置分页插件的属性，例如数据库类型等
        properties.setProperty("helperDialect", "mysql");
        pageInterceptor.setProperties(properties);
        sessionFactory.setPlugins(pageInterceptor);
        return sessionFactory;
    }
}
