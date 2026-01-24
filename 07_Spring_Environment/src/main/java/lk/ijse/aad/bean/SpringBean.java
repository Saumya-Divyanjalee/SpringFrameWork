package lk.ijse.aad.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringBean implements InitializingBean {

    @Value("${db.name}")
    private String db;
    @Value("${db.user}")
    private String dbUser;
    @Value("${db.password}")
    private String dbPassword;
    @Value("${db.url}")
    public String dbUrl;



    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(db);
        System.out.println(dbUser);
        System.out.println(dbPassword);
        System.out.println(dbUrl);

    }
}
