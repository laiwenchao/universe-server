package com.server.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author laiwenchao
 * @Classname SpringInit
 * @Description
 * @Date 2019-10-05 09:18
 */
public class SpringInit implements BeanNameAware, BeanFactoryAware, BeanClassLoaderAware,
        BeanPostProcessor, InitializingBean, DisposableBean {
    @Override
    public void setBeanName(String s) {
        System.out.println("BeanNameAware#setBeanName:" + s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactoryAware#setBeanFactory:" + beanFactory);
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("BeanClassLoaderAware#setBeanClassLoader:" + classLoader);
    }

    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("BeanPostProcessor#postProcessAfterInitialization");
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("BeanPostProcessor#postProcessAfterInitialization");
        return o;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean#destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean#afterPropertiesSet");
    }
}
