package com.kaelvihn.aware.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author : KaelvihN
 * @date : 2023/8/16 12:48
 */


@Slf4j
public class MyBean implements BeanNameAware, ApplicationContextAware ,InitializingBean{

    /**
     * BeanNameAware
     */
    @Override
    public void setBeanName(String name) {
        log.info("setBeanName>>>" + name);
    }

    /**
     *ApplicationContextAware
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        log.info("setApplicationContext>>>"+applicationContext);
    }

    /**
     *InitializingBean
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("afterPropertiesSet>>>");
    }

    @Autowired
    public void autowiredInjection(ApplicationContext applicationContext) {
        log.info("autowiredInjection>>>"+applicationContext);
    }

    @PostConstruct
    public void init() {
        log.info("init>>>");
    }
}

