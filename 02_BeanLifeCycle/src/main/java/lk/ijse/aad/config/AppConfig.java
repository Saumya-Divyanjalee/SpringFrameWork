package lk.ijse.aad.config;


import lk.ijse.aad.bean.MyConnection;
import lk.ijse.aad.bean.SpringBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.aad.bean")
public class AppConfig {
    public AppConfig() {
        System.out.println("AppConfig");
    }
    @Bean
    MyConnection myConnection() {
        return new MyConnection();
    }
//    @Bean
//    SpringBean springBean() {
//        return new SpringBean();
//    }
}
