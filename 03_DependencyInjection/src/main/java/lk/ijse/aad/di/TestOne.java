package lk.ijse.aad.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TestOne implements DIOne {

DI di;
    @Autowired
    @Override
    public void diOne(DI di) {
        this.di = di;

    }


//    DI di ;

//    @Autowired
//    public TestOne(DI di) {
//        this.di = di;
//
//    }

//    @Autowired
//    public void setter(DI di){
//        this.di = di;
//    }
    public void chatWithTestTwo(){

        di.chat();
    }



}
