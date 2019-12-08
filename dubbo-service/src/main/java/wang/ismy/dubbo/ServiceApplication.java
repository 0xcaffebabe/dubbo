package wang.ismy.dubbo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author MY
 * @date 2019/12/8 16:15
 */
@SpringBootApplication
@EnableDubbo
public class ServiceApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ServiceApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);
    }
}
