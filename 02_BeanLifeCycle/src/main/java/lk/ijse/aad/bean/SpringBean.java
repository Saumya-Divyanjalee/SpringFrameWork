package lk.ijse.aad.bean;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SpringBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware , DisposableBean, InitializingBean {
    public SpringBean() {
        System.out.println("SpringBean");
    }
    public void springBean() {
        System.out.println("SpringBeanMethod");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext");

    }

    @Override
    public void setBeanName(String name) {
        System.out.println("setBeanName");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }
}
