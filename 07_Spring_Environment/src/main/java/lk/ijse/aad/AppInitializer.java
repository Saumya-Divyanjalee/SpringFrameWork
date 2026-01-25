package lk.ijse.aad;

import lk.ijse.aad.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;
import java.util.Properties;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
//
//        //1.System Variable
////        Map<String, String>  systemVariables = System.getenv();
////        for(String name : systemVariables.keySet()) {
////            System.out.println(name+":"+systemVariables.get(name));
////        }
       context.registerShutdownHook();
//
//        //2.Java Properties
////        Properties properties = System.getProperties();
////        for(Object key : properties.keySet()) {
////            System.out.println(key+":"+properties.get(key));
////        }
//    }




}
}