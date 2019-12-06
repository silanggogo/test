package com.buba.testdemo2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 *   springboot项目中默认的配置文件叫application.properties(在resources包下面)
 *  这个配置文件中能配置所有的能配置的信息
 *  这个配置文件还有一种显示方式：application.yml
 *
 *
 * @ServletComponentScan: 扫描当前包及子包下所有的servlet
 *
 *
 */
@SpringBootApplication
@ServletComponentScan
@MapperScan(value = "com.buba.testdemo2.mapper")  //扫描对应包下的接口
@EnableSwagger2
@EnableScheduling
public class Testdemo2Application {

    public static void main(String[] args) {
        SpringApplication.run(Testdemo2Application.class, args);
    }

}
