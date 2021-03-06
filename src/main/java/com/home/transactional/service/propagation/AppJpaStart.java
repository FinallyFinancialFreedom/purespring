package com.home.transactional.service.propagation;

import com.home.transactional.service.propagation.OuterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by liyang on 25/10/2016.
 * li.acerphoenix@gmail.com
 * email to me maybe
 */
@Slf4j
public class AppJpaStart {
    public static void main(String[] args) {
        startByXml();
    }

    private static void startByXml() {
//      when you new applicationContext,the beans will be instantiated.except you put a @Lazy annotation on the bean.
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        OuterService innerService = applicationContext.getBean(OuterService.class);
        innerService.outerCall();
    }
}
