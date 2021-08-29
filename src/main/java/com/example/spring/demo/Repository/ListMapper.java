package com.example.spring.demo.Repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ListMapper {
  @Select("SELECT board_id, board_name, delete_flg, create_user, create_day, update_user, update_day FROM BOARDS WHERE board_id = #{boardId} ")
  List getBoardInfo(String boardId);

  @Select("SELECT list_id, list_name, delete_flg, create_user, create_day, update_user, update_day FROM LISTS WHERE board_id = #{boardId} ")
  List getListInfo(String boardId);

  @Select("SELECT card_id, card_name, card_details, delete_flg, deadline_start_date, deadline_end_date, create_user, create_day, update_user, update_day FROM CARDS WHERE board_id = #{boardId} ")
  List getCardInfo( String boardId);

  @Select("SELECT progress_id, progress_rate FROM PROGRESS WHERE board_id = #{boardId} ")
  List getprogressInfo(String boardId);
}
