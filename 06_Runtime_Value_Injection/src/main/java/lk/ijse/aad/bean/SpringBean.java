package lk.ijse.aad.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean  {
//    implements InitializingBean
//    private String name = "SpringBean";

//@Value("saumya")
//private String name;

    //1 st step
//    @Autowired(required = false)
//    public SpringBean(@Value("saumya")String name,@Value("22")int age) {
//        System.out.println(name);
//        System.out.println(age);
//    }


    @Autowired(required = false)
    public SpringBean(@Value("sau")String nameList[],@Value("12")int number,@Value("IJSE")String address) {
        System.out.println(nameList.length);
        System.out.println(number);
        System.out.println(address);
    }
    //this constructor runing
    @Autowired(required = false)
    public SpringBean(@Value("saumya")String name,@Value("22")int age,@Value("sau")String name2) {
        System.out.println(name);
        System.out.println(age);
        System.out.println(name2);
    }


//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println(name);
//    }
}
