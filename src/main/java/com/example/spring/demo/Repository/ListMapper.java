package com.example.spring.demo.Repository;

import java.security.Timestamp;
import java.util.Collection;
import java.util.List;

import com.example.spring.demo.Dto.BoardDto;
import com.example.spring.demo.Dto.CardDto;
import com.example.spring.demo.Dto.ListDto;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 * @author @sugiyama
 * 
 * List画面のMapperクラス
 */
@Mapper
public interface ListMapper {

  @Select("SELECT board_id, board_name, board_description, list_id, list_name, card_id, card_name, card_details FROM BOARDS BD inner join LISTS LT ON BD.board_id = LT.board_id left join CARDS CD BD.board_id = CD.board_id where ")
  List<BoardDto> getList(Integer boardId);
  /**
   * ボード情報の取得
   * 
   * @param boardId ボード番号
   * @return ボード情報
   */
  @Select("SELECT * FROM boards WHERE board_id = #{boardId} ")
  List<BoardDto> getBoardInfo(Integer boardId);

  /**
   * リスト情報の取得
   * @param boardId ボード番号
   * @return リスト情報
   */
  @Select("SELECT * FROM LISTS WHERE board_id = #{boardId}")
  List<ListDto> getListInfo(Integer boardId);

  /**
   * カード情報の取得
   * @param boardId ボード番号
   * @return カード情報
   */
  @Select("SELECT card_id, card_name, card_details, delete_flg, deadline_start_date, deadline_end_date, create_user, created_day, update_user, update_day FROM CARDS WHERE list_id = #{listId} ")
  List<CardDto> getCardInfo(Integer boardId);

  /**
   * 進捗情報の取得
   * @param boardId ボード番号
   * @return 進捗情報
   */
  @Select("SELECT progress_id, progress_rate FROM PROGRESS WHERE board_id = #{boardId} ")
  List<ListDto> getprogressInfo(Integer boardId);

  /**
   * リスト作成
   */
  @Insert("INSERT INTO LIST (list_id, board_id, list_name, created_day, delete_flg, deadline_start_date, deadline_end_date) VALUES (serial, #{boardId}, #{list_name}, current_timestamp, #{deadline_start_date}, #{deadline_end_date})")
  boolean createList(Integer board_id, String list_name, Timestamp deadline_start_date, Timestamp deadline_end_date);
}
