package lk.ijse.aad.di;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TestTwo implements DI,DIOne {
    @Override
    public void chat() {
        System.out.println("TestTwo chat");
    }


    @Override
    public void diOne(DI di) {
        System.out.println("TestTwo diOne");

    }
}
