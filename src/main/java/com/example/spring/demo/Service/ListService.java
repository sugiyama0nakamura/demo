package com.example.spring.demo.Service;

import java.security.Timestamp;
import java.util.Collection;
import java.util.List;

import com.example.spring.demo.Dto.BoardDto;
import com.example.spring.demo.Dto.CardDto;
import com.example.spring.demo.Dto.ListDto;
import com.example.spring.demo.Repository.ListMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

/**
 * @author sugiyama
 * 
 * List画面のServiceクラス
 */
@RequiredArgsConstructor
@Service
public class ListService {
  private final ListMapper listMapper;

  @Autowired
  public ListService(ListMapper listMapper){
    this.listMapper = listMapper;
  }

  /**
   * ボード情報取得
   * 
   * @param boardId ボードID
   * @return ボード情報
   */
  public List<BoardDto> getBoardInfo(Integer board_id) {
    return listMapper.getBoardInfo(board_id);
  }
  
  /**
   * リスト情報取得
   * 
   * @param boardId ボードID
   * @return リスト情報
   */
  public List<ListDto> getListInfo(Integer boardId) {
    return listMapper.getListInfo(boardId);
  }
  
  /**
   * カード情報取得
   * 
   * @param boardId ボードID
   * @return カード情報
   */
  public List<CardDto> getCardInfo(Integer boardId) {
    return listMapper.getCardInfo(boardId);
  }
  
  /**
   * 進捗情報取得
   * 
   * @param boardId ボードID
   * @return　進捗情報
   */
  public List<ListDto> getprogressInfo(Integer boardId) {
    return listMapper.getprogressInfo(boardId);
  }

  /**
   * リスト作成
   * 
   * @param board_id ボードID
   * @param list_name リスト名
   * @param deadline_start_date 開始日付
   * @param deadline_end_date 締め切り日付
   * @return true: リスト作成の正常処理, false: リスト作成の異常処理
   */
  public boolean createList(Integer board_id, String list_name, Timestamp deadline_start_date, Timestamp deadline_end_date) {
    if(!listMapper.createList(board_id, list_name, deadline_start_date, deadline_end_date)){
      return false;
    }
    return true;
  }

  
}
