package wang.wincent.winstack.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @author Wincent
 * @description: <描述>
 * @create 2018-04-28 14:46
 */
@SpringBootApplication
public class WinstackSpringboot extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(WinstackSpringboot.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(WinstackSpringboot.class);
    }

}
