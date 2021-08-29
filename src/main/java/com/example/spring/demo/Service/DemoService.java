package com.example.spring.demo.Service;

import com.example.spring.demo.Repository.DemoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class DemoService {
  private final DemoRepository demoRepository;

  @Autowired
  public DemoService(DemoRepository demoRepository) {
    this.demoRepository = demoRepository;
  }
  
  public String init(){
    return demoRepository.init();
  }
  
}
