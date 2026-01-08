package com.klu.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.klu.demo.model.CourseRegistration;

public class MainApp {

    public static void main(String[] args) {

        // Load Spring configuration file
        ApplicationContext context =
            new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get bean from Spring container
        CourseRegistration cr =
            (CourseRegistration) context.getBean("courseReg");

        // Call business method
        cr.display();
    }
}
