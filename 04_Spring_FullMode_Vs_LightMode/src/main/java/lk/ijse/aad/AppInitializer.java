package lk.ijse.aad;

import lk.ijse.aad.bean.SpringBean1;
import lk.ijse.aad.bean.SpringBean2;
import lk.ijse.aad.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
//        SpringBean1 springBean1 = context.getBean(SpringBean1.class);
//        SpringBean2 springBean2 = context.getBean(SpringBean2.class);




        context.registerShutdownHook();


    }
}