package lk.ijse.aad.config;


import lk.ijse.aad.bean.SpringBean1;
import lk.ijse.aad.bean.SpringBean2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


//Spring Full Mode - in config class
@Configuration
@ComponentScan(basePackages = "lk.ijse.aad.bean")
public class AppConfig {

//    @Bean
//    public SpringBean1 springBean1(){
//        //plain-object
////        SpringBean2 springBean2One = new SpringBean2();
////        SpringBean1 springBeanTwo = new SpringBean1();
////        System.out.println(springBean2One);
////        System.out.println(springBeanTwo);
//
//        //Inter Bean
//        SpringBean2 springBean2One = springBean2();
//        SpringBean2 springBean2Two = springBean2();
//        System.out.println(springBean2One);
//        System.out.println(springBean2Two);
//        return new SpringBean1();
//    }
//    @Bean
//    public SpringBean2 springBean2(){
//        return new SpringBean2();
//    }
}
