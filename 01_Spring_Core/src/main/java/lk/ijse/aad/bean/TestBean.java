package lk.ijse.aad.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("exampleBean")
@Scope("prototype")
public class TestBean {
    public TestBean() {
        System.out.println("TestBean");
    }
}
