package lk.ijse.aad.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Boy{
    @Qualifier("girl1")
@Autowired
//    Girl girl;
Agreement agreement;
    public Boy(){
        System.out.println("Boy object created");
    }
    public void chatWithGirl(){

        agreement.chat();
    }

}
