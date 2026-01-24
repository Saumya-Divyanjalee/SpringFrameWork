package lk.ijse.aad.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


public class SpringBean1 implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, DisposableBean, InitializingBean {
    public SpringBean1(){
        System.out.println("SpringBean 1");
    }
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("SpringBean 1 setBeanFactory");

    }

    @Override
    public void setBeanName(String name) {
        System.out.println("SpringBean 1 setBeanName");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("SpringBean 1 destroy");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("SpringBean 1 afterPropertiesSet");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("SpringBean 1 setApplicationContext");

    }
}
