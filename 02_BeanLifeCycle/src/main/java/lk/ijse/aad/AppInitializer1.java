package lk.ijse.aad;

import lk.ijse.aad.bean.MyConnection;
import lk.ijse.aad.bean.SpringBean;
import lk.ijse.aad.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AppInitializer1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        SpringBean springBean = (SpringBean) context.getBean("springBean");
        System.out.println(springBean);

//        MyConnection myConnection = (MyConnection) context.getBean("myConnection");
//        System.out.println(myConnection);

        context.registerShutdownHook();

    }
}