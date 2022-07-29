package com.njpi.xyh.sgblog;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication
//@MapperScan("com.njpi.xyh.blog_system.dao")  // 是否使用mapper
//@EnableAspectJAutoProxy // 是否使用aop
@EnableOpenApi // 开启swagger
public class QuickStarterApplication {


    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(QuickStarterApplication.class);
        // 是否使用banner
        app.setBannerMode(Banner.Mode.CONSOLE);
        app.run(args);
    }

}
