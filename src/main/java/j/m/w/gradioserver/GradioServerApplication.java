package j.m.w.gradioserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * The base of our application, @SpringBootApplication adds a few annotations automatically. including... <br><br>
 * @Configuration
 * @EnableAutoConfiguration
 * @ComponentScan
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = {"j.m.w"})
public class GradioServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GradioServerApplication.class, args);
    }
}
