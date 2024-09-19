package com.bezkoder.spring.r2dbc.h2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bezkoder.spring.r2dbc.h2.model.Tutorial;
import com.bezkoder.spring.r2dbc.h2.service.TutorialService;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class TutorialController {
  @Autowired
  TutorialService tutorialService;

  
  @GetMapping("/tutorials")
  @ResponseStatus(HttpStatus.OK)
  public List<Tutorial> getAllTutorials(@RequestParam(required = false) String title) {
      return tutorialService.findAll();
  }

  @GetMapping("/tutorials/{id}")
  @ResponseStatus(HttpStatus.OK)
  public Optional<Tutorial> getTutorialById(@PathVariable("id") int id) {
    return tutorialService.findById(id);
  }




}
