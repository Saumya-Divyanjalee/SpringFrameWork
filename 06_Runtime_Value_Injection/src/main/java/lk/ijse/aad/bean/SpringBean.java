package lk.ijse.aad.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean implements InitializingBean {
//    private String name = "SpringBean";

@Value("saumya")
private String name;

    public SpringBean() {
        System.out.println(name);
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(name);
    }
}
