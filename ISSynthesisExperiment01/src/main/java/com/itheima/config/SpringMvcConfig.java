package com.itheima.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.thymeleaf.spring5.ISpringTemplateEngine;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ITemplateResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

import javax.servlet.ServletContext;

@Configuration
@EnableWebMvc
@ComponentScan("com.itheima.controller")
public class SpringMvcConfig implements WebMvcConfigurer {
    @Autowired
    private ServletContext servletContext;
    //配置静态资源直接访问
        @Override
        public void addResourceHandlers(ResourceHandlerRegistry registry) {
            registry.addResourceHandler("/pages/**")
                    .addResourceLocations("/pages/");
            registry.addResourceHandler("/js/**")
                    .addResourceLocations("/js/");
            registry.addResourceHandler("/css/**")
                    .addResourceLocations("/css/");
            registry.addResourceHandler("/images/**")
                    .addResourceLocations("/images/");
            registry.addResourceHandler("/assets/**")
                    .addResourceLocations("/assets/");
            registry.addResourceHandler("/personalHtml/**")
                    .addResourceLocations("/personalHtml/");
    }
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/pages/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
    /*
    // 配置Thymeleaf视图解析器
    @Bean
    public ViewResolver thymeleafViewResolver() {
        ThymeleafViewResolver resolver = new ThymeleafViewResolver();
        resolver.setTemplateEngine(templateEngine());
        resolver.setCharacterEncoding("UTF-8");
        return resolver;
    }

    // 配置Thymeleaf模板引擎
    @Bean
    public ISpringTemplateEngine templateEngine() {
        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        templateEngine.setEnableSpringELCompiler(true);
        templateEngine.setTemplateResolver(templateResolver());
        return templateEngine;
    }

    // 配置Thymeleaf模板解析器
    @Bean
    public ITemplateResolver templateResolver() {
        ServletContextTemplateResolver templateResolver = new ServletContextTemplateResolver(servletContext);
        templateResolver.setPrefix("/personalHtml/"); // 设置HTML模板所在路径的前缀
        templateResolver.setSuffix(".html"); // 设置HTML模板的后缀
        templateResolver.setTemplateMode("HTML5"); // 设置模板模式
        templateResolver.setCharacterEncoding("UTF-8"); // 设置字符编码
        templateResolver.setCacheable(false); // 设置是否缓存，开发时可设置为false，生产环境建议设置为true
        return templateResolver;
    }
    */
/*
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 注册拦截器
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/page/submit.html");
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/personalHtml/personalHome.html");
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/personalHtml/personalSetting.html");
    }
*/

}
