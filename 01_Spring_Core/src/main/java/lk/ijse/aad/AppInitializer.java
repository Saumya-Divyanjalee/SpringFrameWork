package lk.ijse.aad;


import lk.ijse.aad.bean.MyConnection;
import lk.ijse.aad.bean.SpringBean;
import lk.ijse.aad.bean.TestBean;
import lk.ijse.aad.config.ApplicationConfig;
import lk.ijse.aad.newbean.NewTestBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        //context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(ApplicationConfig.class);
        context.refresh();



//        SpringBean springBean1 = new SpringBean();
//        SpringBean springBean2 = new SpringBean();
//        System.out.println("POJO 1 SpringBean-AppInitializer1"+springBean1);
//        System.out.println("POJO 2 SpringBean-AppInitializer2"+springBean2);

        SpringBean springBean3 = context.getBean(SpringBean.class);// it is a bean .it has singleton (same id)
        System.out.println(springBean3);
        SpringBean springBean4 = context.getBean(SpringBean.class);
        System.out.println(springBean4);

        //Beam Id
        SpringBean springBean5 = (SpringBean) context.getBean("springBean");
        System.out.println("Spring Bean by ID : " + springBean5);

//        TestBean testBean = (TestBean) context.getBean("testBean");//
//        System.out.println("Spring Bean by ID : " + testBean);

        TestBean testBean1 = (TestBean) context.getBean("exampleBean");//
        System.out.println("Spring Bean by ID : " + testBean1);

        TestBean testBean2 = context.getBean("exampleBean", TestBean.class);
        System.out.println("Spring Bean by ID : " + testBean2);
//
//        NewTestBean testBean3 = (NewTestBean) context.getBean("newTestBean");
//        System.out.println("Spring Bean by ID : " + testBean3);

        SpringBean springBean = context.getBean(SpringBean.class);
        springBean.springBean();

//        MyConnection myConnection = (MyConnection) context.getBean("myConnection");
//        System.out.println(myConnection);

        MyConnection myConnection1 = context.getBean(MyConnection.class);
        System.out.println(myConnection1);

//        MyConnection myConnection2 = (MyConnection) context.getBean("yConnection");
//        System.out.println(myConnection2);

        MyConnection myConnection2 = (MyConnection) context.getBean("saumya");
        System.out.println(myConnection2);








        context.registerShutdownHook();





    }
}