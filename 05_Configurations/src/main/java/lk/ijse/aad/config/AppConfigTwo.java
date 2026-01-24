package lk.ijse.aad.config;


import lk.ijse.aad.bean.C;
import lk.ijse.aad.bean.D;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.aad.bean")
public class AppConfigTwo {
    public AppConfigTwo() {
        System.out.println("AppConfigTwo ");
    }

    @Bean
    public C getC() {
        return new C();
    }

    @Bean
    public D getD() {
        return new D();
    }
}
