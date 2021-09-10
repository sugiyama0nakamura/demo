package com.example.spring.demo.Repository;

import java.util.List;

import com.example.spring.demo.Dto.DemoDto;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DemoRepository {
  @Select("SELECT board_name FROM BOARDS WHERE board_id = 1")
  String init();

  @Select("SELECT board_id FROM BOARDS WHERE board_id = 1")
  DemoDto sample();
}
