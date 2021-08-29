package com.example.spring.demo.Repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DemoRepository {
  @Select("SELECT board_name FROM BOARDS WHERE board_id = 1")
  String init();
}
