package com.iupskill.spring.repository;

import com.iupskill.spring.model.Speaker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("speakerRepository")
public class HibernateSpeakerRespositoryImpl implements SpeakerRespository {

    @Override
    public List<Speaker> findAll(){
        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("Mohammed");
        speaker.setLastName("Shahid");

        speakers.add(speaker);
        return speakers;
    }
}
