package com.example.spring.demo.Controller;

import java.security.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.spring.demo.Facade.ListFacade;
import com.example.spring.demo.Form.ListForm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.RequiredArgsConstructor;

/**
 * @author sugiyama
 * 
 * リスト画面のControllerクラス
 */
@RequiredArgsConstructor
@RestController
public class ListController {
  private final ListFacade listFacade;

  @Autowired
  public ListController(ListFacade listFacade){
    this.listFacade = listFacade;
  }

  @Bean
  public RestTemplate restTemplate() {
    return new RestTemplate();
}
 
  /**
   * 指定したボードの情報を取得する
   * 
   */
  @GetMapping("/api/v1/boards/{board_id}")
  public Map<String, Object> boardDetails(@PathVariable Integer board_id){
    board_id = 1;
    return listFacade.getListInfo(board_id);
  }

  /**
   * リストを作成する
   */
  @PostMapping("/api/v1/list")
  public Map<String, Object> createList(@PathVariable Integer board_id, String list_name, Timestamp deadline_start_date, Timestamp deadline_end_date){
    Map<String, Object> map = new HashMap<String, Object>();
    listFacade.createList(board_id, list_name, deadline_start_date, deadline_end_date);
    return map;
  }

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
  @GetMapping("/api/v1/update/list")
  public Map<String, Object> updateList(@PathVariable Integer listId, Integer boardId, String listName, Timestamp deadlineStartDate, Timestamp deadlineEndDate){
    Map<String, Object> map = new HashMap<String, Object>();
    listFacade.updateList(listId, boardId, listName, deadlineStartDate, deadlineEndDate);
    return map;
  }

  /**
   * リストを削除する
   */  
  @GetMapping("/api/v1/delete/list")
  public Map<String, Object> deleteList(Integer listId, Integer boardId){
    Map<String, Object> map = new HashMap<String, Object>();
    listFacade.deleteList(listId, boardId);
    return map;
  }

  /**
   * カードを作成する
   */
  @PostMapping("/api/v1/cards")
  public Map<String, Object> createCard(ListForm form){
    Map<String, Object> map = new HashMap<String, Object>();
    return map;
  }

  /**
   * カードを削除する
   */
  @PostMapping("/api/v1/delete/cards")
  public Map<String, Object> deleteCard(ListForm form){
    Map<String, Object> map = new HashMap<String, Object>();
    return map;
  }

  /**
   * カードを更新する
   */
  @PostMapping("/api/v1/update/cards")
  public Map<String, Object> updateCard(ListForm form){
    Map<String, Object> map = new HashMap<String, Object>();
    return map;
  }
}
