package lk.ijse.aad.config;


import lk.ijse.aad.bean.A;
import lk.ijse.aad.bean.B;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "lk.ijse.aad.bean")
public class AppConfigOne {
    public AppConfigOne() {
        System.out.println("AppConfigOne ");
    }

    @Bean
    public A getA() {
        return new A();
    }


    @Bean
    public B getB() {
        return new B();
    }
}
