package com.kaelvihn.aware.config;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : KaelvihN
 * @date : 2023/8/16 12:48
 */

@Configuration
@Slf4j
public class MyConfig1 {
    @Autowired
    public void setApplicationContext(ApplicationContext applicationContext) {
        log.info("注入ApplicationContext");
    }

    @PostConstruct
    public void init() {
        log.info("初始化");
    }

    @Bean
    public BeanFactoryPostProcessor processor() {
        return beanFactory -> {
            log.info("执行processor");
        };
    }
}
