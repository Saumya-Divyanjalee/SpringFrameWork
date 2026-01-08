package lk.ijse.aad.bean;

import org.springframework.stereotype.Component;

@Component//use this printed output

public class SpringBean {
    public SpringBean() {
        System.out.println("SpringBean");
    }
    public void springBean() {
        System.out.println("SpringBean printMessage");
    }

}
