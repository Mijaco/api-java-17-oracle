package com.bezkoder.spring.r2dbc.h2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bezkoder.spring.r2dbc.h2.model.Tutorial;

import java.util.List;

@Repository
public interface TutorialRepository extends JpaRepository<Tutorial, Integer>{
  List<Tutorial> findByTitleContaining(String title);

  List<Tutorial> findByPublished(boolean isPublished);
}
