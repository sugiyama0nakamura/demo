package com.example.spring.demo.Controller;

import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import com.example.spring.demo.Service.BoardService;
import com.example.spring.demo.Service.DemoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DemoController {

  private final DemoService demoService;

  @Autowired
  public DemoController(DemoService demoService){
    this.demoService = demoService;
  }

  @RequestMapping(value="/")
  public String init(){
    return demoService.init();
  }
}