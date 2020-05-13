package com.car.manage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@MapperScan("com.car.manage.dao")
public class ManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManageApplication.class, args);
    }
    @Bean
    public WebMvcConfigurer webMvcConfigurer () {

        WebMvcConfigurer adapter = new WebMvcConfigurer() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/index").setViewName("index");
                registry.addViewController("/test").setViewName("test");

                registry.addViewController("/car/carList").setViewName("car/carList");
//                registry.addViewController("/driver/driverAdd").setViewName("driver/driverAdd");
//                registry.addViewController("/order/orderAdd").setViewName("/order/orderAdd");
//                registry.addViewController("/test").setViewName("test");
//                registry.addViewController("/system").setViewName("system");
//                registry.addViewController("/insert").setViewName("insert");
//                registry.addViewController("/carList").setViewName("carList");


            }
        };
        return adapter;
    }

}
