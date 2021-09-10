package com.example.spring.demo.Facade;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.spring.demo.Common.MessageUtil;
import com.example.spring.demo.Dto.BoardDto;
import com.example.spring.demo.Dto.CardDto;
import com.example.spring.demo.Dto.ListDto;
import com.example.spring.demo.Service.ListService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

/**
 * @author sugiyama
 * 
 * List画面のFacadeクラス
 */
@RequiredArgsConstructor
@Service
public class ListFacade {
  private final ListService listService;

  @Autowired
  public ListFacade(ListService listService){
    this.listService = listService;
  }

  /**
   * ボードIDに紐づくデータ全て取得
   * 
   * @param boardId: ボードID
   * @return Map<String, Object>: ボードIDから紐づくデータ全て
   */
  public Map<String, Object> getListInfo(Integer boardId) {
    Map<String, Object> list = new HashMap<String, Object>();
    //該当データ全取得する
    List<BoardDto> boardInfo = listService.getBoardInfo(boardId);
    for (int i = 0; i < boardInfo.size(); i++) {
      list.put("list" + i, boardInfo.get(i));
    }
    List<ListDto> listInfo = listService.getListInfo(boardId);
    for (int i = 0; i < listInfo.size(); i++) {
      list.put("list" + i, listInfo.get(i));
    }
    List<CardDto> cardInfo = listService.getCardInfo(boardId);
    for (int i = 0; i < cardInfo.size(); i++) {
      list.put("card" + i, cardInfo.get(i));
    }
    return list;
  }  
}
