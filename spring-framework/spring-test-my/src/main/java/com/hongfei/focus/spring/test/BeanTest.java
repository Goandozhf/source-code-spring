package com.hongfei.focus.spring.test;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.hongfei.focus.spring.bean.Bean1;

@SuppressWarnings("deprecation")
public class BeanTest {

	
	@Test
	public void test() {
		
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
		
		Bean1 bean1 = (Bean1) beanFactory.getBean("bean1");
		
		System.out.println(bean1.getS());
		
		
		
	}

}
