package lk.ijse.aad;

import lk.ijse.aad.bean.A;
import lk.ijse.aad.config.AppConfig;
import lk.ijse.aad.config.AppConfigOne;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
//        context.register(AppConfigOne.class);
        context.refresh();


        context.registerShutdownHook();
    }
}