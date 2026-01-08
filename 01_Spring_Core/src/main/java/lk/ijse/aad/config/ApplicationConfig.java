package lk.ijse.aad.config;


import lk.ijse.aad.bean.MyConnection;
import lk.ijse.aad.bean.SpringBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.w3c.dom.ls.LSOutput;

@Configuration
@ComponentScan(basePackages = "lk.ijse.aad.bean")
//@ComponentScan(basePackages = "lk.ijse.aad.bean")
@ComponentScan(basePackageClasses =  SpringBean.class)//one class

public class ApplicationConfig {
    public ApplicationConfig() {
        System.out.println("ApplicationConfig");
    }

    @Bean("saumya")
    MyConnection myConnection(){
        return new MyConnection();
    }

//    @Bean
//    MyConnection yConnection(){
//        return new MyConnection();
//    }
}
