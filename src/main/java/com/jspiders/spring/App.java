package com.jspiders.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.spring.dto.Product;
import com.jspiders.spring.dto.Student;

public class App {
    public static void main(String[] args) {
    	ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/beans.xml");
    	
    	System.out.println(context.getBean("student3",Student.class));
    	System.out.println(context.getBean("product3",Product.class));
    }
}
