package lk.ijse.aad.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "lk.ijse.aad.bean")
public class AppConfig {
    public AppConfig() {
        System.out.println("AppConfig");
    }
}
