package org.zxbro.tms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : yu.zhang
 * @date : 2022/10/20 7:06 PM
 * Email : zephyrjung@126.com
 **/
@SpringBootApplication
public class AppStart {
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(AppStart.class, args);
    }
}
