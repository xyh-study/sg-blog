package com.njpi.xyh.sgblog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;

/**
 * @author: xyh
 * @create: 2022/7/29 16:39
 */
@Configuration
@EnableOpenApi
public class SwaggerConfig {

    // 前台接口
    @Bean
    public Docket blogDocket(){
        return new Docket(DocumentationType.OAS_30)
                .groupName("blog")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.njpi.xyh.sgblog.controller.blog"))
                .build()
                .apiInfo(blogInfo());
    }


    // 后台接口
    @Bean
    public Docket adminDocket(){
        return new Docket(DocumentationType.OAS_30)
                .groupName("admin")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.njpi.xyh.sgblog.controller.admin"))
                .build()
                .apiInfo(adminInfo());
    }


    // 前台信息
    @Bean
    public ApiInfo blogInfo(){
        return new ApiInfo("blog 前台接口"
                ,"前端接口"
                ,"3.0"
                ,""
                ,new Contact("徐小云", "", "2773604834@qq.com")
                ,"Apache 2.0"
                ,"http://www.apache.org/licenses/LICENSE-2.0"
                ,new ArrayList());
    }

    // 后端信息
    @Bean
    public ApiInfo adminInfo(){
        return new ApiInfo("blog 后端接口"
                ,"后端接口"
                ,"3.0"
                ,""
                ,new Contact("徐小云", "", "2773604834@qq.com")
                ,"Apache 2.0"
                ,"http://www.apache.org/licenses/LICENSE-2.0"
                ,new ArrayList());
    }


}
