package com.bezkoder.spring.r2dbc.h2.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bezkoder.spring.r2dbc.h2.model.Tutorial;
import com.bezkoder.spring.r2dbc.h2.repository.TutorialRepository;

@Service
public class TutorialService {

  @Autowired
  TutorialRepository tutorialRepository;

  public List<Tutorial> findAll() {
    return tutorialRepository.findAll();
  }


  public Optional<Tutorial> findById(int id) {
    return tutorialRepository.findById(id);
  }

}
