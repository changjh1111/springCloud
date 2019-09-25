package com.chang.eureka;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EurekaApplicationTests {

    @Test
    public void contextLoads() {
        System.out.println("11");
    }
    @Test
    public void contextLoads1() {
        ClassPathResource res=new ClassPathResource("application-bean.xml");
        DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(res);
        A performer=(A) factory.getBean("a");
        performer.getName();
        ApplicationContext ac = new ClassPathXmlApplicationContext("application-bean.xml");

    }


}
