package com.iupskill.spring;

import com.iupskill.spring.repository.HibernateSpeakerRespositoryImpl;
import com.iupskill.spring.repository.SpeakerRespository;
import com.iupskill.spring.service.SpeakerService;
import com.iupskill.spring.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(name = "speakerService")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON) //same object address for every new request
    //@Scope(value = BeanDefinition.SCOPE_PROTOTYPE)  //unique object for every new request

    public SpeakerService getSpeakerService() {
        //return new SpeakerServiceImpl();

        /*The below lines are for setter injection with bean named speakerRepository*/
        //SpeakerServiceImpl service = new SpeakerServiceImpl();
        //service.setRepository(getSpeakerRepository());
        //return service;

        /* Constructor injection*/
        //SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());

        /* no-arg Constructor injection8*/
        SpeakerServiceImpl service = new SpeakerServiceImpl();
        return service;
    }
    @Bean(name = "speakerRepository")
    public SpeakerRespository getSpeakerRepository(){
        return new HibernateSpeakerRespositoryImpl();
    }
}
