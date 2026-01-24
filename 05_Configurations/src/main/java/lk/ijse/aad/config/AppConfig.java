package lk.ijse.aad.config;


import lk.ijse.aad.bean.A;
import lk.ijse.aad.bean.SpringBean;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "lk.ijse.aad.bean")
@Import({AppConfigOne.class,AppConfigTwo.class})
@ImportResource("classpath:hibernate.cfg.xml")
//@ImportResource("file:C/config/")
public class AppConfig {
    public AppConfig() {
        System.out.println("AppConfig");
    }


}
