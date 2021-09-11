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
import org.apache.ibatis.annotations.Update;

/**
 * @author @sugiyama
 * 
 * List画面のMapperクラス
 */
@Mapper
public interface ListMapper {

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
   * 
   * @param boardId ボード番号
   * @param listName リスト名
   * @param deadlineStartDate 開始日
   * @param deadlineEndDate 終了日
   * @return
   */
  @Insert("INSERT INTO LIST (list_id, user_id, board_id, list_name, create_user, created_day, delete_flg, deadline_start_date, deadline_end_date) VALUES (serial, null, #{boardId}, #{listName}, null, current_timestamp, 0, #{deadlineStartDate}, #{deadlineEndDate})")
  boolean createList(Integer boardId, String listName, Timestamp deadlineStartDate, Timestamp deadlineEndDate);

  /**
   * リスト更新
   * 
   * @param list_id リスト番号
   * @param board_id ボード番号
   * @param list_name リスト名
   * @param deadline_start_date 開始日
   * @param deadline_end_date 終了日
   * @return
   */
  @Update("UPDATE LISTS SET list_name = #{listName}, update_user = null, update_day =  current_timestamp, deadline_start_date = #{deadlineStartDate}, deadline_end_date = #{deadlineEndDate} where list_id = #{listId} and board_id = #{boardId}")
  boolean updateList(Integer listId, Integer boardId, String listName, Timestamp deadlineStartDate, Timestamp deadlineEndDate);
  
  /**
   * リスト削除
   * 
   * @param listId リスト番号
   * @param boardId ボード番号
   * @return
   */
  @Update("UPDATE LISTS SET delete_flg = 1, update_user = null, update_day = current_timestamp where list_id = #{listId} and board_id = #{boardId}")
  boolean deleteList(Integer listId, Integer boardId);
}
