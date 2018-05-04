package wang.wincent.winstack.springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * @author Wincent
 * @description: <描述>
 * @create 2018-05-02 11:10
 */
@Configuration
@EnableRedisHttpSession
public class HttpSessionConfig {
}
