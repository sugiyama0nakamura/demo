package com.example.spring.demo.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import lombok.RequiredArgsConstructor;

import java.util.List;

import com.example.spring.demo.Dto.DemoDto;
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
  public String init(ModelAndView mv){
    return demoService.init();
  }

  @RequestMapping(value="/demo")
  public DemoDto sample(ModelAndView mv){
    return demoService.sample();
  }
}