package com.kaelvihn.aware;

import com.kaelvihn.aware.common.MyBean;
import com.kaelvihn.aware.config.MyConfig1;
import com.kaelvihn.aware.config.MyConfig2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;
import org.springframework.context.annotation.ConfigurationClassPostProcessor;
import org.springframework.context.support.GenericApplicationContext;


@Slf4j
public class AwareApplication {
    public static void main(String[] args) {
        GenericApplicationContext context = new GenericApplicationContext();
//        context.registerBean(MyBean.class);
//        context.registerBean(MyConfig1.class);
        context.registerBean(MyConfig2.class);
        context.registerBean(AutowiredAnnotationBeanPostProcessor.class);
        context.registerBean(CommonAnnotationBeanPostProcessor.class);
        //解析配置类中的注解
        context.registerBean(ConfigurationClassPostProcessor.class);
        //容器初始化
        context.refresh();
        //销毁
        context.close();
    }
}
