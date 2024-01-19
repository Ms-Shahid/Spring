package com.iupskill.spring;

import com.iupskill.spring.model.Speaker;
import com.iupskill.spring.service.SpeakerService;
import com.iupskill.spring.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        //SpeakerService service = new SpeakerServiceImpl(); //hardcoded reference of speaker interface
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        SpeakerService service = applicationContext.getBean("speakerService", SpeakerService.class);
        //SpeakerService service1 = applicationContext.getBean("speakerService", SpeakerService.class);
        //SpeakerService service2 = applicationContext.getBean("speakerService", SpeakerService.class);

       // System.out.println(" object of service1 -> " + service1);
       // System.out.println(" object of service2 -> " + service2);

        System.out.println(service.findAll().get(0).getFirstName());
        System.out.println(service.findAll().get(0).getLastName());
    }
}