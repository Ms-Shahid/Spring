package com.iupskill.spring.service;

import com.iupskill.spring.model.Speaker;
import com.iupskill.spring.repository.SpeakerRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRespository repository; //new HibernateSpeakerRepositoryImpl();

    public SpeakerServiceImpl(){
        System.out.println("Speaker Service impl no-args constructor");
    }
     /*Constructor injection*/
    public SpeakerServiceImpl (SpeakerRespository speakerRespository){
        System.out.println("Speaker Service impl constructor");
        repository = speakerRespository;
    }
    /*Setter injection*/
    @Autowired
    public void setRepository(SpeakerRespository respository) {
        System.out.println("Speaker Service impl setter injection");
        this.repository = respository;
    }

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }
}
