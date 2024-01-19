package com.iupskill.spring.repository;

import com.iupskill.spring.model.Speaker;

import java.util.List;

public interface SpeakerRespository {
    List<Speaker> findAll();
}
